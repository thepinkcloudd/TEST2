package com.thepinkclouddAndDenislam511.Window;

import com.thepinkclouddAndDenislam511.Model.CreditModel;
import org.decimal4j.util.DoubleRounder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorWindow extends JFrame {
    Container container;
    public CalculatorWindow(){
        super("\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0439 \u043A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440 \u043F\u043E\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043B\u044C\u0441\u043A\u0438\u0445 \u043A\u0440\u0435\u0434\u0438\u0442\u043E\u0432");
        super.setBounds(200,200,600,600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         container = super.getContentPane();
    }
    private void initContainer(){
        CalculatorElements.initializeElements();
        container.setLayout(new GridLayout(7,3,10,10));
        container.add(CalculatorElements.inputSum);
        container.add(CalculatorElements.inputSumField);
        container.add(CalculatorElements.inputPercentage);
        container.add(CalculatorElements.inputPercentageField);
        container.add(CalculatorElements.creditTerm);
        container.add(CalculatorElements.inputCreditTermField);
        container.add(CalculatorElements.monthlyPayment);
        container.add(CalculatorElements.monthlyPayment_text);
        container.add(CalculatorElements.creditOverpayment);
        container.add(CalculatorElements.creditOverpayment_text);
        container.add(CalculatorElements.creditTotal);
        container.add(CalculatorElements.creditTotal_text);
        container.add(CalculatorElements.submitButton);
        container.add(CalculatorElements.exitButton);

        CalculatorElements.exitButton.addActionListener(new closeButtonEvent());
        CalculatorElements.submitButton.addActionListener(new submitButtonEvent());
    }
    public void start(){
        initContainer();
        this.setVisible(true);
    }

    public void ThrowErrorWindowAndCleanUp(){
        JOptionPane.showMessageDialog(this,"\u041F\u0440\u043E\u0432\u0435\u0440\u044C\u0442\u0435 \u043A\u043E\u0440\u0440\u0435\u043A\u0442\u043D\u043E\u0441\u0442\u044C \u0432\u0432\u0435\u0434\u0435\u043D\u043D\u044B\u0445 \u0434\u0430\u043D\u043D\u044B\u0445!",
                "\u0412\u0432\u0435\u0434\u0435\u043D\u044B \u043D\u0435\u043A\u043E\u0440\u0440\u0435\u043A\u0442\u043D\u044B\u0435 \u0434\u0430\u043D\u043D\u044B\u0435!",
                JOptionPane.ERROR_MESSAGE);
        CalculatorElements.inputSumField.setText("");
        CalculatorElements.inputPercentageField.setText("");
        CalculatorElements.inputCreditTermField.setText("");
        CalculatorElements.creditTotal_text.setText("0 \u0440\u0443\u0431.");
        CalculatorElements.creditOverpayment_text.setText("0 \u0440\u0443\u0431.");
        CalculatorElements.monthlyPayment_text.setText("0 \u0440\u0443\u0431.");
    }
    class closeButtonEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    class submitButtonEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            CreditModel credit;
            double creditSum = 0D, creditPercentage = 0D;
            int creditTerm = 0;
            try{
                creditSum = Double.parseDouble(CalculatorElements.inputSumField.getText());
                creditPercentage = Double.parseDouble(CalculatorElements.inputPercentageField.getText());
                creditTerm = Integer.parseInt(CalculatorElements.inputCreditTermField.getText());
            }
            catch (Exception exception){
                ThrowErrorWindowAndCleanUp();
                return;
            }
            if(creditSum>0&&creditPercentage>0&&creditTerm>0){
                credit = new CreditModel(creditSum,creditPercentage,creditTerm);
                if(credit.isApprowed()) {
                    CalculatorElements.monthlyPayment_text.setText(DoubleRounder.round(credit.getMonthlyPayment(),2) + " \u0440\u0443\u0431.");
                    CalculatorElements.creditOverpayment_text.setText(DoubleRounder.round(credit.getCreditOverpayment(),2) + " \u0440\u0443\u0431.");
                    CalculatorElements.creditTotal_text.setText(DoubleRounder.round(credit.getCreditTotal(),2)+ " \u0440\u0443\u0431.");

                }
            }
            else {
                ThrowErrorWindowAndCleanUp();
            }
        }
    }
}




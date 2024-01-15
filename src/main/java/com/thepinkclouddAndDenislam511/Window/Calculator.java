package com.thepinkclouddAndDenislam511.Window;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Container container;
    public Calculator(){
        super("Кредитный калькулятор потребительских кредитов.");
        super.setBounds(200,200,600,600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         container = super.getContentPane();
    }
    private void initContainer(){
        CalculatorElements.initializeElements();
        container.setLayout(new GridLayout(8,3,10,10));
        container.add(CalculatorElements.inputSum);
        container.add(CalculatorElements.inputSumField);
        container.add(CalculatorElements.inputPercentage);
        container.add(CalculatorElements.inputPercentageField);
        container.add(CalculatorElements.creditTerm);
        container.add(CalculatorElements.inputCreditTermField);
        container.add(CalculatorElements.monthlyPayment);
        container.add(CalculatorElements.creditOverpayment_text);
        container.add(CalculatorElements.creditAmount);
        container.add(CalculatorElements.creditAmount_text);
        container.add(CalculatorElements.creditOverpayment);
        container.add(CalculatorElements.creditOverpayment_text);
        container.add(CalculatorElements.creditTotal);
        container.add(CalculatorElements.creditTotal_text);
        container.add(CalculatorElements.submitButton);
    }
    public void start(){
        initContainer();
        this.setVisible(true);
    }
}

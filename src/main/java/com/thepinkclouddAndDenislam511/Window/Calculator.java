package com.thepinkclouddAndDenislam511.Window;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Container container;
    public Calculator(){
        super("\u041A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0439 \u043A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440 \u043F\u043E\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043B\u044C\u0441\u043A\u0438\u0445 \u043A\u0440\u0435\u0434\u0438\u0442\u043E\u0432.");
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
        container.add(CalculatorElements.monthlyPayment_text);
        container.add(CalculatorElements.creditAmount);
        container.add(CalculatorElements.creditAmount_text);
        container.add(CalculatorElements.creditOverpayment);
        container.add(CalculatorElements.creditOverpayment_text);
        container.add(CalculatorElements.creditTotal);
        container.add(CalculatorElements.creditTotal_text);
        container.add(CalculatorElements.submitButton);
        container.add(CalculatorElements.exitButton);
    }
    public void start(){
        initContainer();
        this.setVisible(true);
    }
}

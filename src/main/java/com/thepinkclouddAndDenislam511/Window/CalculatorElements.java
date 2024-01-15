package com.thepinkclouddAndDenislam511.Window;

import javax.swing.*;

public class CalculatorElements {
    public static JLabel inputSum, inputPercentage, creditTerm, monthlyPayment,
            creditAmount, creditOverpayment, creditTotal;
    public static JTextField inputSumField, inputPercentageField, inputCreditTermField,
            monthlyPayment_text,creditAmount_text, creditOverpayment_text, creditTotal_text;
    public static JButton submitButton;

    public static void initializeElements(){
        inputSum = new JLabel("Желаемая сумма кредита");
        inputPercentage = new JLabel("Ставка %");
        creditTerm = new JLabel("Срок кредита");
        monthlyPayment = new JLabel("Ежемесячный платеж");
        creditAmount = new JLabel("Сумма кредита");
        creditOverpayment = new JLabel("Переплата");
        creditTotal = new JLabel("Общая сумма займа");

        inputSumField = new JTextField(2);
        inputPercentageField = new JTextField(2);
        inputCreditTermField = new JTextField(2);

        monthlyPayment_text = new JTextField("0 руб.",2);
        monthlyPayment_text.setFocusable(false);
        creditAmount_text = new JTextField("0 руб.",2);
        creditAmount_text.setFocusable(false);
        creditOverpayment_text = new JTextField("0 руб.",2);
        creditOverpayment_text.setFocusable(false);
        creditTotal_text = new JTextField("0 руб.",2);
        creditTotal_text.setFocusable(false);

        submitButton = new JButton("Рассчитать");

    }
}

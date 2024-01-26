package com.thepinkclouddAndDenislam511.Window;

import javax.swing.*;

public class CalculatorElements {
    public static JLabel inputSum, inputPercentage, creditTerm, monthlyPayment, creditOverpayment, creditTotal;
    public static JTextField inputSumField, inputPercentageField, inputCreditTermField,
            monthlyPayment_text, creditOverpayment_text, creditTotal_text;
    public static JButton submitButton, exitButton;

    public static void initializeElements(){
        inputSum = new JLabel("\u0416\u0435\u043B\u0430\u0435\u043C\u0430\u044F \u0441\u0443\u043C\u043C\u0430 \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
        inputSum.setHorizontalAlignment(JLabel.CENTER);
        inputPercentage = new JLabel("\u0421\u0442\u0430\u0432\u043A\u0430 %");
        inputPercentage.setHorizontalAlignment(JLabel.CENTER);
        creditTerm = new JLabel("\u0421\u0440\u043E\u043A \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
        creditTerm.setHorizontalAlignment(JLabel.CENTER);
        monthlyPayment = new JLabel("\u0415\u0436\u0435\u043C\u0435\u0441\u044F\u0447\u043D\u044B\u0439 \u043F\u043B\u0430\u0442\u0435\u0436");
        monthlyPayment.setHorizontalAlignment(JLabel.CENTER);
        creditOverpayment = new JLabel("\u041F\u0435\u0440\u0435\u043F\u043B\u0430\u0442\u0430");
        creditOverpayment.setHorizontalAlignment(JLabel.CENTER);
        creditTotal = new JLabel("\u041E\u0431\u0449\u0430\u044F \u0441\u0443\u043C\u043C\u0430 \u0437\u0430\u0439\u043C\u0430");
        creditTotal.setHorizontalAlignment(JLabel.CENTER);

        inputSumField = new JTextField(2);
        inputPercentageField = new JTextField(2);
        inputCreditTermField = new JTextField(2);

        monthlyPayment_text = new JTextField("0 \u0440\u0443\u0431.",2);
        monthlyPayment_text.setFocusable(false);
        creditOverpayment_text = new JTextField("0 \u0440\u0443\u0431.",2);
        creditOverpayment_text.setFocusable(false);
        creditTotal_text = new JTextField("0 \u0440\u0443\u0431.",2);
        creditTotal_text.setFocusable(false);

        submitButton = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
        exitButton = new JButton("\u0417\u0430\u043A\u0440\u044B\u0442\u044C");

    }
}

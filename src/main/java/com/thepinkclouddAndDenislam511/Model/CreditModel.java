package com.thepinkclouddAndDenislam511.Model;
import javax.annotation.Nullable;
import java.math.BigDecimal;

public class CreditModel {
    private double creditSum;
    private int creditPercentage;
    private int creditTerm;
    @Nullable
    private double monthlyPayment;

    public double getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(double creditSum) {
        this.creditSum = creditSum;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getCreditOverpayment() {
        return creditOverpayment;
    }

    public void setCreditOverpayment(double creditOverpayment) {
        this.creditOverpayment = creditOverpayment;
    }

    public double getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(double creditTotal) {
        this.creditTotal = creditTotal;
    }

    public boolean isApprowed() {
        return approwed;
    }

    public void setApprowed(boolean approwed) {
        this.approwed = approwed;
    }

    @Nullable
    private double creditOverpayment;
    @Nullable
    private double creditTotal;
    private boolean approwed;
    public CreditModel(double _sum, int _percentage, int _term){
        creditSum = _sum;
        creditPercentage = _percentage;
        creditTerm = _term;
        approwed = false;
        calculateCredit();
    }
    private void validateInput(){
        if(creditPercentage<=0 && creditPercentage>=66){
            approwed = false;
            return;
        }
        approwed = true;

    }
    public void calculateCredit(){
        validateInput();
        if(approwed){
            double monthlyInterestRate =  (double) creditPercentage/12/100;
            monthlyPayment = (creditSum * monthlyInterestRate) /
                        (1 - Math.pow(1 + monthlyInterestRate, -creditTerm));
            creditTotal = monthlyPayment*creditTerm;
            creditOverpayment = creditTotal-creditSum;
        }
    }
}

package com.thepinkclouddAndDenislam511_Test;

import com.thepinkclouddAndDenislam511.Model.CreditModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditModelTest {
    @Test
    void calculateCredit_invalidInput_test(){
        CreditModel creditModel =new CreditModel(-1,-1,-1);
        creditModel.calculateCredit();
        Assertions.assertFalse(creditModel.isApprowed());
    }


}

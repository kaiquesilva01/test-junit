package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

public class FinancingTests {
//Financing(Double totalAmount, Double income, Integer months)
//Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente

    @Test
    public void constructorShouldCreateObjectWhenValidData() {

        Financing f = FinancingFactory.createTrueFinancing();
        Assertions.assertEquals(100000.0,f.getTotalAmount());
        Assertions.assertEquals(2000.0,f.getIncome());
        Assertions.assertEquals(80,f.getMonths());
    }

    @Test
    public void constructorShouldIllegalArgumentExceptionWhenNotValidData() {

        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            Financing f = FinancingFactory.createFalseFinancing();
        });
    }

    @Test
    public void setTotalAmountShouldSetValueWhenValidData() {

        Financing f = FinancingFactory.createTrueFinancing();
        f.setTotalAmount(90000.0);
        Assertions.assertEquals(90000.0,f.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldIllegalArgumentExceptionWhenNotValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.createTrueFinancing();
            f.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetValueWhenValidData() {
        Financing f = FinancingFactory.createTrueFinancing();
        f.setIncome(2100.0);
        Assertions.assertEquals(2100,f.getIncome());
    }

    @Test
    public void setIncomeShouldIllegalArgumentExceptionWhenNotValidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.createTrueFinancing();
            f.setIncome(1900.0);
        });
    }
}

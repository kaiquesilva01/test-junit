package tests.factory;

import entities.Financing;

public class FinancingFactory {

    public static Financing createTrueFinancing() {
        return new Financing(100000.00,2000.00,80);
    }

    public static Financing createFalseFinancing() {
        return new Financing(100000.00,2000.00,20);
    }
}

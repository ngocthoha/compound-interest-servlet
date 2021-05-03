package main.java;

public class Utils {
    public static double calculatorCompoundInterest(double principal, double interest, int years, int compoundingPeriod) {
        return principal * Math.pow((1 + (interest / compoundingPeriod)), (compoundingPeriod * years));
    }
}

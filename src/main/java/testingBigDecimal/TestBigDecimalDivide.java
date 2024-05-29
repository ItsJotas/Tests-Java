package testingBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimalDivide {

    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(10);
        BigDecimal value2 = BigDecimal.valueOf(5);

        BigDecimal result = value1.divide(value2);

        System.out.println("Result = " + result);
    }
}

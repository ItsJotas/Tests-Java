package testingBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimalSubtract {
    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(10);
        BigDecimal value2 = BigDecimal.valueOf(5);

        BigDecimal result1 = value1.subtract(value2);
        BigDecimal result2 = value2.subtract(value1);

        System.out.println("Result1 : " + result1);
        System.out.println("Result2 : " + result2);
    }
}

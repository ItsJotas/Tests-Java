package testingBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimalTruncate {
    public static void main(String[] args) {
        BigDecimal testValue1 = BigDecimal.valueOf(10.5781653);
        testValue1 = testValue1.setScale(0, RoundingMode.DOWN);

        BigDecimal testValue2 = testValue1.setScale(4, RoundingMode.UP);
        BigDecimal testValue3 = testValue1.setScale(4, RoundingMode.CEILING);
        BigDecimal testValue4 = testValue1.setScale(4, RoundingMode.FLOOR);

        BigDecimal testValue5 = testValue1.setScale(5, RoundingMode.HALF_DOWN);
        BigDecimal testValue6 = testValue1.setScale(5, RoundingMode.HALF_UP);
        BigDecimal testValue7 = testValue1.setScale(5, RoundingMode.HALF_EVEN);

        System.out.println("Test value 1: " + testValue1);
        System.out.println("Test value 2: " + testValue2);
        System.out.println("Test value 3: " + testValue3);
        System.out.println("Test value 4: " + testValue4);
        System.out.println("Test value 5: " + testValue5);
        System.out.println("Test value 6: " + testValue6);
        System.out.println("Test value 7: " + testValue7);
    }
}

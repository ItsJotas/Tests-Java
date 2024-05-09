package testingBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimalToCompare {

    public static void main(String[] args) {
        BigDecimal bigDecimalTest1 = new BigDecimal(10);
        BigDecimal bigDecimalTest2 = new BigDecimal(10.5);

        Integer result1 = bigDecimalTest1.compareTo(bigDecimalTest2);
        Integer result2 = bigDecimalTest2.compareTo(bigDecimalTest1);
        Integer result3 = bigDecimalTest1.compareTo(bigDecimalTest1);

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}

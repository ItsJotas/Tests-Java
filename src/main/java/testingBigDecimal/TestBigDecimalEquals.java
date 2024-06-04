package testingBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimalEquals {

    public static void main(String[] args) {

        BigDecimal value1 = BigDecimal.valueOf(10.5);
        BigDecimal value2 = BigDecimal.valueOf(10.5);
        BigDecimal value3 = BigDecimal.valueOf(5);

        System.out.println("Compare value1 and value2 using '==' : " + (value1 == value2));
        System.out.println("Compare value2 and value3 using '==' : " + (value2 == value3));
        System.out.println("Compare value1 and value2 using '.equals' : " + (value1.equals(value2)));
        System.out.println("Compare value2 and value3 using '.equals' : " + (value2.equals(value3)));
    }

}

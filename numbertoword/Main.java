package numbertoword;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //Initialize the class which contains the method that converts the number to word.
        NumberToWordsConverter converter = new NumberToWordsConverter();

        BigDecimal testValue = new BigDecimal("145.350");
        System.out.println("In Words: " + converter.convert(testValue));

        BigDecimal testValue2 = new BigDecimal("-010000010.01056");
        System.out.println("In Words: " + converter.convert(testValue2));
    }
}

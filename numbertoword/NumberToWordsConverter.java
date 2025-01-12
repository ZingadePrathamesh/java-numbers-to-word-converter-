package numbertoword;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class NumberToWordsConverter {

    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] powers = {
            "", "Thousand", "Million", "Billion", "Trillion"
    };

    private static final String ZERO = "Zero";
    private static final String POINT = " Point";
    private static final String NEGATIVE = "Negative ";

    public String convert(BigDecimal number) {
        if (number == null) {
            return "Invalid Input";
        }

        // Check for negative sign
        boolean isNegative = number.signum() < 0;

        // Split the number into whole and fractional parts
        BigDecimal[] parts = number.abs().divideAndRemainder(BigDecimal.ONE);
        int wholePart = parts[0].intValue(); // Get the integer part
        String fractionalPartStr = parts[1].toPlainString().substring(2); // Get the fractional part as a string

        // Convert whole part to words
        StringBuilder result = new StringBuilder();
        if (isNegative) {
            result.append(NEGATIVE);
        }
        result.append(convertWholeNumberToWords(wholePart));

        // Convert fractional part to words
        if (!fractionalPartStr.isEmpty()) {
            result.append(POINT);
            for (char digit : fractionalPartStr.toCharArray()) {
                int digitValue = Character.getNumericValue(digit);
                result.append(" ").append(digitValue == 0 ? "Zero" : units[digitValue]);
            }
        }

        return result.toString().trim();
    }

    private static String convertWholeNumberToWords(int number) {
        if (number == 0) {
            return ZERO;
        }

        StringBuilder words = new StringBuilder();
        int power = 0;

        while (number > 0) {
            int chunk = number % 1000;

            if (chunk > 0) {
                String chunkWords = convertChunk(chunk);
                if (power > 0) {
                    words.insert(0, powers[power] + " ");
                }
                words.insert(0, chunkWords + " ");
            }

            number /= 1000;
            power++;
        }

        return words.toString().trim();
    }

    private static String convertChunk(int number) {
        String chunkWords;

        if (number < 20) {
            chunkWords = units[number];
        } else if (number < 100) {
            chunkWords = tens[number / 10] + (number % 10 > 0 ? " " + units[number % 10] : "");
        } else {
            chunkWords = units[number / 100] + " Hundred"
                    + (number % 100 > 0 ? " " + convertChunk(number % 100) : "");
        }

        return chunkWords;
    }
}

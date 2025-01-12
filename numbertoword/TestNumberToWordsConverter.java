package numbertoword;

import java.math.BigDecimal;

public class TestNumberToWordsConverter {
    public static void main(String[] args) {
        NumberToWordsConverter converter = new NumberToWordsConverter();

        // Test cases
        BigDecimal[] testCases = {
                null,                                      // Invalid input
                BigDecimal.ZERO,                          // Zero
                new BigDecimal("-0.0"),                   // Negative zero
                new BigDecimal("0.001"),                  // Small positive fraction
                new BigDecimal("-0.001"),                 // Small negative fraction
                new BigDecimal("1.0"),                    // Simple whole number
                new BigDecimal("-1.0"),                   // Negative whole number
                new BigDecimal("1000"),                   // Thousand
                new BigDecimal("1000000"),                // Million
                new BigDecimal("1234567.890"),            // Complex number
                new BigDecimal("-1234567890.98765"),      // Large negative number
                new BigDecimal("999999999.999"),          // Maximum billion with decimals
                new BigDecimal("1000000000"),             // One billion
                new BigDecimal("1000000000000.01"),       // One trillion with fraction
                new BigDecimal("-9876543210987.012345"),  // Large negative trillions with fraction
                new BigDecimal("0.0000001"),              // Very small fraction
                new BigDecimal("999999999999999.999999")  // Near limit for precision
        };

        // Run each test case and print the output
        for (BigDecimal testCase : testCases) {
            try {
                String result = converter.convert(testCase);
                System.out.println("Input: " + testCase + " -> Output: " + result);
            } catch (Exception e) {
                System.out.println("Input: " + testCase + " -> Exception: " + e.getMessage());
            }
        }
    }
}

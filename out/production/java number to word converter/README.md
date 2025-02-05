# Number to Word Converter

This repository contains a Java-based utility for converting numeric values into their English word representations. Whether you need to convert a small number, a large number with millions and billions, or even a number with decimal places, this utility has you covered.

---

## Features

- **Whole Number Conversion**: Supports numbers from 0 to trillions.
- **Decimal Support**: Accurately converts fractional parts of numbers (e.g., `123.45` becomes `One Hundred Twenty-Three Point Four Five`).
- **Readable Code**: Written with clean and modular methods for easy understanding and extension.
- **Customizable**: Can be easily modified to support additional languages or features.

---

## Example Usage

Here’s how you can use the `NumberToWordsConverter` class in your Java application:

```java
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        NumberToWordsConverter converter = new NumberToWordsConverter();

        BigDecimal testValue = new BigDecimal("145.35");
        System.out.println("In Words: " + converter.convert(testValue));

        BigDecimal testValue2 = new BigDecimal("1000001.01");
        System.out.println("In Words: " + converter.convert(testValue2));
    }
}
```

**Output:**
```
In Words: One Hundred Forty-Five Point Three Five
In Words: One Million One Thousand One Point Zero One
```

---

## Use Cases

- **Financial Applications**: Generate check amounts in words.
- **Invoicing Systems**: Provide a textual representation of invoice totals.
- **Educational Tools**: Help learners understand numbers and their word equivalents.
- **Voice Interfaces**: Convert numbers to words for audio outputs in smart applications.

---

## How to Contribute

We’re always looking for contributors to make this utility even better. Here are some ways you can contribute:

1. **Fix Bugs**: If you encounter a bug, feel free to submit a pull request with the fix.
2. **Add Features**: Enhance the converter to support more features like additional languages, currencies, or number formats.
3. **Improve Documentation**: Help make the documentation clearer or add examples.
4. **Optimize Code**: Refactor the existing code to improve performance or readability.

---

## How to Get Started

1. Fork this repository.
2. Clone your fork to your local machine:
   ```bash
   git clone https://github.com/your-username/number-to-word-converter.git
   ```
3. Create a new branch for your changes:
   ```bash
   git checkout -b feature-branch-name
   ```
4. Make your changes and commit them:
   ```bash
   git commit -m "Description of changes"
   ```
5. Push your changes to your fork:
   ```bash
   git push origin feature-branch-name
   ```
6. Open a pull request to this repository.

---

## Issues

If you encounter any issues or have suggestions for improvements, please open an issue on the [GitHub issues page](#).

---

## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute this project as you see fit.

---

## Acknowledgments

Thank you for using the Number to Word Converter. Your contributions and feedback are what keep this project thriving. Let’s make number conversion easier for everyone!


# Armstrong Number Checker

## Overview

This Java program checks if a given number is an Armstrong number. An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. The user is prompted to enter a number, and the program determines whether it is an Armstrong number.

## How It Works

- The user is prompted to input a number (`sayi`).
- The **original value** of the number is stored (`orijinalSayi`) for comparison later.
- The **number of digits** is determined by converting the number to a string and calculating its length.
- The program calculates the **sum of each digit raised to the power of the number of digits** using a `while` loop and a `for` loop for exponentiation.
  - The last digit is obtained using modulo operation (`% 10`), and it is then raised to the power of the total number of digits.
  - The result of this operation is added to the cumulative sum (`toplam`), and the number is divided by `10` to proceed to the next digit.
- Finally, the program compares the calculated sum (`toplam`) to the original number (`orijinalSayi`):
  - If they are equal, the number is an **Armstrong number**.
  - If they are not equal, the number is **not an Armstrong number**.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter a number when prompted, and the program will determine if it is an Armstrong number.

## Example Output

```
Bir sayı girin: 
153
153 bir Armstrong sayısıdır.
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.

package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit1 = number % 10; // Extract the ones digit
        int digit2 = (number / 10) % 10; // Extract the tens digit
        int digit3 = number / 100; // Extract the hundreds digit

        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3; // Reconstruct the number in reverse order

        System.out.println(reversedNumber); // Print the reversed number
    }

}

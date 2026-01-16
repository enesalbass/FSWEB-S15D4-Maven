package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.Stack;

public class Main {

    // Palindrom kontrolü
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        String cleaned = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase(Locale.ENGLISH); // 🔥 KRİTİK SATIR

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    // Decimal -> Binary çevirme
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}

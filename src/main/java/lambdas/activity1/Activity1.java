package lambdas.activity1;

import java.util.function.Predicate;

public class Activity1 {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = str -> {
            String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
            return cleanedStr.equals(reversedStr);
        };

        String palindrome = "racecar";
        String notPalindrome = "hello";

        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome.test(palindrome));
        System.out.println("Is '" + notPalindrome + "' a palindrome? " + isPalindrome.test(notPalindrome));
    }
}

import java.io.*;
import java.util.*;
import java.math.*;

public class LambdaExp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            int condition = scan.nextInt();
            int number = scan.nextInt();

            switch (condition) {
                case 1 -> System.out.println(isOdd().check(number) ? "ODD" : "EVEN");
                case 2 -> System.out.println(isPrime().check(number) ? "PRIME" : "COMPOSITE");
                case 3 -> System.out.println(isPalindrome().check(number) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }

    interface PerformOperation {
        boolean check(int number);
    }

    static PerformOperation isOdd() {
        return number -> number % 2 != 0;
    }

    static PerformOperation isPrime() {
        return number -> BigInteger.valueOf(number).isProbablePrime(1);
    }

    static PerformOperation isPalindrome() {
        return number -> String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}

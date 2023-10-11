package LeetCode;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String strNumber = Integer.toString(x);
        String reversedNumber= reverseNumberString(strNumber);

        boolean isEqual = strNumber.equalsIgnoreCase(reversedNumber);
        return isEqual;

    }

    public static String reverseNumberString(String strNumber) {
        char[] charArray = strNumber.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left<right) {
            char aux = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = aux;

            left++;
            right--;
        }
        String reversedNumber = new String(charArray);
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

       System.out.println(isPalindrome(x));
        scan.close();
    }
}

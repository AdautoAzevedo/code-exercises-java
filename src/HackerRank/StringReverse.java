package HackerRank;

import java.util.Scanner;

public class StringReverse {

    public static void reverseString(String A) {
        char[] charArray = A.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left<right) {
            char aux = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = aux;

            left++;
            right--;
        }

        String reversed = new String(charArray);

        isPalindrome(A, reversed);
    }

    public static void isPalindrome(String A, String reversed) {
        boolean isEqual = A.equalsIgnoreCase(reversed);

        if (isEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        reverseString(A);
        sc.close();
    }
}

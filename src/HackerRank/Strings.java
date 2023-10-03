import java.util.Scanner;

public class Strings {
    public static void checkLength(String a, String b) {
        int lengthOfA = a.length();
        int lengthOfB = b.length();
        System.out.println(lengthOfA + lengthOfB);
    }
    public static void compareStrings(String A, String B) {
        int result = A.compareToIgnoreCase(B);
        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static String capitalize(String s) {
        String capitalized = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        return capitalized;
    }

    public static void printSameLine(String a, String b) {
        String A = capitalize(a);
        String B = capitalize(b);
        System.out.println(A + " " + B);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
      
        checkLength(A, B);
        compareStrings(A, B);
        printSameLine(A, B);

    }
}

package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);  

        } catch (InputMismatchException ie){
        System.out.println("java.util.InputMismatchException");

        } catch (ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

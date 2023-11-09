import java.util.Scanner;


public class ExceptionHandling {
    class NegativeOrZeroPowerException extends Exception {
        public NegativeOrZeroPowerException(String message) {
            super(message);
        }
    }
    
    class MyCalculator {
        public long power(int n, int p) throws NegativeOrZeroPowerException{
            if (n<0 || p<0) {
                throw new NegativeOrZeroPowerException("n or p should not be negative.");
            }
            
            if (n==0 && p==0) {
                throw new NegativeOrZeroPowerException("n and p should not be zero."); 
            }
            
            long result = (long) Math.pow(n, p);
            return result;
        }
    }
        
    
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner in = new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (NegativeOrZeroPowerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

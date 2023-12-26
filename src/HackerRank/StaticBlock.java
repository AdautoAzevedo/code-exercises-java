package HackerRank;
import java.util.Scanner;

public class StaticBlock {
    
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        int receivedB = scan.nextInt();
        int receivedH = scan.nextInt();

        if (receivedB <= 0 || receivedH <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            B = receivedB;
            H = receivedH;
            flag = true;
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }
}
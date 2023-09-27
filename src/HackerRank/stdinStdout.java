import java.util.*;

public class stdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please digit three nunmbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
}

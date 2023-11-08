package HackerRank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int x; //This will store the result of each part of the series
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                x = a;
                for (int k = 0; k <= j; k++) {
                    x = x + (int)Math.pow(2,k) * b;
                }
                System.out.println(x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

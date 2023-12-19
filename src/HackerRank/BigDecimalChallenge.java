package HackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BigDecimalChallenge {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            String number = sc.next();
            s[i]=number;
        }
        sc.close();
        s = Arrays.stream(s)
                .filter(Objects::nonNull)
                .toArray(String[]::new);
      
        Arrays.sort(s, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
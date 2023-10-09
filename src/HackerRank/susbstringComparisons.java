package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class susbstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        List<String> substrings = new ArrayList<>(); 
       
        for (int index = 0; index <= s.length() - k; index++) {
            String substring = s.substring(index, index+k);
            substrings.add(substring);
        }
       
        String smallest = Collections.min(substrings);
        String largest = Collections.max(substrings);
        
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

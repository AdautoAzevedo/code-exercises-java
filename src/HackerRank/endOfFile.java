package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String>();
        
        while (scan.hasNext()) {
            stringList.add(scan.nextLine());
        };
        int lines = stringList.size();
        for (int i = 0; i < lines; i++) {
            System.out.println((i+1) + " " + stringList.get(i) );
        }
      }
}

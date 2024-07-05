package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> charCountMapA = getCharCountMap(a.toLowerCase());
        Map<Character, Integer> charCountMapB = getCharCountMap(b.toLowerCase());

        return charCountMapA.equals(charCountMapB);
        
    }

    private static Map<Character, Integer> getCharCountMap(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }


    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

     }
}

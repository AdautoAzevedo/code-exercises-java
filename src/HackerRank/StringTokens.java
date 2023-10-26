package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
    public static void generateTokens(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(s);
        ArrayList<String> tokens = new ArrayList<>();
        findNumberOfWords(matcher);
        while (matcher.find()) {
            
            String word = matcher.group();
            tokens
        }
    }

    public static void findNumberOfWords( Matcher matcher) {
        int length = 0;
        while (matcher.find()) {
            length++;
        }
        System.out.println(length);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        generateTokens(s);
    }

}

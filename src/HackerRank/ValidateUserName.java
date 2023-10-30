package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateUserName {
    public static boolean regularExpression(String user) {
        String regexPattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(user);
        return matcher.matches();
    }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (regularExpression(userName)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

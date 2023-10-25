package LeetCode;

import java.util.regex.*;

public class RomanToInteger {

    public static int romanParse(String romanString) {
        int result = 0;
        //Check for subtractions
        Pattern pattern = Pattern.compile("IV|IX|XL|XC|CD|CM");
        Matcher matcher = pattern.matcher(romanString);

        while (matcher.find()) {
            String match = matcher.group();
            switch (match) {
                case "IV":
                    result+=4;
                    break;
                case "IX":
                    result+=9;
                    break;
                case "XL":
                    result+=40;
                    break;
                case "XC":
                    result+=90;
                    break;
                case "CD":
                    result+=400;
                    break;
                case "CM":
                    result+=900;
                    break;
                default:
                    break;
            }
        }
        //Remove the matched substrings
        String remaining = matcher.replaceAll("");
        //split string
        for (char c : remaining.toCharArray()) {
            switch (c) {
            case 'I':
                result+=1;
                break;
            case 'V':
                result+=5;
                break;
            case 'X':
                result+= 10;
                break;
            case 'L':
                result+= 50;
                break;
            case 'C':
                result+= 100;
                break;
            case 'D':
                result+= 500;
                break;
            case 'M':
                result+= 1000;
                break;
            default:
                break;
            }    
        }
        return result;   
    }
    public static void main(String[] args) {
        
        System.out.println(romanParse("MCMXCIV"));
    }
}

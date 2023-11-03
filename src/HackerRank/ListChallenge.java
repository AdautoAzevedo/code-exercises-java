package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int N = scan.nextInt();
        
        String[] integers = scan.nextLine().split(" ");
        for (String integerStr : integers) {
            int number = Integer.parseInt(integerStr);
            numbers.add(number);
        }
        int Q = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < Q; i++) {
            String query = scan.nextLine();
            switch (query) {
                case "Insert":
                    String[] insertParams = scan.nextLine().split(" ");
                    int x = Integer.parseInt(insertParams[0]);
                    int y = Integer.parseInt(insertParams[1]);
                    if (x >= 0 && x <= numbers.size()) {
                        numbers.add(x, y);
                    }
                    break;
                case "Delete":
                    int z = Integer.parseInt(scan.nextLine());
                    if (z >= 0 && z < numbers.size()) {
                        numbers.remove(z);
                    }
                    break;
                default:
                    break;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number+ " ");
        }
    }
}

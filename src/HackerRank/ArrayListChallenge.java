package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Read the number of lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();  // Initialize an ArrayList of ArrayLists

        // Read and store the lines
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        int q = scanner.nextInt();  // Read the number of queries

        // Process the queries and print the results
        for (int i = 0; i < q; i++) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            if (y >= 1 && y <= n && x >= 1 && x <= lines.get(y - 1).size()) {
                System.out.println(lines.get(y - 1).get(x - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

    }
}

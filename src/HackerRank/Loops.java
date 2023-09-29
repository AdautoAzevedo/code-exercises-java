package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {

    public static void loop(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " +(num*i));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        loop(N);

        bufferedReader.close();
    }
} 
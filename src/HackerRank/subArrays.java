package HackerRank;

import java.util.Scanner;

public class subArrays {
    public static void subArrayGenerator(int arr[]){
        int totalOfNegatives = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k]; 
                }
                if (sum<0) {
                    totalOfNegatives = totalOfNegatives + 1;
                }  
            }   
        }
        System.out.println(totalOfNegatives);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = scanner.nextInt();
        }

        subArrayGenerator(arr);
    }
}

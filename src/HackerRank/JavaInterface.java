package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
  }
  
class MyCalculator implements AdvancedArithmetic{
    List<Integer> divisorList = new ArrayList<>();
    int result;

    @Override
    public int divisor_sum(int n) {
        for (int index = 1; index <= n; index++) {
            if (n % index == 0) {
                divisorList.add(index);
            }
        }

        for (Integer integer : divisorList) {
            result += integer;
        }
        return result;
    }
}
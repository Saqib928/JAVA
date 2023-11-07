package BASICS_OF_JAVA.LOOP;

import java.util.Scanner;

public class ReverseNoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number you want to Reverse : ");
        int n = sc.nextInt();
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;

        }
        System.out.println();
        sc.close();

    }

}

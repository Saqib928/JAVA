package BASICS_OF_JAVA.LOOP;
import java.util.Scanner;
public class NumberSumWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value till print Sum of Natural Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of number till " + n +" is "+ sum);
        sc.close();

    }
}

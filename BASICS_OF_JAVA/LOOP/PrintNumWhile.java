package BASICS_OF_JAVA.LOOP;
import java.util.Scanner;
public class PrintNumWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter =1;
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        while(counter<=n){
            System.out.print(counter+  " ");
            counter++;
 }
 System.out.println();
    }

}

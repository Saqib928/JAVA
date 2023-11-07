package BASICS_OF_JAVA.LOOP;
import java.util.Scanner;
public class ReverseNo2While {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number need to Reverse : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            int lastDigit = n % 10;
            rev =(rev*10) + lastDigit;
            n=n/10; }
            System.out.println("Your Reverse Number is : " + rev);
     }
    
}

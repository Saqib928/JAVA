package Basic_Question_Practice;
import java.util.Scanner;
public class CheckLeapYear {
 public static void main(String[] args) {
    int y;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Year You Want to Check : ");
    y = sc.nextInt();
    if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
        System.out.println(y +" Is a Leap Year");
    }
    else{
        System.out.println(y + " Is not a Leap Year");
    }
    sc.close();
 }   
}
package BASICS_OF_JAVA.CONDITION;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter the Operator : ");
        char Operator = sc.next().charAt(0);
        switch (Operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;

        }
        sc.close();

    }
}

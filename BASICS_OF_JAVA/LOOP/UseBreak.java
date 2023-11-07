package BASICS_OF_JAVA.LOOP;
import java.util.Scanner;
public class UseBreak {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a Number (Remember mutiple of 10 terminate the Program) : ");
            int n = sc.nextInt();
            System.out.println(n);
            if(n%10==0){
                System.out.println("Program terminate you Enter multiple of 10 ");
                break;
            }
    }while(true);

    }
    
}

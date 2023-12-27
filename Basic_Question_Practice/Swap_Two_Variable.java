package Basic_Question_Practice;
import java.util.Scanner;
public class Swap_Two_Variable {
    public static void main(String[] args) {
        int a,b;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter The value of Two number : ");
        a = ref.nextInt();
        b = ref.nextInt();
        System.out.println("Number Before Swap "+ a + " "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Number After Swap  "+ a + " "+b);
         ref.close();
    }
   
}
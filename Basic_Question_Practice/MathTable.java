package Basic_Question_Practice;
import java.util.Scanner;
public class MathTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want Table : ");
        num = sc.nextInt();
        for(int i=1;i<=10;i++){
            int result = num*i;
            System.out.println(num+"*"+i+" = " +result);
        }
        sc.close();
    }
}

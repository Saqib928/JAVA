package Basic_Question_Practice;
import java.util.Scanner;
public class AlphabetCase {
    public static void main(String[] args) {
        char ch ,ch2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Alphabhet for change the Case : ");
    ch = sc.next().charAt(0);
    if(ch>='A' && ch<='Z'){
        ch2 = Character.toLowerCase(ch);
        System.out.println("Alphabhet After change the Case : "+ ch2);
    }
    else{
         ch2 = Character.toUpperCase(ch);
         System.out.println("Alphabhet After change the Case : "+ ch2);
    }
    sc.close();
    }
}

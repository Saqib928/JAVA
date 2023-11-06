package BASICS_OF_JAVA.CONDITION;
import java.util.Scanner;
public class TReportCard {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        String reportcard = (marks >=33) ? "PASS" : "FAIL";
        System.out.println(reportcard);



        sc.close();
 }
}

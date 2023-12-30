package BASICS_OF_JAVA.Function;
import java.util.Scanner;
public class Binomial {

  public static int facto(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }

  public static int binomial(int n, int r) {
   if(n<r){
    System.out.println("wrong input");
   }
    int bn = facto(n);
    int br = facto(r);
    int bmr = facto(n - r);
    int bino = bn / br * bmr;
    return bino;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    // System.out.println(facto(5));
    System.out.println(binomial(n, r));
     sc.close();
  }
 
}

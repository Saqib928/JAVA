package BASICS_OF_JAVA.Function;

import java.util.Scanner;

public class PrimeRange {

  public static boolean Isprime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
     
    }
    return true;
  }

  public static void range(int n) {
    for (int i = 2; i <= n; i++) {
      if (Isprime(i)) {
        System.out.print(i + " ");
      }
    }
    
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Isprime(n));
     range(n);
    sc.close();
  }
}

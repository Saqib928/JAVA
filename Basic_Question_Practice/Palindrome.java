package Basic_Question_Practice;

public class Palindrome {
  public static void check(int n){
    int num = 0;
    int c =n;
    while(n>0){
        int last = n%10;
        num = (num*10) + last;
        n/=10;
    }
    System.out.println(num);
    if (num==c){
        System.out.println("Is palindrome Number");
    }
    else{
        System.out.println("Not a Palindrome NUmber");
    }
  }
  public static void main(String[] args) {
    check(121);
  }
}

package BASICS_OF_JAVA.Function;

public class CheckPalindrone {
    public static void check(int n){
        int rev =0;
        int z =n;
        while(n>0){
            int digit = n % 10;
            rev = digit + rev * 10;
            n= n/10;}
            if(z==rev){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not palindrome");
            }
        System.out.println(rev);
    }
    public static void main(String args[]){
        check(1221);
    }
}

package BASICS_OF_JAVA.Function;

public class BinToDecimal {
    public static void bin(int n){
        int pow=0;
        int dec =0;
        
        while(n>0){
            int lastdigit = n % 10;
        dec = dec + (lastdigit*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
        }
       System.out.println(dec);
    }
    public static void main(String args[]){
        bin(1111);
    }
}

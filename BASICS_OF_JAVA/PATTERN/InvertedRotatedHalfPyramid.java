package BASICS_OF_JAVA.PATTERN;
public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = rows; i > 0; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

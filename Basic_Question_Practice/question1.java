package Basic_Question_Practice;

public class question1 {
    public static void main(String[] args) {
        float C = 7/4 * 9/2;
        System.out.println("Wrong answer because divisor type is int : "+ C);
        float B = 7/4.0f * 9/2.0f;
        System.out.println("Right Answer because divisor type is float and result store in float : "+B);
    }
}

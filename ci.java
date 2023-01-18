import java.util.Scanner;
import java.lang.Math;
public class ci {
    public static void main(String[] args) {
        int a = 10000;
        int b= 10;
        int c=2;
        double d = a*Math.pow((1+b/100),c);
        System.out.println("The output is"+d);
    }
}

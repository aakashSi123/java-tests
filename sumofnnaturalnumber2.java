
// java program to find the sum of n natural number 
import java.util.Scanner;

public class sumofnnaturalnumber2 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();

        for(int i=1;i<=a;i++)
        {
             sum= sum+i;
        }
        System.out.println(sum);
    }
}

//Java program to check whether the given integer is a multiple of both 5 and 7
import java.util.Scanner;
public class mulof57 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        a=sc.nextInt();

        if(a%5==0 && a%7==0)
        {
            System.out.println("The given number is the multiple of 5 & 7");

        }
        else
        {
            System.out.println("No its not");
        }
    }
}

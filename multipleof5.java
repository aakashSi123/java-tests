// java program to check whether the integer is multiple of  5 or not
import java.util.Scanner;
public class multipleof5 {
    public static void main(String[] args) {
        int a,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        a=sc.nextInt();

        if(a%5==0)
        {
            System.out.println("The given number is the multiple of 5");

        }
        else
        {
            System.out.println("No its not");
        }
    }
}

// java program to find the lcm of two numbers 
import java.util.Scanner;
public class lcmof2numbers {
    public static void main(String[] args) {
        System.out.println("Welcome to my program \n ");
        Scanner sc = new Scanner(System.in);
        int a,b,i,div=1,siv=1;

        System.out.println("Enter the first number:-    ");
        a=sc.nextInt();
        System.out.println("Enter the second number:-    ");
        b=sc.nextInt();

        if(a>b)
        {
            for(i=1;i<=a;i++)
            {
                div = a%i;
                siv=b%i;
                System.out.println(div);
                System.out.println(siv);
            }
            
        }

    }
}

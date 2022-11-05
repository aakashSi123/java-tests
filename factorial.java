// java program to find the factorial of a number
import java.util.Scanner;
public class factorial
 {      
    public static void main(String[] args) {
    System.out.println("Enter the number you want to find the factorial of ");
    Scanner sc = new Scanner(System.in);
    long a,c=1,i;

    a=sc.nextInt();
    for(i=1;i<=a;i++)
    {
        c= c*i;
    }
    System.out.println(c);
    }   
}

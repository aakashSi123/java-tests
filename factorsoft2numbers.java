// java program to find the factor of a number 
import java.util.Scanner;
class factorsoft2numbers{
    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to find the factors of ");
        Scanner sc= new Scanner(System.in);
        int a,i,b,j;
        a=sc.nextInt();
        b=sc.nextInt();
        // to find the factors of the first number 
        System.out.println("The factors of the first number are listed below");
        for(i=1,j=1;i<=a;j<=b,i++;j++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        } 

        // finding the factors of the second number
        System.out.println(" \n The factors of the Second number are listed below");
        for(j=1;j<=b;j++)
        {
            if(b%j==0)
            {
                System.out.println(j);
            }
        } 
    }
}
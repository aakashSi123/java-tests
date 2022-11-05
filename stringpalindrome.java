// java program to check whether the given string is palindrome or not
import java.util.Scanner;
public class stringpalindrome 
{
    public static void main(String[] args) {
        String a;
        System.out.println("Enter the String ");
        Scanner sc= new Scanner(System.in);
    
       a=sc.next(); 
        String rev = "";
       for(int i= a.length()-1; i>=0;i-- )
       {
        rev= rev+a.charAt(i);
       }
       System.out.println("The reverse form of the String is :-  "  +rev);

       if(rev.equals(a))
       {
        System.out.println("The given string is palindrome");

       }
       else{
        System.out.println("The given string is not a palindrome");
       }

    }



}

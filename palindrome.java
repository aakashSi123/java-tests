import java.util.Scanner;

class palindrome{
    public static void main(String args[])
    {
        int number,remainder=0,carry;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check the palindrome");
        number=sc.nextInt();
        
        carry=number;
        
        while(number>0)
        {
            remainder = (remainder*10)+ number%10;
            number=number/10;

        }

        if(remainder==carry)
        {
            System.out.println("The given number is palindrome");

        }
        else
        {
            System.out.println("Bhak bsdk wrong hai");
        }
    }
    
}
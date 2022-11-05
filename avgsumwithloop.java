// find the sum and average of above numbers using array.
// int [] number = {1,2,3,4,5,6,7,8,9}
import java.util.Scanner;
public class avgsumwithloop {
    public static void main(String[] args) {
        System.out.println("Your numbers are :-   1,2,3,4,5,6,7,8,9");
        int a,sum=0,i,avg;
        int[] abc = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("The total number in the number is " +abc.length);
        System.out.println("Enter 1 for sum of array and 2 for avg");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        switch(a)
          {
           case 1:
            System.out.println("Hey mate!! you choose for the sum of the series ");
             for(i=0;i<=abc.length;i++)
             {
                 sum=sum+i;
            }
            System.out.println("the sum of the series is " +sum);
            break;

        case 2:
         avg=sum/abc.length;
         System.out.println("Bachuwa average hai :- " +avg);
         break;
         default:
         System.out.println("Kabse keh rahe hai padhai likhai karo IAS WAIS bano lekin tum b** ");
          }
    }
}

// java program to find the number is even or odd in an array
// suppose we have natural number from 1 to 10 in an array then we have to find that which number is odd and even

import java.util.*;
import java.lang.Math;
public class array_even_odd 
{
   public static void main(String[] args) 
   {
        System.out.println(">>>>>>>>>>>>>         Nihao welcome to my program          <<<<<<<<<<<<<" );
        Scanner sc = new Scanner(System.in);
        int even_odd[]= {1,2,3,4,5,6,7,8,9,10};

       
        for(int i=0;i<even_odd.length;i++)
        {
            if(even_odd[i]%2 == 0)
            {
                System.out.println("in the list this is even"+ " " +even_odd[i]);
            }
            
            else
            {
                System.out.println("In the list this is odd " + even_odd[i]);
            }
        }


   }
}

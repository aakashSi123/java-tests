// java program to reverse a string
import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i =a.length();i>0;i--)  //suppose string is SAKSHI and have a length of 6 then
        {
            System.out.print(a.charAt(i-1));
        }
        System.out.println();

    }
}

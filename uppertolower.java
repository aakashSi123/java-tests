import java.util.Scanner;
public class uppertolower {
    public static void main(String[] args) {
        System.out.println("Enter the string :-");
        String a= new String();
        Scanner sc = new Scanner(System.in);
        a=sc.next();
     
        char[] arraychar = a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0)
            {
                
                System.out.print(Character.toUpperCase(a.charAt(i)));
            }
            else
            {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            }

        }


}
}
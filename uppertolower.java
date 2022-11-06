import java.util.Scanner;
public class uppertolower {
    public static void main(String[] args) {
        System.out.println("Enter the string :-");
        String a= new String();
        Scanner sc = new Scanner(System.in);
        a=sc.next();
        String b=new String();

        for(int i=0;i<a.length();i+=2)
        {
            for(int j=1;j<=a.length();j+=2)
            {
                System.out.println(a.substring(i,j).toUpperCase());
            }

        }
        
     
}
}
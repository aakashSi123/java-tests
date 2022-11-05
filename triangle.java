import java.util.Scanner;
public class triangle 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        a=sc.nextInt();
        System.out.println("Enter the Second side of triangle");
        b=sc.nextInt();
        System.out.println("Enter the Third side of triangle");
        c=sc.nextInt();

      if((a+b)>c && (b+c)>a && (c+a)>b)
      {
        double sub=(a+b+c)/2.0;
        double area=Math.sqrt(sub*(sub-a)*(sub-b)*(sub-c));
        System.out.println("The area of trianle is:-" +area);
      }
     
      else
      {
        System.out.println("The sides of the trianlges are not valid");

      }



    }
}

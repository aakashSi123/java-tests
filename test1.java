import java.util.Scanner;
import java.lang.Math;

class SI
{
    double si(double p, double t, double r)
    {
        double si_result= (p*t*r)/100;
        return si_result;
    }
}
class CI_METHOD
{
    double ci(double p,double t, double r)
    {
        double ci_result=p*(Math.pow(1+r/100 ,t)-1);
        return ci_result;
    }
}
public class test1 {

public static void main(String[] args) 
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Welcome to the program ");
    System.out.println("Enter the value of P");
    double a= sc.nextDouble();
    System.out.println("Enter the rate");
    double b= sc.nextDouble();
    System.out.println("Enter the time period");
    double c = sc.nextDouble();

    SI obj1= new SI();
    CI_METHOD obj2 = new CI_METHOD();

     System.out.printf("Your Calculated Compound Interest = %f \n Simple interest = %f  \n ", obj2.ci(a, c, b),obj1.si(a, c, b));
    
}

}

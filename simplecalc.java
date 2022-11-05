// this is the simple calculator program 
import java.util.Scanner;
public class simplecalc {
    public static void main(String[] args) {
        System.out.println("This calculator is based on the DMAS Rule so please enter operator in a series");
        int a,b,c;
        System.out.println("enter the values  :-");
        try (Scanner sc = new Scanner(System.in)) {
            a=sc.nextInt();
            b=sc.next().charAt(0);
            c=sc.nextInt();
            
        }
        switch(b)
        {
            case '+':
            System.out.println(a+c);
            break;

            case '-':
            System.out.print(a-c);
            break;

            case '/':
            System.out.println(a/c);
            break;

            case '*':
            System.out.println(a*c);
            break;

            default:
            System.out.println("Unkown operator entered !!!");
        }
    }

}

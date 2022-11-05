import java.util.Scanner;
public class oceandarea {
    public static void main(String[] args) {
        int r;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle ");
            r=sc.nextInt();
        }
        double OCE= 2*Math.PI*r;
        double area= Math.PI*r*r;
        System.out.println("The circumference of the circle is " +OCE);
        System.out.println("The area of the circle is " +area);

    }
}

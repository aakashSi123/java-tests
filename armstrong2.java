import java.util.Scanner;

public class armstrong2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // input number
        int n = num;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

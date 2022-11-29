package com.packages;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


    public class typingtest
    {
    public  void display() {
    System.out.println("Calculating the execution time");
    }

    public static void main(String[] args) {
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            long start = System.nanoTime();

            System.out.println("Welcome to my typing test program ");

            String data = "The quick brown fox jumps over the lazy dog";
            System.out.println(data);
            String a = new String();
            a = sc.nextLine();

            if (data.equals(a)) {
                System.out.println("Congo ");
            } else {
                System.out.println("Chal bete sahi type kar");
            }


            typingtest obj = new typingtest();
                long end = System.nanoTime();
                long execution = end - start;
                long seconds = execution / 1000000000;
                System.out.println("Execution time is " + seconds + "Seconds");


            System.out.println("Do you want to execute this program again  Y | N");
            choice = sc.next().charAt(0);

        } while(choice == 'Y' || choice== 'y');

    }
}

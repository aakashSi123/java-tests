// this program can only find the determinant of 2 or 3 order matrix hence this program can't be used to find inverse matrix having order more than 3x3
import java.util.*;
import java.io.*;
public class inverseofmatrix 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to my program");
       double i,j;
       int determinant=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix");
        double a = sc.nextDouble();
        System.out.println("Enter the coloumn of the matrix");
        double b = sc.nextDouble();

        double x[][] = new double[(int) a][(int) b];
        double cofactor[][] = new double[(int) a][(int) b];
        
        System.out.println("Step 1:- Enter the elements for the matrix");
        if(a==b)
        {
            System.out.println("Enter the elements for the matrix");

            for(i=0;i<a;i++)
            {
                for(j=0;j<b;j++)
                {
                    x[(int) i][(int) j] =  sc.nextDouble();
                }
            }
            // displaying the elements of the matrix entered by the user
            System.out.println("The elements entered by you are ");
            for(i=0;i<a;i++)
            {
                for(j=0;j<b;j++)
                {
                    System.out.print((int) x[(int) i][(int) j]+ " ");
                }
                System.out.println();
            }
            System.out.println("***********************************");
            // now building logic for the cofactor of the matrix
            System.out.println("Step 2: Find the cofactor of the matrixes elements");
            System.out.println("The co-factor of the element si shown below ");
            for(i=0;i<a;i++)
            {
                for(j=0;j<b;j++)
                {
                    cofactor[(int) i][(int) j] = x[(int) i][(int) j]* Math.pow((-1), i+j);
                    System.out.print((int) cofactor[(int) i][(int)j]+ "   ");
                }
                 System.out.println();
            }
            System.out.println("***********************************");
                // after inverse of the cofactor of the matrix
                System.out.println("Step 3:- Trasnpose the cofactor of the matrix");
                System.out.println("The transpose of the matrix is shown below");
                
                for(i=0;i<a;i++)
                {
                    for(j=0;j<b;j++)
                    {
                        System.out.print((int) cofactor[(int)j][(int)i]+ "   ");
                    }
                    System.out.println();
                }
                System.out.println("***********************************");



            // finding the determinant of the matrix
            // when the matrix order is 2x2
           System.out.println("Step 4:- Find the determinant of the matrix");
            if(a==2 || b==2)
            {
                 System.out.println("The determinant of the matrix 2x2 is  ");
                for(i=0;i<a;i++)
                {
                    for(j=0;j<b;j++)
                    {
                        determinant = (int) (x[0][0]*x[1][1] - x[0][1]*x[1][0]);
    
                    }
                }
            System.out.println(determinant + " ");
            }

          if(a==3 && b==3)
          {
            System.out.println("The determinant of the matrix 3x3 is "); 
            for(i=0;i<a;i++)
            {
                for(j=0;j<b;j++)
                {
                    int c11 = (int) (x[1][1]*x[2][2] - x[2][1]*x[1][2]);
                    int c12 =  (int) (x[1][0]*x[2][2] - x[2][0]*x[1][2]);
                    int c13 =  (int) (x[1][0]*x[2][1] - x[1][1]*x[2][0]);
                    
                    determinant = ((int) x[0][0] * c11) - ((int) x[0][1] * c12) + ((int) x[0][2] * c13);

                }
            }
            System.out.println(determinant);
            System.out.println("***********************************");
          }


        }

        else
        {
            System.out.println("Cannot perform the matrix operation");
        }

    }
}

import java.util.Scanner;

// java program to find the addition of two matrix using array
public class matrixmul {
    public static void main(String[] args)
    {
     
        // System.out.println("Enter the matrices ");
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Rows of first matrix");
        a=sc.nextInt();
        System.out.println("Columns of first matrix");
        b=sc.nextInt();
        System.out.println("Row of second matrix ");
        int c=sc.nextInt();
        System.out.println("Columns of second matrix ");
        int d=sc.nextInt();


        
        if(b == c)
    {
        int x[][]=new int[a][b];
        int y[][]= new int[c][d];
        int z[][]=new int[a][d];
        
        int i,j;
        // taking input from the user for first matrix
        System.out.println("Enter the element for first matrix");
        for(i=0;i<a;i++)
        {
           for(j=0;j<b;j++)
           {
            x[i][j] = sc.nextInt();
           }
           System.out.println();
        }

        // taking input fromt the use for second matrix
        System.out.println("Enter the element for the second matrix");
    for(i=0;i<c;i++)
        {
           for(j=0;j<d;j++)
           {
            y[i][j] = sc.nextInt();
           }
           System.out.println();
        }
       
        // displaying the matrix entered by the user
        System.out.println("Elements of first matrix");
        for(i=0;i<a;i++)
        {
           for(j=0;j<b;j++)
           {
            System.out.print(x[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println("Elements of second matrix");
        for(i=0;i<c;i++)
        {
           for(j=0;j<d;j++)
           {
           System.out.print(y[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println("Final result after multiplication");
   for(i=0;i<a;i++)
   {
    for(j=0;j<d;j++)
    {
        z[i][j]=0;
        for(int k=0;k<b;k++)
        z[i][j] =z[i][j]+x[i][k]*y[k][j];
        System.out.print(z[i][j]+" ");
    }
    System.out.println();
   }

    }

        else
        {
            System.out.println("Matrix operation is not possible");
        }
    }
}

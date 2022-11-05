import java.util.Scanner;

// java program to find the addition of two matrix using array
public class matrixaddition {
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
        for(int i=1;i<=a;i++)
        {


                         for(int j=1;j<=d;j++)
                         {  
                            System.out.println("Enter the elements of matrix A at once");
                            int e=sc.nextInt();
                            System.out.println("Enter the elements of matrix B at once");
                            int f=sc.nextInt();
                            int first[][]={{e},{f}};
                            int second[][]={{e},{f}};
                            int result[][]=new int[a][d];

                            for(int fi=0;fi<a;fi++)
                            {
                                for(int si=0;si<d;si++)
                                {
                                    result[a][d]=first[e][f]+second[e][f];
                                    System.out.println(result[fi][si]);
                                }
                            }
                        }

       
        
        }
    }

        else
        {
            System.out.println("Matrix operation is not possible");
        }
    }
}

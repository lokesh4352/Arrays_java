import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.0f Rows in Mat-A : ");
        int r1=sc.nextInt();
        System.out.print("Enter No.of Columns in Mat-A : ");
        int c1=sc.nextInt();
        System.out.print("Enter No.0f Rows in Mat-B : ");
        int r2=sc.nextInt();
        System.out.print("Enter No.of Columns in Mat-B : ");
        int c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("Matrix Multiplication is NOT Possible.");
        }
        else{
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int[][] mul=new int[r1][c2];
        System.out.println("Enter Elements into Array A : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements into Array B : ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<c1;k++){
                mul[i][j]+=a[i][k] * b[k][j];}
            }
        }
        System.out.println("The Resultant Array is : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
}
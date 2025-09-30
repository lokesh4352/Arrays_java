import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.0f Rows : ");
        int r=sc.nextInt();
        System.out.print("Enter No.of Columns : ");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        int[][] sum=new int[r][c];
        System.out.println("Enter Elements into Array A : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements into Array B : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                sum[i][j]=a[i][j] + b[i][j];
            }
        }
        System.out.println("The Resultant Array is : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
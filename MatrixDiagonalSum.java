import java.util.Scanner;
public class MatrixDiagonalSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Rows : ");
        int r=sc.nextInt();
        System.out.print("Enter No.of Columns : ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter Elements into the Matrix : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int fdiag=0;
        int sdiag=0;
        for(int i=0;i<r;i++)
        {
            fdiag += arr[i][i];
        }
        for(int i=0;i<r;i++)
        {
            sdiag += arr[i][r-1-i];
        }
        System.out.println("Sum of The First Diagonal Elements = "+fdiag);
        System.out.println("Sum of The Second Diagonal Elements = "+sdiag);
    }
}
import java.util.Scanner;
public class MatrixTranspose
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter No.of Rows : ");
       int r=sc.nextInt();
       System.out.print("Enter No.of Columns : ");
       int c=sc.nextInt(); 
       int[][] matrix=new int[r][c];
       int[][] transpose=new int[c][r];
       System.out.println("Enter The Matrix Elements : ");
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            transpose[j][i]=matrix[i][j];
        }
       }
       System.out.println("The Transposed MAtrix is : ");
       for(int i=0;i<c;i++)
       {
        for(int j=0;j<r;j++)
        {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
       }
    }
} 
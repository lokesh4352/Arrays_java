import java.util.Scanner;
public class Input2DArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of Rows : ");
        int r=sc.nextInt();
        System.out.print("Enter no.of Columns : ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter Elements : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("You Entered : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.err.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class JaggedArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Rows : ");
        int r=sc.nextInt();
        int[][] arr=new int[r][];
        for(int i=0;i<r;i++)
        {
            System.out.print("Enter no.of Columns in Row - "+ (i+1)+" : ");
            int c=sc.nextInt();
            arr[i]=new int[c];
            System.out.println("Enter "+c+" elements : ");
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n Jagged Array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
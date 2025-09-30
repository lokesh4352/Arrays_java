import java.util.Scanner;
public class SumJaggedArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Rows : ");
        int r=sc.nextInt();
        int[][] jagged=new int[r][];
        for(int i=0;i<r;i++)
        {
            System.out.print("Enter No.of columns in Row - "+(i+1)+" : ");
            int c=sc.nextInt();
            jagged[i]=new int[c];
            System.out.println("Enter the "+ c + " elements : ");
            for(int j=0;j<c;j++)
            {
                jagged[i][j]=sc.nextInt();
            }
        }
        int sum=0;
       System.out.println("The Jagged Array : ");
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<jagged[i].length;j++)
        {
            System.out.print(jagged[i][j] + " ");
            sum+=jagged[i][j];
        }
        System.out.println();
       }
        System.out.println("Sum of Elements in the Jagged Array : "+sum);

    }
}
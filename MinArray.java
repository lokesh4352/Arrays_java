public class MinArray
{
    public static void main(String[] args)
    {
        int[] a={5,3,1,4,6,2};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {min=a[i];}
        }
        System.out.println("The Minimum Element is : "+min);
    }
}
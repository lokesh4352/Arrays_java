public class MaxArray
{
    public static void main(String[] args)
    {
        int[] a={5,3,2,10,9,4};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("The MAXimum Element is : "+max);
    }
}
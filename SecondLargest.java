
package practice2;

import java.util.Scanner;

public class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int m=-999;
        int k=-888;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        System.out.println("Largest no. is:"+m);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k && arr[i]!=m)
            {
                k=arr[i];
            }
        }
        System.out.println("Second Largest no. is:"+k);

    }
}

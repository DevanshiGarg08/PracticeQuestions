
package practice2;

import java.util.*;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        String s=sc.next();
        String s1[]=s.split("\\.");
        String s2="";
        for(int j=s1.length-1;j>0;j--)
        {
            s2=s2+s1[j]+".";
        }
        s2=s2+s1[0];
        System.out.println(s2);
        }
    }
}

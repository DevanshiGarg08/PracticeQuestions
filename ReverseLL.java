
package practice2;

import java.util.Scanner;

public class ReverseLL
{
     static node head;
   static class node
   {
       int data;
       node next;
       node(int d)
       {
           data=d;
           next=null;
       }
   }
    public static ReverseLL insert(ReverseLL li,int data)
       {
           node newNode=new node(data);
           newNode.next=null;
           if(li.head==null)
           {
               li.head=newNode;
           }
           else
           {
               node last=li.head;
               while(last.next!=null)
               {
                   last=last.next;
               }
               last.next=newNode;
           }
           return li;
       }
    public static node reverse(node h)
   {
       node curr=h;
       node next=null;
       node prev=null;
       while(curr!=null)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       h=prev;
       return h;
   }
    public static ReverseLL display(ReverseLL li)
   {
       node curr=li.head;
       while(curr!=null)
       {
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
       return li;
   }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ReverseLL li=new ReverseLL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int elem=sc.nextInt();
           insert(li,elem);
        }
        head=li.reverse(head);
         li.display(li);
    }

}

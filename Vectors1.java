import java.util.*;
import java.io.*;
import java.lang.*;

class Vectors1
{
    public static void main(String args[]) throws IOException
    {
         Scanner s=new Scanner(System.in);
         Vector<String> v=new Vector<String>(5,2);
    String s1,s2,s3,s4;
    int n,c,p,i;
    System.out.println("Number of items in the list?");
    n=s.nextInt();
    System.out.println("ADD THE ITEMS TO THE LIST\n");
    for(i=0;i<=n;i++)
    {
        s1=s.nextLine();
        s2=s1.toLowerCase();
        v.addElement(s2);
    }
    do
    {
        System.out.println("\nOPERATIONS\n");
        System.out.println("1.ADD ITEM");
        System.out.println("2.ADD ITEM AT A SPECIFIC LOCATION");
        System.out.println("3.DELETE ITEM");
        System.out.println("4.DISPLAY ITEM");
        System.out.println("5.EXIT");
        System.out.println("ENTER YOUR CHOICE:-");
        c=s.nextInt();

        switch(c)
        {
            case 1:
                System.out.println("Enter item to be added in the list:");
                s3=s.nextLine();
                s4=s3.toLowerCase();
                v.addElement(s4);
                break;
            case 2:
                System.out.println("Enter item to be added:");
                s3=s.nextLine();
                System.out.println("Enter position number from 0");
                p=s.nextInt();
                s4=s3.toLowerCase();
                v.insertElementAt(s4,p);
                break;
            case 3:
                System.out.println("Enter Item to be deleted");
                s3=s.nextLine();
                s4=s3.toLowerCase();
                if(v.contains(s4))
                    v.removeElement(s4);
                else
                    System.out.println("LIST DOES NOT CONTAINS ITEM "+s4);
                break;
            case 4:
                System.out.print("THE SHOPPING LIST IS AS SHWON:-\n");
                for(i=0;i<=n;i++)
                    System.out.println(v.elementAt(i));
                break;
            case 5:
                break;
        }
      
    }
    while(c!=5);
}
    
}


 
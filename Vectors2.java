import java.util.*;
import java.lang.*;
import java.io.*;

class Vectors2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,count=0,freq;
        System.out.println("ENTER NUMBER OF ELEMENTS TO BE INSERTED");
        n=s.nextInt();
        Vector<Integer> v=new Vector<Integer>(n,2);
        System.out.println("ENTER "+n+" INTEGER ELEMENTS");
        for(i=0;i<n;i++)
        {
            v.addElement(s.nextInt());
        }
        System.out.println("VECTOR ARRAY:-"+v);
        System.out.println("ENTER ELEMENT WHOSE FREQUENCY IS TO BE KNOWN");
        freq=s.nextInt();
        for(i=0;i<v.size();i++)
        {
            if(v.elementAt(i)==freq)
                count++;
        }
        System.out.println("FREQUENCY OF "+freq+" is "+count);

           
    }
}
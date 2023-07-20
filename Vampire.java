import java.util.*;
import java.lang.*;
import java.io.*;

class Vampire
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A 4 DIGIT INTEGER NUMBER");
        num=s.nextInt();
        temp=num;
        int x[]=new int[4];
        int i,j,k,l,temp,num;

        for(i=0;i<4;i++)
        {
            x[i]=temp%10;
            temp=temp/10;
        }

        for(i=0;i<4;i++)
            for(j=0;j<4;j++)
            {
                if(i!=j)
                    for(k=0;k<4k;k++)
                    {
                        if(k!=i&&k!=j)
                            for(l=0;l<4;l++)
                            {
                                if(l!=i&&l!=k)
                                {
                                    
                                }
                            }
                    }
            }
    }
}
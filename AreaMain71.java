import java.util.*;
import java.io.*;
import java.lang.*;

class Area
{
    int area,l,b;
    public void Area(int s)
    {
        area=s*s;
        System.out.println("AREA OF SQUARE IS"+area);
    }
    public void Area(int length,int breadth)
    {
        l=length;
        b=breadth;
        area=l*b;
        System.out.println("AREA OF RECTANGLE"+area);
    }
    
}

class AreaMain71
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,length,breadth;
        System.out.println("ENTER SIDE DIMENSION OF SQUARE:-");
        s=sc.nextInt();
        System.out.println("ENTER DIMENSIONS OF RECTANGLE:-");
        length=sc.nextInt();
        breadth=sc.nextInt();

        Area a1=new Area();
        a1.Area(s);
        Area a2=new Area();
        a2.Area(length,breadth);

    }
}
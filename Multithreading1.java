import java.util.*;
import java.io.*;
import java.lang.*;

class Five extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println("5 * "+i+" = "+(5*i));
    }
}

class Seven extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println("7 * "+i+" = "+(7*i));
    }
}

class Thirteen extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println("13 * "+i+" = "+(13*i));
    }
}

class Multithreading1
{
    public static void main(String args[])
    {
        Five f=new Five();
        Seven s=new Seven();
        Thirteen t=new Thirteen();

        f.start();
        s.start();
        t.start();

    }
}



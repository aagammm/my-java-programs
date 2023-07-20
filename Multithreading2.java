import java.util.*;
import java.io.*;
import java.lang.*;

class Counter
{
    private int count=0;

    public void increment()
    {
        count=count+1;
        System.out.println("COUNT:"+count);
    }
}

class MyThread extends MyThread
{
    Counter c1;
    
}
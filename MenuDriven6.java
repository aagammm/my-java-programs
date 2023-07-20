import java.util.*;
import java.io.*;
import java.lang.*;

public class Recursive
{
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return(b,a%b);
    }

    public int lcm(int a,int b)
    {
        return (a/gcd(a,b))*b;
    }

    public int power(int x,int y)
    {
        int m=1;
        if(y>0)
        {
            m=m*x;
            return power(x,y-1);
        }
        return m;
    }
//gadbad hai fibo method me
    public void fibo(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return (fibo(n-1)+fibo(n-2));
        
        }
    }

    public int reverse(int n)
    {
        int dig=0;
        while(n!=0)
        {
        dig=dig*10+dig%10;
        reverse(n/10);
        }
        return dig;
    }

    public static int sum(int n)
    {   
      int sum=0;
      if(n>0)
      {
        sum=sum+sum(n-1);
      }
      return sum;
    }

    public static int sumd(int n)
    {
        int s=0;
        while(n!=0)
        {
            s=s+n%10;
            sum(n/10);
        }
        return s;
    }

}


class MenuDriven6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter the function");
            System.out.println("1) To find GCD and LCM");
            System.out.println("2) To find X^Y ");
            System.out.println("3) To print n Fibonacci numbers");
            System.out.println("4) To find reverse of number ");
            System.out.println("5) To 1+2+3+4+..+ (n-1)+n");
            System.out.println("6) Calculate the sum of digits of a number ");
            System.out.println("7) EXIT");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("ENTER TWO NUMBERS");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("GCD IS:-");
                    System.out.println(gcd(a,b));
                    System.out.println("LCM IS:-");
                    System.out.println(lcm(a,b));
                    break;
                case 2:
                    System.out.println("ENTER TWO NUMBERS:");
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    if(y==0)
                        System.out.println("Result="+1);
                    else
                        System.out.println("Result="+power(x,y));
                    break;
                case 3:
                    System.out.println("ENTER THE NUMBER TILL WHICH SERIES IS TO BE PRINTED:");
                    n=sc.nextInt();
                    for(i=0;i<=n;i++)
                        System.out.println(" "+fibo(i));
                    break;
                case 4:
                    System.out.println("ENTER A NUMBER:");
                    int n=sc.nextInt();
                    System.out.println("Reverse="+reverse(n));
                    break;
                case 5:
                    System.out.println("Enter nth value");
                    int n=sc.nextInt();
                    for(int i=0;i<=n;i++)
                    {
                        if(i==n)
                        System.out.println(i);
                        else    
                        System.out.println(i+"+");
                    }
                    System.out.println("="+sum(n));
                    break;
                case 6:
                    System.out.println("ENTER A NUMBER:");
                    n=sc.nextInt();
                    System.out.println("SUM OF DIGITS ARE"+sumd(n));
                case 7:
                    break;
            }
        }
        while(ch!=7);
    }
}
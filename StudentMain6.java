import java.util.*;
import java.io.*;
import java.lang.*;

class Student
{
    int roll,mm,mp,mc,total;
    String s1;

    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NAME OF THE STUDENT:");
        s1=s.nextLine();
        System.out.println("ENTER MARKS OF MATH,PHYSICS,CHEMISTRY RESPECTIVELY");
        mm=s.nextInt();
        mp=s.nextInt();
        mc=s.nextInt();
        System.out.println("ENTER ROLL NO.");
        roll=s.nextInt();
        total=mm+mp+mc;
        System.out.println("STUDENTS DETAILS REGISTERED");
    }

    public void output()
    {
        System.out.println("NAME:"+s1);
        System.out.println("MATH MARKS:"+mm);
        System.out.println("PHYSICS MARKS"+mp);
        System.out.println("CHEMISTRY MARKS"+mc);
        System.out.println("TOTAL MARKS"+total);
    }
}

class StudentMain6
{
    public static void main(String args[])
    {
        int i,j;
        Student s[]=new Student[5]; //array declaration
        for(i=0;i<4;i++)
        {
            s[i]=new Student(); //object declaration
        }
        for(i=0;i<4;i++)
        {
            System.out.println("ENTER DETAILS");
            s[i].input();
        }
        for(i=0;i<4;i++)
        {
            s[i].output();
        }
        Student temp;
        for(i=0;i<3;i++)
            for(j=0;j<3-i;j++)
                if(s[j].total<s[j+1].total)
                {
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
        System.out.println("ARRANGMENTS OF STUDENTS AS DESCENDNG ARRANGEMENTS OR MARKS:-");
        for(i=0;i<4;i++)
        {
            System.out.println("STUDENT NAME:"+s[i].s1+" ,STUDENT TOTAL MARKS:"+s[i].total+" ,STUDENT ROLL NUMEBER:"+s[i].roll);
        }

    }

}

//import java.io.*;
import java.util.*;

//import java.lang.*;
class MarksOutOfBoundsException extends Exception {
    public String toString() {
        return "Marks entered should be between 0 to 100";
    }
}

class Exception2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int m1, cn, sn;
        String name, date;
        boolean flag;
        do {
            try {
                flag = false;
                System.out.println("ENTER MARKS,CENTER-NUMBER,SEAT-NUMBER,NAME,DATE RESPECTIVELY");
                m1 = s.nextInt();
                cn = s.nextInt();
                sn = s.nextInt();
                name = s.nextLine();
                date = s.nextLine();
                if (m1 < 0 || m1 > 100)
                    throw new MarksOutOfBoundsException(); // object declaration
            } catch (MarksOutOfBoundsException e) // passing object as a parameter (Datatype e)
            {
                flag = true;
                System.out.println(e);
            }
        } while (flag == true);
        System.out.println("STUDENT DETAILS REISTERED CORRECTLY");
    }
}
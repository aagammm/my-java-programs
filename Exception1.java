import java.util.*;
//import java.lang.*;
//import java.io.*;

class Exception1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, num, valid = 0, invalid = 0;
        num = s.nextInt();
        for (i = 0; i < args.length; i++) {
            try {
                num = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument" + args[i]);
                System.out.println(e);
                invalid++;
                continue;
            }
            valid++;
        }
        System.out.println("TOTAL VALID ARGUMENTS:" + valid);
        System.out.println("TOTAL INVALID ARGUMENTS:" + invalid);
    }
}
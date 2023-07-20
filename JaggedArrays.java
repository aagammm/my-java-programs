import java.util.*;
//import java.io.*;
//import java.lang.*;

class JaggedArrays {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, j;
        int x[][] = new int[3][];
        for (i = 0; i < x.length; i++) {
            x[i] = new int[i + 1];
        }
        int count = 1;
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                x[i][j] = count++;
            }
        }
        System.out.println("JAGGED ARRAY IS SHWON AS:-");

        for (i = 0; i < x.length; i++)
            for (j = 0; j < x.length; j++) {
                System.out.println(x[i][j] + " ");
                System.out.println();
            }
    }

}
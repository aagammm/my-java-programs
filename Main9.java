import java.io.*;
import java.util.*;
import java.lang.*;

class Student {
    protected int roll;

    public void getRoll() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ROLL NUMBER");
        roll = s.nextInt();
    }

    public void showRoll() {
        System.out.println("ROLL NUMBER:-" + roll);
    }
}

class Test extends Student {
    protected int m1, m2;

    public void getMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER SEM1 AND SEM2 MARKS RESPECTIVELY");
        m1 = s.nextInt();
        m2 = s.nextInt();
    }

    public void showMarks() {
        System.out.println("SEM 1 MARKS=" + m1);
        System.out.println("SEM 2 MARKS=" + m2);
    }
}

interface Sports {
    int score = 10;

    void showScore();
}

class Result extends Test implements Sports {
    protected int total;

    public void showScore() {
        System.out.println("SCORE=" + score);
    }

    public void getTotal() {
        total = m1 + m2 + score;
        showRoll();
        showMarks();
        showScore();
        System.out.println("TOTAL=" + total);
    }
}

class Main9 {
    public static void main(String args[]) {
        Result r = new Result();
        // r.getRoll();
        // r.getMarks();
        // r.getTotal();
    }
}
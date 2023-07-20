import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

abstract class Shape {
    protected int r, l, b, area;

    public void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER DIMENSIONS");
        l = s.nextInt();
        b = s.nextInt();
        System.out.println("ENTER RADIUS");
        r = s.nextInt();
    }

    public abstract void displayArea();

}

class Rectangle extends Shape {
    public void displayArea() {
        System.out.println("AREA OF RECTANGLE" + l * b);
    }
}

class Triangle extends Shape {
    public void displayArea() {
        System.out.println("AREA OF TRINGLE IS" + (0.5 * l * b));
    }
}

class Circle extends Shape {
    public void displayArea() {
        System.out.println("AREA OF CIRCLE" + (3.14 * r * r));
    }
}

class Abstract {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        Shape s = null;
        int ch;
        do {
            System.out.println("MENU\n");
            System.out.print("1.RECTANGLE\n");
            System.out.print("2.CIRCLE\n");
            System.out.print("3.TRIANGLE\n");
            System.out.print("4.EXIT");

            System.out.print("ENTER YOUR CHOICE:-\n");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    r.getData();
                    s = r;
                    s.displayArea();
                    break;
                case 2:
                    c.getData();
                    s = c;
                    s.displayArea();
                    break;
                case 3:
                    t.getData();
                    s = t;
                    s.displayArea();
                    break;
                case 4:
                    break;

            }

        } while (ch != 4);
    }
}

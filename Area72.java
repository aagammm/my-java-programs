import java.util.*;
import java.io.*;
import java.lang.*;

class Rectangle {
    int l, b;

    public void Rectangle(int length, int breadth) {
        l = length;
        b = breadth;
    }

    public int area() {
        return l * b;

    }

}

class Cube {
    int s;

    public void Cube(int side) {
        s = side;
    }

    public int volume() {
        return s * s * s;
    }
}

class Size {
    public int size(Object z) {
        if (z instanceof Cube)
            return (((Cube) z).volume());
        else if (z instanceof Rectangle)
            return (((Rectangle) z).area());
        else
            return -1;
    }
}

class Area72 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int length, breadth, side;
        System.out.println("ENTER SIDE DIMENSION OF A CUBE");
        side = s.nextInt();
        System.out.println("ENTER DIMENSIONS OF RECTANGLE");
        length = s.nextInt();
        breadth = s.nextInt();
        Rectangle r = new Rectangle();
        Cube c = new Cube();
        Size size = new Size();
        int isCube = size.size(c);
        System.out.println("volume of cube is" + isCube);
        int isRect = size.size(r);
        System.out.println("area of cube is" + isRect);

    }
}
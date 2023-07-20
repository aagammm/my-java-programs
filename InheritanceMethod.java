class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Im setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("Im a constructor");
    }

}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Im setting y now");
        this.y = y;
    }
}

public class InheritanceMethod {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setY(44);
        System.out.println(d.getY());

    }
}
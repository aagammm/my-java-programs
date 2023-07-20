interface Bicycle {
    int a = 5;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Horn {
    void blowHorn();

    void blowHorn2();
}

class Hercules implements Bicycle {
    public void applyBrake(int decrement)

    {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment)

    {
        System.out.println("Speeding Up");
    }

    public void blowHorn() {
        System.out.println("Pee Pee");

    }

    public void blowHorn2() {
        System.out.println("Ouuu Aaaaa");
    }
}

public class InterfaceMethod {
    public static void main(String[] args) {
        Hercules c = new Hercules();
        c.applyBrake(5);
        c.blowHorn();
        c.blowHorn2();

    }
}

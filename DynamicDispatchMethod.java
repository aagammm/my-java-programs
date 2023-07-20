class Phone {
    public void showTime() {
        System.out.println("it is 10am");
    }

    public void on() {
        System.out.println("Phone is on");
    }
}

class SmartPhone extends Phone {
    public void playMusic() {
        System.out.println("Music is pkaying");
    }

    public void on() {
        System.out.println("SmartPhone is on");
    }
}

public class DynamicDispatchMethod {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
        obj.showTime();
        // obj.playMusic();

    }
}

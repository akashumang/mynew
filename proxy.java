public class proxy {

    public static void main(String[] args) {
        iphone ip = new iphoneproxy();
        ip.create();
        ip = new iphonereal();
        ip.create();
    }
}

abstract class iphone {
    abstract void shape();
    abstract void color();
    abstract void display();
    abstract void sound();
    void create() {
        shape();
        color();
        display();
        sound();
    }
}

class iphoneproxy extends iphone {
    void shape() {
        System.out.println("Setting shape for iphone proxy");
    }

    void color() {
        System.out.println("Setting color for iphone proxy");
    }

    void display() {
        System.out.println("This is proxy iphone, use real one for display");
    }

    void sound() {
        System.out.println("This is proxy iphone , use real one for sound");
    }
}

class iphonereal extends iphone {
    void shape() {
        System.out.println("Setting shape for iphone ");
    }

    void color() {
        System.out.println("Setting color for iphone ");
    }

    void display() {
        System.out.println("Setting  display");
    }

    void sound() {
        System.out.println("Setting  sound");
    }
}

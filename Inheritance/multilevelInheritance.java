package Inheritance;

class BasicPhone {
    int battery = 3000;

    void call() {
        System.out.println("Say hello, when you pic the Basic call.");
    }

    void batterInfo() {
        System.out.println("Basic phone has " + battery + "mAh battery");
    }
}

class SmartPhone extends BasicPhone {
    int battery = 5000;

    void internet() {
        System.out.println("Your smartphon has Interner now, ENJOY!");
    }

    void batterInfo() {
        System.out.println("Basic phone has " + battery + "mAh battery");
    }
}

class AiNova extends SmartPhone {
    int battery = 6000;

    void batterInfo() {
        System.out.println("Basic phone has " + battery + "mAh battery");
    }

    void cameraInfo() {
        System.out.println("Nova has Build in Ai in camera");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        AiNova nova = new AiNova();
        nova.call();
        nova.internet();
        nova.cameraInfo();
        nova.batterInfo();
    }
}

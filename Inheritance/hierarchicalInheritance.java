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

// child Class 1
class AiNova extends BasicPhone {
    int battery = 5000;

    @Override // annotation
    void batterInfo() {
        System.out.println("Basic phone has " + battery + "mAh battery");
    }
    
    void cameraInfo() {
        System.out.println("Nova has Build in Ai in Camera");
    }

    void manufacturer() {
        System.out.println("This is manufactureed in Chaina.");
    }
}

// child class 2
class Galaxy extends BasicPhone {
    int battery = 70000;

    void cameraInfo() {
        System.out.println("Galaxy25 has Build in Ai in Camara.");
    }

    void sPen() {
        System.out.println("S-pen has 78% charge.");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        AiNova nova = new AiNova();
        Galaxy s25 = new Galaxy();

        nova.call();
        nova.batterInfo();
        nova.cameraInfo();
        nova.manufacturer();
        // nova.sPen; // Error ->  method Undifined

        s25.call();
        s25.batterInfo();
        s25.cameraInfo();
        s25.sPen();
        // s25.manufactur(); // Error ->  method Undifined
    }
}

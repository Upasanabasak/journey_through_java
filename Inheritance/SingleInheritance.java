package Inheritance;

class ChinaPhone {
    int battery = 80000;
    void camera() {
        System.out.println("This is 20x Zoom Camera Phone.");
    }

    void battery() {
        System.out.println("Chinaphone has " + battery + "mah power");
    }
}

class AiNovaPhone extends ChinaPhone {
    void camera() {
        int battery = 60000;
        System.out.println("This is 200x Digital Zoom camera phone."); // method overridding
    }

    void battery() {
        System.out.println("Nova phone has " + battery + "mah power");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        AiNovaPhone nova = new AiNovaPhone();
        nova.camera();
        nova.battery();

        ChinaPhone cp = new ChinaPhone();
        cp.camera();
        cp.battery();
    }
}

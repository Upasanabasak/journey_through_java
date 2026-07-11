package Interface;

interface CNG_Car {
    void drive();

    void cng_kit();
}

interface Petrol_car {
    void drive();

    void petrol_kit();
}

class Hybride_Car implements CNG_Car , Petrol_car {
    public void drive() {
        System.out.println("I am driving a Hybrid Car");
    }

    public void cng_kit() {
        System.out.println("Using CNG Kit...");
    }

    public void petrol_kit() {
        System.out.println("Using petrol kit...");
    }
}

public class multipleInh {
    public static void main(String[] args) {
        Hybride_Car hc = new Hybride_Car();
        hc.drive();
        hc.cng_kit();
        hc.petrol_kit();
    }
}

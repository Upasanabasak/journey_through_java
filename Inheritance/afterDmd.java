package Inheritance;

class Payments {
    void process() {
        System.out.println("Payment is processing...");
    }
}

class creditCards extends Payments {
    @Override
    void process() {
        System.out.println("Enter credit information to continue payment...");
    }
}

class UPIs extends Payments {
    @Override
    void process() {
        System.out.println("Scan the QR to make payment...");
    }
}
class Cash extends Payments {
    @Override
    void process() {
        System.out.println("Paying in CASH...");
    }
}
public class afterDmd {
    public static void main(String[] args) {
        String paymentMethod = "Cash";
        Payments myPayment;
        // ParentClass objName = new ChildClass();
        if (paymentMethod.equals("UPI")) {
            myPayment = new UPIs();
        } 
        else if(paymentMethod.equalsIgnoreCase("Cash")) {
            myPayment = new Cash();
        }
        else {
            myPayment = new creditCards();
        }
        myPayment.process();
    }
}

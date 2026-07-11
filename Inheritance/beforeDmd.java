package Inheritance;

class Payment {
    void process() {
        System.out.println("Payment is processing...");
    }
}

class creditCard extends Payment {
    @Override
    void process() {
        System.out.println("Enter credit information to continue payment...");
    }
}

class UPI extends Payment {
    @Override
    void process() {
        System.out.println("Scan the QR to make payment...");
    }
}

public class beforeDmd {
    public static void main(String[] args) {
        // Payment p = new Payment();
        String paymentMode = "CC";
        creditCard cc = new creditCard();
        
        UPI u = new UPI();
        
        // p.process();
        
        if(paymentMode.equalsIgnoreCase("UPI")) {
            u.process();
        }
        else {
            cc.process();
        }
        // cc.process();
        
        // u.process();
    }
}

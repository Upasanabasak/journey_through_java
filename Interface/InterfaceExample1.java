package Interface;

interface Aniaml {
    void sound();
}
class Dog implements Aniaml {
    public void sound() {
        System.out.println("Dog is Barking...");
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}

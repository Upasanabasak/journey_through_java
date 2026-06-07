package oops;

class Student {
    // attributes
    String name;
    int rollNumber;

    // behaviour / actions

    void showdetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(); // Object of the student class
        st1.name = "Upasana";
        st1.rollNumber = 01;

        Student st2 = new Student();
        st2.name = "Sristi";
        st2.rollNumber = 02;

        st1.showdetails();
        st2.showdetails();
    }
}

package oops;

// encapsulation is achived by using the keywoard -> private
class Emp {
    private String name;
    private double salary;

    // setter and getter
    public void setName(String s) {
        name = s;
    }

    public void setsalary(double d) {
        salary = d;
    }

    public String getName() {
        return name;
    }

    public double getsalary() {
        return salary;
    }
}

public class Encap {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        // e1.name = "Priya";
        // e1.salary = 124224.34;
        e1.setName("Upasana");
        System.out.println(e1.getName());
    }
}

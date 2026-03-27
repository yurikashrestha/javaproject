package inheritanceept2;

public class Personpt2 {
    String name;

    Personpt2(String name) {
        this.name = name;
    }
}
class Student extends Personpt2 {
    int rollNumber;

    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}


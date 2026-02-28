package pack2;
import pack1.Student;
public class TestPublic {
    public static void main(String [] args){
        Student s = new Student();
        s.name = "Namjoon";
        System.out.println("Student Name: " + s.name);
    }
}

package pack1;

public class Employee {
    private double salary = 20000;
    private void calculateSalary(){
        double bonus = salary*0.10;
        double finalSalary = salary + bonus;
        System.out.println("Final Salary: " + finalSalary);  }
    public static void main(String[] args){
        Employee e = new Employee();
        e.calculateSalary();
    }
}

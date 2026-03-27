package inheritanceept2;

public class employee {
    String name;
    double salary;

    employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void displayEmployee(){
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
    }}


class Developer extends employee{
    String programmingLanguage;
    Developer(String name, double salary, String programmingLanguage){
     super(name, salary);
     this.programmingLanguage = programmingLanguage;
    }
    public void displayDeveloper(){
        displayEmployee();
        System.out.println("Programming Language: "+ programmingLanguage);
    }
}

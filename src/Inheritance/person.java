package Inheritance;

public class person {
String name ;
int age ;

public  void displayPersonDetails(){
    System.out.println("name: " + name);
    System.out.println("age: " + age);
}
}

 class Student extends person{
 int RollNumber ;
 public  void displayStudentDetails(){

     System.out.println("Roll number: " + RollNumber);
 }
}

package inheritanceept2;

public class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
        public void displayPerson() {
            System.out.println("Name: " + name);
        }}
    class Teacher extends Person {
        String subject;
        Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }
       public void displayTeacher() {
            displayPerson();
            System.out.println("Subject: " + subject);
        }
    }
//    class Student extends Person {
//        String course;
//
//        Student(String name, String course) {
//            super(name);
//            this.course = course;
//        }
//
//      public void displayStudent() {
//            displayPerson();
//            System.out.println("Course: " + course);
//        }
//    }


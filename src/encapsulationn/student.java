package encapsulationn;

public class student {
    private int StudentId;
    private String StudentName;
    private double marks;

    public int getStudentId(){
        return StudentId;
    }
    public void setStudentId(int StudentId){
        this.StudentId = StudentId;
    }
    public String getStudentName(){
        return StudentName;
    }
    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }
    public double marks(){
        return marks;
    }
    public void setmarks(double marks){
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println("StudentId:" + StudentId);
        System.out.println("StudentName:" + StudentName);
        System.out.println("Marks:" + marks);
    }
}

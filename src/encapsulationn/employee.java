package encapsulationn;

public class employee {
    private int EmployeeId;
    private String EmployeeName;
    private double Salary;

    public int getEmployeeId(){
        return EmployeeId;
    }
    public void setEmployeeId(int EmployeeId){
        this.EmployeeId = EmployeeId;
    }
    public String getEmployeeName(){
        return EmployeeName;
    }
    public void setEmployeeName(String EmployeeName){
        this.EmployeeName = EmployeeName;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double Salary){
        if(Salary > 0){
            this.Salary = Salary;
        } else {
            System.out.println("Salary must be greater then zero");
        }
    }
    public void displayAccountDetails(){
        System.out.println("EmployeeId: " + EmployeeId);
        System.out.println("EmployeeName: " + EmployeeName);
        System.out.println("Salary: " + Salary);
    }
}

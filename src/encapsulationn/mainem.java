package encapsulationn;

public class mainem {
    public static void main (String [] args){

        employee em1 = new employee();
        em1.setEmployeeId(6);
        em1.setEmployeeName("Yurika");
        em1.setSalary(100000);

        employee em2 = new employee();
        em2.setEmployeeId(7);
        em2.setEmployeeName("Namjoon");
        em2.setSalary(120000);

        System.out.println("Employee1");
        em1.displayAccountDetails();
        System.out.println("Employee2");
        em2.displayAccountDetails();
    }
}

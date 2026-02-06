package jan31home;

public class billsplit {
    public static void main(String [] args ){
        double bill = 150.00;
        double tip = (10/100)*150.00;
        double totalBill = (tip + bill)/4;
        System.out.println("Each person need to pay " + totalBill );
    }
}

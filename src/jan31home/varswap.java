package jan31home;

public class varswap {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = a ;
        System.out.println("Before swap a is " +a + "and b is "+ b );
        a = b;
        b = c;
        System.out.println("After swap a is " +a + " and b is " + b );

    }
}

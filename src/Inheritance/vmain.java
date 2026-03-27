package Inheritance;
import java.util.Scanner;
public class vmain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        Bike b = new Bike(brand, model);

        b.display();

    }
}


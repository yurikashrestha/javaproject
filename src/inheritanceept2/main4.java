package inheritanceept2;
import java.util.Scanner;
public class main4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter camera MP: ");
            int cameraMP = scanner.nextInt();

            Smartphone s = new Smartphone(brand, cameraMP);
            s.display();

            scanner.close();
        }
    }

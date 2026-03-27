package inheritanceept2;

public class Mobile {
        String brand;

        Mobile(String brand) {
            this.brand = brand;
        }
    }

    class Smartphone extends Mobile {
        int cameraMP;

        Smartphone(String brand, int cameraMP) {
            super(brand);
            this.cameraMP = cameraMP;
        }

        public void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Camera: " + cameraMP + "MP");
        }
    }

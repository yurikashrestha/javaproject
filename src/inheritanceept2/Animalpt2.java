package inheritanceept2;

public class Animalpt2 {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animalpt2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}


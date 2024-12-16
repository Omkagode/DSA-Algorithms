public class Inheritance {
    public static void main(String[] args) {
        // create object of childer(derived ) class
        Cat mani = new Cat();
        mani.run();
    }

}

// base (Parent ) class
class Animal {
    String type; // Terrestrial animals,Aquatic animals,Amphibians,Reptiles

    void eat() {
        System.out.println("Yes Im Hungari....");
    }

    void run() {
        System.out.println("Yes I can Run And Jump");
    }

}

// Derived (Childern) class
class Cat extends Animal {
    String color;// black , white , brown, mixedColor

    void Drink() {
        System.out.println("I like Milk...");
    }
}

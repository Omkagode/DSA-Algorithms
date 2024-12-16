public class AbstractionInJava {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Horse h= new Horse();
        h.eat();
        h.Walk();
        //this call the 1st Animal Constructor insted of calling changeColor function
        System.out.println(h.color);

        Chicken c= new Chicken();
        c.eat();
        c.Walk();
    }
    
}

abstract class Animal {

    String color;
   

    //constructor
    Animal(){
        color="Brown";
        System.out.println("Animal class Constructor is called");
    }

    void eat(){
        System.out.println("Yes I am Hungery....");
    }

    abstract void Walk();

    
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse class Constructor is called");
    }

    void changeColor(){
         color="white";
    }
    void Walk(){
        System.out.println("Horse is Walking in 4 lages");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken class Constructor is called");
    }
    void Walk(){
        System.out.println("Chicken is Walking in 2 legs");
    }
}

public class MethodOverridingInRunTimePolymorphism {
    public static void main(String[] args) {
      Deer d = new Deer();
      d.eat();
    }
    
}

class Animal{
    
    //function
    void eat(){
        System.out.println("Animal is eating Anything.....");
    }
}

class Deer extends Animal {
     void eat(){
        System.out.println("Deer is eating Grass.....");
     }
}

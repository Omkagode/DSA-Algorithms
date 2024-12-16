
class Pen{
    //properies
    String color;
    int tip;
    // functions;
    void setColor(String newColor){
        color = newColor;
        System.out.println(color);
        
    }

    void setTip(int newTip){
        tip = newTip;
        System.out.println(tip);
    }
    
}

public class ClassesAndObject {

    public static void main(String[] args) {
        // Creating an object of the class
        Pen p = new Pen();
        
        p.setColor("Yello");
        p.setTip(5);

    }
        

    
}



class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen myPen = new Pen();
        // myPen.color="ornage";
        myPen.setColor("Orange");
        System.out.println(myPen.getColor());

        myPen.setTip(10);
        System.out.println(myPen.getTip());

    }

}

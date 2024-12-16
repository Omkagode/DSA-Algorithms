public class MethodOverloadingInPolymerphism {
    public static void main(String[] args) {
        // Creating objects of the class
        Calculated cal = new Calculated();
        System.out.println(cal.Sum(10, 20));
        System.out.println(cal.Sum((float)1.5, (float)2.5));
        System.out.println(cal.Sum(1, 2, 3));

    }

}

class Calculated {

    int Sum(int a, int b) {
        return a + b;

    }

    float Sum(float a, float b) {
        return a + b;

    }

    int Sum(int a, int b, int c) {
        return a + b + c;
    }
}
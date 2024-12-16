public class CopyConstructorType {
    public static void main(String[] args) {
        DivisionB div1 = new DivisionB();
        div1.name = "Hello";
        div1.rollno = 25;
        div1.marks[0] = 100;
        div1.marks[1] = 99;
        div1.marks[2] = 98;

        DivisionB div2 = new DivisionB(div1);
        div1.marks[0] = 97;

        for (int i = 0; i < 3; i++) {
            System.out.println(div2.marks[i]);
        }

    }
}

class DivisionB {
    String name;
    int rollno;
    int marks[];

    //Shallow copy constructor
    // DivisionB(DivisionB div1) {
    //     marks = new int[3];
    //     this.name = div1.name;
    //     this.rollno = div1.rollno;
    //     this.marks = div1.marks;

    // }


    //Deep Copy Constructor 
    DivisionB(DivisionB div1) {
        marks = new int[3];
        this.name = div1.name;
        this.rollno = div1.rollno;
        
        for(int i=0; i<3; i++){
            this.marks[i]=div1.marks[i];
        }

    }


    //default constructor     
    DivisionB() {
        marks = new int[3];
        System.out.println("Default Constructor");
    }

}




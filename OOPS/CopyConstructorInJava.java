public class CopyConstructorInJava {
    public static void main(String[] args) {
        // Create an object of the class

        StudentInfo s1 = new StudentInfo();
        s1.name = "Omkar";
        s1.rollno = 1;
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 95;

        System.out.println();

        StudentInfo s2 = new StudentInfo(s1);
        s1.marks[1] = 100;
        for (int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class StudentInfo {
    String name;
    int rollno;
    int marks[];

    // create copy constructor
    StudentInfo(StudentInfo s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks=s1.marks;

    }


    //default 
    StudentInfo() {
        marks = new int[3];
        System.out.println("Function is called ......");
    }

    // Parameterized constructor
    StudentInfo(String name) {
        marks = new int[3];
        this.name = name;

    }

    StudentInfo(int rollno) {
        marks = new int[3];
        this.rollno = rollno;

    }

}

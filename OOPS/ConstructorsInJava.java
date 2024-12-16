public class ConstructorsInJava {
    public static void main(String[] args) {
        Student s1 =new Student();
        // Student s1 = new Student("Omkar");
        // System.out.println(s1.name);
    }
    
}

class Student{
    String name;
    int roll;

    //Non- Parameterized Constructor
    Student(){
     System.out.println("Hello bhai Me to bi na parameters or keywords ke alava hi print ho gaya ha nacho...");
    }

    // Student(String name){
    //    this.name=name;
    // }
}

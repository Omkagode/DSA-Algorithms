 import java.util.*;

 class PrintChar {

    public static void printCharacters( String name){
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your FullName :");
        String name = sc.nextLine();
        printCharacters(name);
        sc.close();

        
    }
        

    
}

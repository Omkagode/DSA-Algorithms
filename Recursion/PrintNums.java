
public class PrintNums {

    public static int Num(int n){
        
        if(n==1){
            return n;

        } 

        System.out.print(n+" ");
        
        return Num(n-1);
        
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(Num(n));
        
    }
    
}

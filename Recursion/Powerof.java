public class Powerof {

    public static int Power(int x,int n){
        if(n==0){   // bsae condition
            return 1;
        }

        return x * Power(x, n-1); // power function 
    }

    public static void main(String[] args) {
        int n=2;
        int x=5;
        System.out.println(Power(x,n));
    }
    
}

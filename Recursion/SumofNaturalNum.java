public class SumofNaturalNum {

    public static int Sum(int n){
        if(n<0){
            return 0;
        }

        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println(Sum(n));
    }
    
}

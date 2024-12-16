public class FrindsPairs {

    public static int frindsPair(int n){
        if (n==1 || n==2){
            return n;
        }
        
        //*Single Frinds */
        int singlefrind=frindsPair(n-1);

        //Pairs of frinds
        int pair=(n-1)*frindsPair(n-2);
        return singlefrind+pair;
        
    }
    public static void main(String[] args) {
        System.out.println(frindsPair(5));
    }

    
}

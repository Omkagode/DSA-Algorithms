
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer [] coins={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> ans= new ArrayList<>();
        int countOfCoins=0;
        int amount=2121;

        for(int i=0;i<coins.length;i++){
            if(amount >= coins[i]){
                while (amount >= coins[i]) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                    
                }
            }
        }

        System.out.println("Min no. of change for value is "+ countOfCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print( ans.get(i) +" ");
        }
         System.out.println();
    }
    
}

public class BuySellStoks {

    public static int MaxProfit(int []prices,int n){
        int buyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;

        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){ //profit
                int profit=prices[i]-buyPrice; //todays profit 
                MaxProfit=Math.max(MaxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return MaxProfit;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        System.out.println("Maximum Profit is "+MaxProfit(prices,n));
        
    }
    
}

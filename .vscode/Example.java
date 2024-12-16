 class Example {


    public static void fibonachiSeries(int n){
        // int n1=0;
        // int n2=1;
        // int n3;

        // for(int i=2;i<n;i++){
        //     n3=n1+n2;
        //     System.out.println(n3);
        //     //sawp 
        //     n1=n2;  
        //     n2=n3;

        // }


        //Uing Dp

        int fib[]= new int[n+2];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
            
        }
        for(int i=0;i<n;i++){
            System.out.println(fib[i]);
            }

       


        
    }
    public static void main(String[] args) {
        int n=10;
     
         fibonachiSeries(n);
    
    }
    
}

 
  class BankAccount{
    public String userName;
    private String passWord;

    //function to set pass
    public void setPassword(String newpwd){
        passWord=newpwd;
        // System.out.println(passWord);
    }
    
    
}
 class AccessModifier {

    
    public static void main(String[] args) {
        // create the object of BankAccount class
        BankAccount myAccount = new BankAccount();
        myAccount.userName="@OmkarGode20031213";
        // myAccount.passWord="Pass@123"; // this is wrong we cant set password like this 

        System.out.println(myAccount.userName);
        myAccount.setPassword("Pass@123");
        

        
    }
   
    
}

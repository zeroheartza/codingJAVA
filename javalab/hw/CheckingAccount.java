public class CheckingAccount extends BankAccount{
    public double overdraftFee;

    public CheckingAccount(String customerName,String accountNumber,double balance,double overdraftFee){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.overdraftFee=overdraftFee;
    }
    public double getAccountNumber(){
        return this.overdraftFee;
    }
    public void setOverdraftFee(double fee){
        this.overdraftFee=fee;
    }
    public void withdraw(double amount){
        if(this.balance>=(this.overdraftFee+amount)){
            System.out.println("Withdraw Complete!!");
            //52428 Max Withdraw 1.123 Fee 0.0007 Balance 11.127823
            System.out.println(getAccountNumber()+"Max Withdraw"+amount+"Fee"+getAccountNumber()+"Balance"+getBalance());
            System.out.println("####################");

        }
        else{
            System.out.println("Withdraw Fail!!");
            System.out.println("####################");
            
        }
    }


}
import java.util.*;

public class BankAccount{
    public String customerName;
    public String accountNumber;
    public double balance; 
    BankAccount (String customerName, String accountNumber, double balance){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public String getCustomerName(){
        return this.customerName;

    }
    public void setCustomerName(String name){
        this.customerName=name;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String number){
        this.accountNumber=number;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double b){
        this.balance=b;
    }

    public void withdraw(double amount){
        this.balance-=amount;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }



}
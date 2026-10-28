package pre05mini;
public class MiniBank {public static void main(String[] args){Account[] accounts={new SavingsAccount("AC0001","Riya",5000,1000),new CurrentAccount("AC0002","Aman",2000,1000),new FixedDepositAccount("AC0003","Neha",10000)};for(Account a:accounts)System.out.println(a+" | Interest: "+a.interestRate()+"% | Can withdraw 500? "+a.canWithdraw(500));}}

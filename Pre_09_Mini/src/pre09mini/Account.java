package pre09mini;
public class Account {private final String accountNumber;private long balance;public Account(String n,long b){accountNumber=n;balance=b;}public String getAccountNumber(){return accountNumber;}public synchronized void deposit(long amount){if(amount>0)balance+=amount;}public synchronized long getBalance(){return balance;}}

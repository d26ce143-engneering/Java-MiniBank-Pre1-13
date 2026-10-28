package pre13mini;
import pre13mini.annotation.Id;
public class Account { @Id private final String accountNumber;private final String ownerName;private long balance;public Account(String n,String o,long b){accountNumber=n;ownerName=o;balance=b;}public String getAccountNumber(){return accountNumber;}public long getBalance(){return balance;}public String toString(){return accountNumber+" | "+ownerName+" | "+balance;}}

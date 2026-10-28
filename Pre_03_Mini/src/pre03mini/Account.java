package pre03mini;
import java.util.Objects;
public class Account {private final String accountNumber;private String ownerName;private long balance;public Account(String n,String o,long b){accountNumber=n;ownerName=o;balance=b;}public String getAccountNumber(){return accountNumber;}public long getBalance(){return balance;}
 @Override public String toString(){return accountNumber+" | "+ownerName+" | "+balance;}
 @Override public boolean equals(Object o){return o instanceof Account a && accountNumber.equals(a.accountNumber);}
 @Override public int hashCode(){return Objects.hash(accountNumber);}}

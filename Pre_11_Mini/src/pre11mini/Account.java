package pre11mini;
import java.io.Serializable;
public class Account implements Serializable {private static final long serialVersionUID=1L;private final String accountNumber;private final String ownerName;private long balance;public Account(String n,String o,long b){accountNumber=n;ownerName=o;balance=b;}public String getAccountNumber(){return accountNumber;}public String getOwnerName(){return ownerName;}public long getBalance(){return balance;}public String toString(){return accountNumber+" | "+ownerName+" | "+balance;}}

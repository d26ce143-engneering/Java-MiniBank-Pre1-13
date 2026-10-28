package pre07mini;
import pre07mini.annotation.*;
public class Account {@Id private final String accountNumber;@MaxLength(30) private String ownerName;@Positive private long balance;public Account(String n,String o,long b){accountNumber=n;ownerName=o;balance=b;}public String toString(){return accountNumber+" | "+ownerName+" | "+balance;}}

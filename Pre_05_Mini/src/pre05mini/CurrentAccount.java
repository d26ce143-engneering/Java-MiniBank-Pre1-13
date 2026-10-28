package pre05mini;
public class CurrentAccount extends Account {private long overdraftLimit;public CurrentAccount(String n,String o,long b,long limit){super(n,o,b);overdraftLimit=limit;}public double interestRate(){return 0.0;}public boolean canWithdraw(long a){return a>0&&balance-a>=-overdraftLimit;}}

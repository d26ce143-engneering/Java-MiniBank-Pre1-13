package pre05mini;
public class SavingsAccount extends Account {private long minBalance;public SavingsAccount(String n,String o,long b,long min){super(n,o,b);minBalance=min;}public double interestRate(){return 4.0;}public boolean canWithdraw(long a){return a>0&&balance-a>=minBalance;}}

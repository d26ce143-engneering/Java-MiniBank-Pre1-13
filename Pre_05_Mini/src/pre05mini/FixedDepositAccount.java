package pre05mini;
public class FixedDepositAccount extends Account {public FixedDepositAccount(String n,String o,long b){super(n,o,b);}public double interestRate(){return 7.0;}public boolean canWithdraw(long a){return false;}}

package pre08mini.exception;
public class InsufficientFundsException extends BankException {private final long shortfall;public InsufficientFundsException(long s){super("Withdrawal failed: short by "+s);shortfall=s;}public long getShortfall(){return shortfall;}}

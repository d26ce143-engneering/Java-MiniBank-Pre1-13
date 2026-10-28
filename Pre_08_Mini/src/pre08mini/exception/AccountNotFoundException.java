package pre08mini.exception;
public class AccountNotFoundException extends BankException {public AccountNotFoundException(String id){super("Account not found: "+id);}}

package pre04mini;
public record Command(TransactionType type,String accountNumber,long amount) {}

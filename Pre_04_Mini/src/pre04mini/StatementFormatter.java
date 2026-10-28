package pre04mini;
public class StatementFormatter {public static String buildStatement(Account a){return new StringBuilder("MINIBANK STATEMENT\nAccount: ").append(a.accountNumber()).append("\nOwner: ").append(a.ownerName()).append("\nBalance: Rs. ").append(a.balance()).toString();}}

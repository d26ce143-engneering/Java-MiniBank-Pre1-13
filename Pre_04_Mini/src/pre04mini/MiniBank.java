package pre04mini;
public class MiniBank {public static void main(String[] args){System.out.println(Validator.isValidMobile("9876543210"));System.out.println(Validator.isValidMobile("12345"));Command c=CommandParser.parse("DEPOSIT AC0001 500");System.out.println(c);System.out.println(StatementFormatter.buildStatement(new Account("AC0001","Riya",5000)));}}

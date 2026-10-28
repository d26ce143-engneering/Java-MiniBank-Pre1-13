package pre01mini;
import java.util.Scanner;
public class MiniBank {
  record BankInfo(String name, String branch) {}
  enum MenuOption { OPEN_ACCOUNT, DEPOSIT, WITHDRAW, TRANSFER, EXIT }
  public static void main(String[] args) {
    BankInfo info = new BankInfo("MiniBank", "CHARUSAT Branch");
    System.out.println("=== " + info.name() + " | " + info.branch() + " ===");
    try (Scanner sc = new Scanner(System.in)) {
      boolean running = true;
      while (running) {
        System.out.println("1. Open account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Exit");
        System.out.print("Choose: ");
        if (!sc.hasNextInt()) { System.out.println("Enter a number."); sc.nextLine(); continue; }
        int choice = sc.nextInt();
        switch (choice) {
          case 1 -> System.out.println("Open account — to be implemented in a later practical");
          case 2 -> System.out.println("Deposit — to be implemented in a later practical");
          case 3 -> System.out.println("Withdraw — to be implemented in a later practical");
          case 4 -> System.out.println("Transfer — to be implemented in a later practical");
          case 5 -> { System.out.println("Goodbye!"); running = false; }
          default -> System.out.println("Invalid option.");
        }
      }
    }
  }
}

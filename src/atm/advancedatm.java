package atm;
import java.util.Scanner;
public class advancedatm {
	 private static int balance = 1000;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the ATM!");
	        System.out.println("Please enter your PIN:");

	        int pin = scanner.nextInt();

	        if (pin == 1234) {
	            System.out.println("PIN accepted. What would you like to do?/n");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Transfer Money");
	            System.out.println("5. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    withdrawMoney();
	                    break;
	                case 3:
	                    depositMoney();
	                    break;
	                case 4:
	                    transferMoney();
	                    break;
	                case 5:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } else {
	            System.out.println("Invalid PIN. Access denied.");
	        }
	    }

	    private static void checkBalance() {
	        System.out.println("Your balance is: $" + balance);
	    }

	    private static void withdrawMoney() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the amount to withdraw:");
	        int amount = scanner.nextInt();
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    private static void depositMoney() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the amount to deposit:");
	        int amount = scanner.nextInt();
	        balance += amount;
	        System.out.println("Deposit successful. Updated balance: $" + balance);
	    }

	    private static void transferMoney() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the amount to transfer:");
	        int amount = scanner.nextInt();
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Transfer successful. Remaining balance: $" + balance);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }
	

}

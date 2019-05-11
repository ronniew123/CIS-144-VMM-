
/** VendingMachine.java
 * 
 * @author Ronnie W
 *
 */

import java.util.Scanner;

/*
 * Spring 2019 CIS 144 Class Project Vending Machine Manager(VMM)
 * JAVA application that manages a fleet of Vending machines.
 */

public class VendingMachine {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Print Main Menu
		printMainMenu();
	}

	// Test simulator for virtual vending machine
	public static void testMachine() {
		SodaMachine sodaMachine = new SodaMachine(); // Create new SodaMachine
		sodaMachine.getBalance(); // Balance at 0 quarters

		sodaMachine = new SodaMachine(); // Create new SodaMachine for next test
		sodaMachine.getRevenue(); // Revenue at 0 quarters
		System.out.println(sodaMachine.revenue);

		sodaMachine = new SodaMachine(); // Create new SodaMachine for next test
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.getBalance(); // Balance at 2 quarters
		System.out.println(sodaMachine.balance);

		sodaMachine = new SodaMachine(); // Create new SodaMachine for next test
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.refund(); // Refund inserted quarters back to user
		sodaMachine.getBalance(); // Balance back at 0 quarters due to refund
		System.out.println(sodaMachine.balance);

		sodaMachine = new SodaMachine(); // Create new SodaMachine for next test
		sodaMachine.vendSoda(); // Boolean equals false
		System.out.println(sodaMachine.vendSoda());

		sodaMachine = new SodaMachine(); // Create new SodaMachine for next test
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.insertCoin(); // Insert one quarter into machine
		sodaMachine.vendSoda(); // Boolean equals true
		sodaMachine.getBalance(); // Balance back at 0 quarters due to purchase of soda
		sodaMachine.getRevenue(); // Revenue at 2 quarters
		System.out.println(sodaMachine.revenue);
		sodaMachine.restock(); // Restock Soda Machine to full capacity
		System.out.println(sodaMachine.SODA_CAPACITY);

		// Go back to Main Menu
		printMainMenu();

	}

	public static void printMainMenu() {

		// Print VMM options
		System.out.println("Please select an option from the menu below...");
		System.out.println("A - Add Machine");
		System.out.println("B - Delete Machine");
		System.out.println("C - Run Test Simulator");
		System.out.println("Q - Quit");
		System.out.print("User choice: ");

		String a = sc.next();
		// Holds user choice
		char choice = (Character.toUpperCase(a.charAt(0)));
		switch (choice) {
		case 'A':
			addMachine();
			break;
		case 'B':
			deleteMachine();
			break;
		case 'C':
			testMachine();
			break;
		case 'Q':
			System.out.println("Good-Bye!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid response");
		}
	}

	public static void addMachine() {
		// Print VMM add options
		System.out.println("Please select a machine to add...");
		System.out.println("1 - Soda Machine with 8 slots");
		System.out.println("2 - Snack Machine with 40 slots");
		System.out.println("3 - Soda and Snack Machine Combo");
		System.out.println("4 - Go back to Main Menu");
		System.out.print("User choice: ");

		int addChoice;
		addChoice = sc.nextInt();

		switch (addChoice) {
		case 1:
			System.out.println("Soda Machine with 8 slots has been added.");
			modifySodaMachine();
			break;
		case 2:
			System.out.println("Snack Machine with 40 slots has been added.");
			modifySnackMachine();
			break;
		case 3:
			System.out.println("Soda and Snack Machine Combo has been added.");
			modifyComboMachine();
			break;
		case 4:
			printMainMenu();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

	public static void modifySodaMachine() {
		SodaMachine sodaMachine = new SodaMachine();

		System.out.println("Please select what you would like to modify...");
		System.out.println("1 - Increase soda price");
		System.out.println("2 - Decrease soda price");
		System.out.println("3 - Increase soda capacity");
		System.out.println("4 - Decrease soda capacity");
		System.out.println("5 - Go back to Main Menu");
		System.out.print("User choice: ");

		int sodaChoice;
		sodaChoice = sc.nextInt();
		switch (sodaChoice) {
		case 1:
			sodaMachine.increaseSodaPrice();
			modifySodaMachine();
			break;
		case 2:
			sodaMachine.decreaseSodaPrice();
			modifySodaMachine();
			break;
		case 3:
			sodaMachine.addSodaSlot();
			modifySodaMachine();
			break;
		case 4:
			sodaMachine.deleteSodaSlot();
			modifySodaMachine();
			break;
		case 5:
			printMainMenu();
			break;
		default:
			System.out.println("Invalid Choice");
			modifySodaMachine();
		}
	}

	public static void modifySnackMachine() {
		SnackMachine snackMachine = new SnackMachine();

		System.out.println("Please select what you would like to modify...");
		System.out.println("1 - Increase snack price");
		System.out.println("2 - Decrease snack price");
		System.out.println("3 - Increase snack capacity");
		System.out.println("4 - Decrease snack capacity");
		System.out.println("5 - Go back to Main Menu");
		System.out.print("User choice: ");

		int snackChoice;
		snackChoice = sc.nextInt();

		switch (snackChoice) {
		case 1:
			snackMachine.increaseSnackPrice();
			modifySnackMachine();
			break;
		case 2:
			snackMachine.decreaseSnackPrice();
			modifySnackMachine();
			break;
		case 3:
			snackMachine.addSnackSlot();
			modifySnackMachine();
			break;
		case 4:
			snackMachine.deleteSnackSlot();
			modifySnackMachine();
			break;
		case 5:
			printMainMenu();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

	public static void modifyComboMachine() {
		ComboMachine comboMachine = new ComboMachine();

		System.out.println("Please select what you would like to modify...");
		System.out.println("1 - Increase snack price");
		System.out.println("2 - Decrease snack price");
		System.out.println("3 - Increase snack capacity");
		System.out.println("4 - Decrease snack capacity");
		System.out.println("5 - Increase soda price");
		System.out.println("6 - Decrease soda price");
		System.out.println("7 - Increase soda capacity");
		System.out.println("8 - Decrease soda capacity");
		System.out.println("9 - Go back to Main Menu");
		System.out.print("User choice: ");

		int comboChoice;
		comboChoice = sc.nextInt();

		switch (comboChoice) {
		case 1:
			comboMachine.increaseSnackPrice();
			modifyComboMachine();
			break;
		case 2:
			comboMachine.decreaseSnackPrice();
			modifyComboMachine();
			break;
		case 3:
			comboMachine.addSnackSlot();
			modifyComboMachine();
			break;
		case 4:
			comboMachine.deleteSnackSlot();
			modifyComboMachine();
			break;
		case 5:
			comboMachine.increaseSodaPrice();
			modifyComboMachine();
			break;
		case 6:
			comboMachine.decreaseSodaPrice();
			modifyComboMachine();
			break;
		case 7:
			comboMachine.addSodaSlot();
			modifyComboMachine();
			break;
		case 8:
			comboMachine.deleteSodaSlot();
			modifyComboMachine();
			break;
		case 9:
			printMainMenu();
			break;
		default:
			System.out.println("Invalid Choice");
			modifyComboMachine();
		}
	}

	public static void deleteMachine() {
		// Print VMM delete options
		System.out.println("Please select a machine to delete...");
		System.out.println("1 - Soda Machine with 8 slots");
		System.out.println("2 - Snack Machine with 40 slots");
		System.out.println("3 - Soda and Snack Machine Combo");
		System.out.println("4 - Go back to Main Menu");
		System.out.print("User choice: ");

		int deleteChoice;
		deleteChoice = sc.nextInt();

		switch (deleteChoice) {
		case 1:
			System.out.println("Soda Machine has been deleted!");
			SodaMachine sodaMachine = new SodaMachine();
			sodaMachine = null;

			printMainMenu();
			break;
		case 2:
			System.out.println("Snack Machine has been deleted!");
			SnackMachine snackMachine = new SnackMachine();
			snackMachine = null;

			printMainMenu();
			break;
		case 3:
			System.out.println("Combo Machine has been deleted!");
			ComboMachine comboMachine = new ComboMachine();
			comboMachine = null;

			printMainMenu();
			break;
		case 4:
			printMainMenu();
			break;
		default:
			System.out.println("Invalid response");
		}
	}

}

/** SnackMachine.java
 * 
 * @author Ronnie W
 *
 */

public class SnackMachine {
	static int SNACK_PRICE = 3; // Snack price is set at 3 quarters
	static int SNACK_CAPACITY = 40; // Snack capacity is set at 40 slots

	int snackItems;
	int balance;
	int revenue;

	SnackMachine() {
		snackItems = SNACK_CAPACITY;
		balance = 0;
		revenue = 0;
	}

	int getBalance() {
		return balance;
	}

	int getRevenue() {
		return revenue;
	}

	void insertCoin() {
		balance++;
	}

	int refund() {
		int amount = balance;
		balance = 0;
		return amount;
	}

	int addSnackSlot() {
		SNACK_CAPACITY++;
		return SNACK_CAPACITY;
	}

	int deleteSnackSlot() {
		SNACK_CAPACITY--;
		return SNACK_CAPACITY;
	}

	int increaseSnackPrice() {
		SNACK_PRICE++;
		return SNACK_PRICE;
	}

	int decreaseSnackPrice() {
		SNACK_PRICE++;
		return SNACK_PRICE;
	}

	boolean vendSnack() {
		if (snackItems >= 1 && balance >= SNACK_PRICE) {
			snackItems--;
			balance -= SNACK_PRICE;
			revenue += SNACK_PRICE;
			return true;
		} else {
			return false;
		}
	}

	void restock() {
		snackItems = SNACK_CAPACITY;
	}

}

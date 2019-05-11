/** ComboMachine.java
 * 
 * @author Ronnie W
 *
 */

public class ComboMachine {
	static int SODA_PRICE = 2; // Soda price is set at 2 quarters
	static int SODA_CAPACITY = 8; // Soda capacity is set at 8 slots
	static int SNACK_PRICE = 3; // Snack price is set at 3 quarters
	static int SNACK_CAPACITY = 20; // Snack capacity is set at 20 slots

	int sodaCans;
	int snackItems;
	int balance;
	int revenue;

	ComboMachine() {
		sodaCans = SODA_CAPACITY;
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

	int addSodaSlot() {
		SODA_CAPACITY++;
		return SODA_CAPACITY;
	}

	int deleteSodaSlot() {
		SODA_CAPACITY--;
		return SODA_CAPACITY;
	}

	int addSnackSlot() {
		SNACK_CAPACITY++;
		return SNACK_CAPACITY;
	}

	int deleteSnackSlot() {
		SNACK_CAPACITY--;
		return SNACK_CAPACITY;
	}

	int increaseSodaPrice() {
		SODA_PRICE++;
		return SODA_PRICE;
	}

	int decreaseSodaPrice() {
		SODA_PRICE--;
		return SODA_PRICE;
	}

	int increaseSnackPrice() {
		SNACK_PRICE++;
		return SNACK_PRICE;
	}

	int decreaseSnackPrice() {
		SNACK_PRICE++;
		return SNACK_PRICE;
	}

	boolean vendComboSoda() {
		if (sodaCans >= 1 && balance >= SODA_PRICE) {
			sodaCans--;
			balance -= SODA_PRICE;
			revenue += SODA_PRICE;
			return true;
		} else {
			return false;
		}
	}

	boolean vendComboSnack() {
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
		sodaCans = SODA_CAPACITY;
		snackItems = SNACK_CAPACITY;
	}

}

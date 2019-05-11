/** SodaMachine.java
 * 
 * @author Ronnie W
 *
 */
public class SodaMachine {
	static int SODA_PRICE = 2; // Soda Price is set at 2 quarters
	static int SODA_CAPACITY = 8; // Soda Capacity is set at 8 slots

	int sodaCans;
	int balance;
	int revenue;

	SodaMachine() {
		sodaCans = SODA_CAPACITY;
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

	int increaseSodaPrice() {
		SODA_PRICE++;
		return SODA_PRICE;
	}

	int decreaseSodaPrice() {
		SODA_PRICE--;
		return SODA_PRICE;
	}

	boolean vendSoda() {
		if (sodaCans >= 1 && balance >= SODA_PRICE) {
			sodaCans--;
			balance -= SODA_PRICE;
			revenue += SODA_PRICE;
			return true;
		} else {
			return false;
		}
	}

	void restock() {
		sodaCans = SODA_CAPACITY;
	}

}

package be.guldentops.geert.oop.examples;

public class ArrayExamples {

	public static void main(String[] args) {
//		create table orders (
//			id number(9),
//			name varchar2(100),
//			price number(9)
//		)

		/**
		 * Name     | unit price | volume | country code
		 *
		 * Vania    | 1000 euro  | 2      | ID
		 * Geert    | 2000 euro  | 3      | BE
		 * Astrid   | 3000 euro  | 4      | BE
		 * ...
		 */
		// an Array contains MULTIPLE VALUES
		String[] names = new String[] { "Vania", "Geert" };
		int[] prices = new int[] { 1000, 2000 };
		String[] countryCodes = new String[] { "ID", "BE" };

		System.out.println(names[0] + " - " + prices[1] + " - " + countryCodes[0]);

		// Create an array - I know the values
		int[] orders = new int[10];
		orders[0] = 1000;
		orders[1] = 2000;
		orders[2] = 3000;
		orders[3] = 4000;
		orders[4] = 2500;
		orders[5] = 1000;
		orders[6] = 2000;
		orders[7] = 3000;
		orders[8] = 4000;
		orders[9] = 2500;

		// while        0 1 *
		// for          0 1 *
		// do while     1 *

//		int totalOrder = 0;

		// START
//		int count = 0;

		// WHILE start - condition - change
//		while (count < orders.length /*CONDITION*/) {
//			totalOrder = totalOrder + orders[count];
//
//			// CHANGE
//			count++;
//		}

		// FOR start - condition - change
		// for (/*START*/ ; /*CONDITION*/; /*CHANGE*/) {
		// Do something interesting
		// }

		int totalOrder = 0;

		for (int count = 0; count < orders.length; count++) {
			totalOrder = totalOrder + orders[count];
		}

		System.out.println("totalOrder = " + totalOrder);
	}
}


//	int numberOfOrders = 4;
//
//	int totalOrder;
//
// condition --> boolean --> true or false
//		while(/*condition*/) {
//			totalOrder +=
//		}

//		int totalOrder = vaniaOrder + geertOrder + joskeOrder + astridOrder;

//		System.out.println("totalOrder = " + totalOrder);

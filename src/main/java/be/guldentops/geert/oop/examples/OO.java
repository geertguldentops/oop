package be.guldentops.geert.oop.examples;

public class OO {

	public static void main(String[] args) {
		//		create table orders (
//			id number(9),
//			name varchar2(100),
//			price number(9)
//		)

		/**
		 * Name     | unit price | volume | country code
		 *
		 * null     | 0          | 0      | null
		 * Vania    | 1000 euro  | 2      | ID
		 * Geert    | 2000 euro  | 3      | BE
		 * Astrid   | 3000 euro  | 4      | BE
		 * ...
		 */

		// to create vania's row
		Order vaniaRow = new Order("Vania", 1000, 2, "ID");
		int vaniaRowTotalPrice = vaniaRow.calculateTotalPrice();

		System.out.println("vaniaRowTotalPrice = " + vaniaRowTotalPrice);

		Order geertRow = new Order("Geert", 2000, 3, "BE");
		int geertRowTotalPrice = geertRow.calculateTotalPrice();

		System.out.println("geertRowTotalPrice = " + geertRowTotalPrice);

		Order astridRow = new Order("Astrid", 4000, 1, "BE");
		astridRow.changePriceTo(2000);

		Order[] orders = new Order[3];
		orders[0] = vaniaRow;
		orders[1] = geertRow;
		orders[2] = astridRow;

		// Given the orders array - give me total price of all the orders in Belgium

		int belgiumPrices = 0;

		for (int i = 0; i < orders.length; i++) {
			Order anOrder = orders[i];

			if (anOrder.getCountryCode() == "BE") {
				belgiumPrices += anOrder.calculateTotalPrice();
			}
		}

		System.out.println("belgiumPrices = " + belgiumPrices);
	}

}

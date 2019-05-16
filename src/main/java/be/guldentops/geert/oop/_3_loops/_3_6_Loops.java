package be.guldentops.geert.oop._3_loops;

import javax.swing.*;

public class _3_6_Loops {

	public static void main(String[] args) {
		int number;

		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));

			if (number % 2 == 0) {
				System.out.println("Your number was even");
			} else {
				System.out.println("Your number was odd");
			}
		} while (number != 0);
	}
}

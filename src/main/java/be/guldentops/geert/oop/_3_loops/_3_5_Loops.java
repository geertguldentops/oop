package be.guldentops.geert.oop._3_loops;

import javax.swing.*;

public class _3_5_Loops {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));

			if (number % 2 == 0) {
				System.out.println("Your number was even");
			} else {
				System.out.println("Your number was odd");
			}
		}
	}
}

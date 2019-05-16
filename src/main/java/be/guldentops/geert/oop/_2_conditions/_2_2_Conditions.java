package be.guldentops.geert.oop._2_conditions;

import javax.swing.*;

public class _2_2_Conditions {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Enter a number bigger than 100: ");

		int number = Integer.parseInt(sNumber);

		if (number < 100) {
			System.out.println("Please enter a bigger number");
		}

		if (number == 100) {
			System.out.println("Almost correct");
		}

		if (number > 100) {
			System.out.println("Correct!");
		}
	}
}

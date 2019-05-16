package be.guldentops.geert.oop._2_conditions;

import javax.swing.*;

public class _2_1_Conditions {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Enter your exam result: ");

		int number = Integer.parseInt(sNumber);

		if (number >= 8) {
			System.out.println("Great!");
		}

		if (number > 5) {
			System.out.println("Step up your game");
		}

		if (number <= 5) {
			System.out.println("Oops, how did that happen?");
		}

		if (number == 0) {
			System.out.println("What a shame!");
		}
	}
}

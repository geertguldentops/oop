package be.guldentops.geert.oop._2_conditions;

import javax.swing.*;

public class _2_7_Conditions {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

		if (number > 0) {
			if (number < 5) {
				System.out.println("Positive, smaller than 5");
			} else if (number > 500) {
				System.out.println("Positive, bigger than 500");
			} else {
				System.out.println("Positive");
			}
		} else if (number < 0) {
			if (number > -5) {
				System.out.println("Negative, but bigger than -5");
			} else if (number < -500) {
				System.out.println("Negative and smaller than -500");
			} else {
				System.out.println("Negative");
			}
		} else {
			System.out.println("Zero");
		}
	}
}

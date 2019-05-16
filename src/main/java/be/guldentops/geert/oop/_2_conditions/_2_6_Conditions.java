package be.guldentops.geert.oop._2_conditions;

import javax.swing.*;

public class _2_6_Conditions {

	public static void main(String[] args) {
		int min = Integer.parseInt(JOptionPane.showInputDialog("Enter a minimum: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Enter a maximum: "));

		int b = (int) (Math.random() * (max + 1 - min) + min);
		int a = (int) (Math.random() * (max + 1 - min) + min);
		int c = (int) (Math.random() * (max + 1 - min) + min);
		int d = (int) (Math.random() * (max + 1 - min) + min);

		int maxNumber = a;

		if (b > maxNumber) {
			maxNumber = b;
		}
		if (c > maxNumber) {
			maxNumber = c;
		}
		if (d > maxNumber) {
			maxNumber = d;
		}

		System.out.println(maxNumber);
	}
}

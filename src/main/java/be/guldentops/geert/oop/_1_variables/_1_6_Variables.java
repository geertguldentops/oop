package be.guldentops.geert.oop._1_variables;

import javax.swing.*;

public class _1_6_Variables {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Enter a number");

		int number = Integer.parseInt(sNumber);

		System.out.println("number = " + number);
	}
}

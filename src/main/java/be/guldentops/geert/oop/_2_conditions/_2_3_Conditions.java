package be.guldentops.geert.oop._2_conditions;

import javax.swing.*;

public class _2_3_Conditions {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Enter a username: ");

		if (username.length() < 5 || username.length() > 20) {
			System.out.println("Error: invalid username!");
		}
	}
}

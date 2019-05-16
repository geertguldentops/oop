package be.guldentops.geert.oop._1_variables;

import javax.swing.*;

public class _1_7_Variables {

	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("Enter a password");
		String confirmedPassword = JOptionPane.showInputDialog("Enter the password again");

		System.out.println(password == confirmedPassword);
		System.out.println(password.equals(confirmedPassword));
	}
}

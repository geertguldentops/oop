package be.guldentops.geert.oop._3_loops;

import javax.swing.*;

public class _3_4_Loops {

	public static void main(String[] args) {

		// Infinite while loop
		while (true) {
			int number = Integer.parseInt(JOptionPane.showInputDialog("What is the answer to life, the universe and everything?"));

			if (number == 42) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.println("WRONG!");
			}
		}
	}
}

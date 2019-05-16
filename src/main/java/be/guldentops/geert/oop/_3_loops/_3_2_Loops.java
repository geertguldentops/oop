package be.guldentops.geert.oop._3_loops;

import java.util.Random;

public class _3_2_Loops {

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("FOR LOOP");
		System.out.println("====================");

		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(100);

			System.out.println(i + ". " + randomNumber);

			if (randomNumber >= 25 && randomNumber <= 50) {
				System.out.println("BREAK");
				break;
			}
		}

		System.out.println("WHILE LOOP");
		System.out.println("====================");

		int j = 0;
		while (j < 10) {
			int randomNumber = random.nextInt(100);

			System.out.println(j + ". " + randomNumber);

			if (randomNumber >= 25 && randomNumber <= 50) {
				System.out.println("BREAK");
				break;
			}

			j++;
		}

		System.out.println("DO WHILE LOOP");
		System.out.println("====================");
		int k = 0;
		do {
			int randomNumber = random.nextInt(100);

			System.out.println(k + ". " + randomNumber);

			if (randomNumber >= 25 && randomNumber <= 50) {
				System.out.println("BREAK");
				break;
			}

			k++;
		} while (k < 10);
	}
}

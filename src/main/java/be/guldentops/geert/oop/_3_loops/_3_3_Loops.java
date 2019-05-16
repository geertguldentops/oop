package be.guldentops.geert.oop._3_loops;

import java.util.Random;

public class _3_3_Loops {

	public static void main(String[] args) {
		Random random = new Random();

		int max = 0;
		for (int i = 0; i < 100; i++) {
			int randomNumber = random.nextInt(100);

			if (max < randomNumber) {
				max = randomNumber;
			}

			System.out.println(randomNumber);
		}

		System.out.println("max = " + max);
	}
}

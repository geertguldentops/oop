package be.guldentops.geert.oop._3_loops;

import java.util.Random;

public class _3_1_Loops {

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("FOR LOOP");
		System.out.println("====================");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". " + random.nextInt(100));
		}

		System.out.println("WHILE LOOP");
		System.out.println("====================");
		int j = 0;
		while (j < 10) {
			System.out.println(j + ". " + random.nextInt(100));
			j++;
		}

		System.out.println("DO WHILE LOOP");
		System.out.println("====================");
		int k = 0;
		do {
			System.out.println(k + ". " + random.nextInt(100));
			k++;
		} while (k < 10);
	}
}

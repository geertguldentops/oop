package be.guldentops.geert.oop._2_conditions;

import java.util.Random;

public class _2_5_Conditions {

	public static void main(String[] args) {
		Random random = new Random();

		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int c = random.nextInt(100);
		int d = random.nextInt(100);

		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}

		System.out.println(min);
//		System.out.println(Math.min(Math.min(Math.min(a, b), c), d));
	}
}

package be.guldentops.geert.oop._2_conditions;

import java.util.Random;

public class _2_4_Conditions {

	public static void main(String[] args) {
		Random random = new Random();

		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int c = random.nextInt(100);
		int d = random.nextInt(100);

		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		System.out.println(max);
		//		System.out.println(Math.max(Math.max(Math.max(a, b), c), d));
	}

}

package Exercicios;

import java.util.Scanner;

public class eighteenthExercise {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int F = sc.nextInt();
			int Fat = 1;
			int x;

			for(x = 1; x <= F; x++) {
				Fat = (Fat * x);
			}

			System.out.println("Fatorial de: " + F + " eh: " + Fat);

			sc.close();
		}
	}

}

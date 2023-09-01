package Exercicios;

import java.util.Scanner;

public class fourthExercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x > 0) {
			System.out.println("POSITIVO");
		} else {

			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}

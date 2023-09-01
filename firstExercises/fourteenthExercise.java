package Exercicios;

import java.util.Scanner;

public class fourteenthExercise {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x, valor;

			System.out.print("Digite seu valor de X:");
			valor = sc.nextInt();

			for(x = 1; x <= valor; x+=2) {
				System.out.println(x);
			}
			sc.close();
		}
	}
	
}

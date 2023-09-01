package Exercicios;

import java.util.Scanner;

public class eleventhExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {
			System.out.println("Digite sua Senha: ");
			senha = sc.nextInt();
			if (senha != 2002) {
				System.out.println("Senha Invalida!");
			}
		}
		System.out.println("Acesso Permitido!");

		sc.close();
	}

}

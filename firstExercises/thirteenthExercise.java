package Exercicios;

import java.util.Scanner;

public class thirteenthExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int produto = 0;
		
		while (produto != 4) {
			System.out.println("Qual o produto?");
			produto = sc.nextInt();
			
			if (produto == 1) {
				alcool += 1;
			}
			else if (produto == 2) {
				gasolina += 1;
			}
			else if (produto == 3) {
				diesel += 1;
			}
			else if (produto == 4) {
				System.out.println(" ");
			}
			else {
				System.out.println("Codigo invalido!");
			}
			
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}

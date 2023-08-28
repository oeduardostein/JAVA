package Exercicios;

import java.util.Scanner;

public class secondExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int product1,  product2;
		double price1, price2, quantity1, quantity2, count1, count2, total;

		product1 = sc.nextInt();
		quantity1 = sc.nextDouble();
		price1 = sc.nextDouble();

		product2 = sc.nextInt();
		quantity2 = sc.nextDouble();
		price2 = sc.nextDouble();

		count1 = (price1 * quantity1);
		count2 = (price2 * quantity2);
		
		total = (count1 + count2);

		System.out.println("Produto: " + product1 + " Quantidade: " + quantity1 + " e preco por unidade: " + price1);
		System.out.println("Produto: " + product2 + " Quantidade: " + quantity2 + " e preco por unidade: " + price2);
		System.out.printf("Total a pagar: % .2f", total);
		
		sc.close();
	}

}

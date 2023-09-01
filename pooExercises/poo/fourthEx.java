package poo;

import java.util.Scanner;

import entities.conversorMoeda;

public class fourthEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		conversorMoeda conversorMoeda;
		conversorMoeda = new conversorMoeda();
		
		System.out.println("Qual o valor da cotacao atual do dolar? ");
		conversorMoeda.dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares voce quer comprar? ");
		conversorMoeda.valor = sc.nextDouble();
		
		System.out.printf("Valor a pagar: %.2f", conversorMoeda.conversor());
		
		sc.close();
	}

}

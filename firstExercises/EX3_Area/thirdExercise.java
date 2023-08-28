package Exercicios;

import java.util.Scanner;

public class thirdExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variables
		float A, B, C;
		float TRIANGULO, TRAPEZIO, QUADRADO, RETANGULO;
		double pi = 3.14159, CIRCULO;
		
		System.out.println("Digite o valor de A, B e C:");
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		TRIANGULO = (A * C) / 2;
		CIRCULO = ((C *C)* pi);
		TRAPEZIO = ((A + B) * C) / 2;
		QUADRADO = (B * B);
		RETANGULO = (A * B);
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		
		sc.close();

	}

}

package poo;


import java.util.Scanner;

import entities.retangle;

public class firstEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		retangle y;
		y = new retangle();
		
		System.out.print("Largura do retangulo: ");
		y.largura = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.print("Comprimento do retangulo: ");
		y.comprimento = sc.nextDouble();
		
		double areaY = y.area();
		double perimetroY = y.perimetro();
		double diagonalY = y.diagonal();
		
		
		System.out.println(areaY);
		System.out.println(perimetroY);
		System.out.println(diagonalY);		
		
		sc.close();
	}

}

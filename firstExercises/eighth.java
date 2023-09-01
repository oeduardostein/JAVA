package Exercicios;

import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double value;
		
		value = sc.nextDouble();
		
		if ((value >= 0) && (value <= 25)) {
			System.out.println("intervalo [0,25]");
		} else if ((value > 25) && (value <= 50)) {
			System.out.println("intervalo [25,50]");
		} else if ((value > 50) && (value <= 75)) {
			System.out.println("intervalo [50,75]");
		} else if ((value > 75) && (value <= 100)) {
			System.out.println("intervalo [75,100]");
		}
		
		sc.close();
	}

}

package Exercicios;

import java.util.Scanner;

public class sixthExercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if ((x % y) == 0) {
			System.out.println("sao multiplos");
		} else if ((y % x) == 0) {
			System.out.println("sao multiplos");
		} else {
			System.out.println("nao sao multiplos");
		}
		
		sc.close();
	}

}

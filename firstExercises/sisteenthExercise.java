package Exercicios;

import java.util.Scanner;

public class sisteenthExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		
		int N = sc.nextInt();
		
		for(int x = 0; x < N; x++) {
		
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();	
			
			double media = ((v1 * 2.0) + (v2 * 3.0) + (v3 * 5.0)) / 10;
			
			System.out.printf("media: %.1f", media);
			
		}
		sc.close();
	}

}

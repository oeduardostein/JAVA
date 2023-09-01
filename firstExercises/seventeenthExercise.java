package Exercicios;

import java.util.Scanner;

public class seventeenthExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			double calc = a / b;
			
			if (b == 0.0) {
				System.out.println("Divisao impossivel");
			
			}else {
				System.out.println("divisao: " + calc);
			}
		}
		
		sc.close();

	}

}

package Exercicios;

import java.util.Scanner;

public class nineteenthExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		for (int j = N; j > 0; j--) {
			for(int i = 1; i <= N; i++) {
				
				if (N == i * j) {
					System.out.println(i);
					
				}
			}
		}
		
		sc.close();
	}

}

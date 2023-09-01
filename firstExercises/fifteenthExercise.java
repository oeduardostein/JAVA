package Exercicios;

import java.util.Scanner;

public class fifteenthExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0, out = 0;
		int N = sc.nextInt();
		int vet[] = {0, 0, 0, 0, 0};
		int y = 0;
		
		for (int x = 0; x < N; x++) {
			y = sc.nextInt();
			vet[x] = y;
			if ((vet[x] >= 10) && (vet[x] <= 20)) {
				in++;
			} else {
				out++;
			}
		
		}
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		
		sc.close();
	}

}

package Exercicios;

import java.util.Scanner;

public class twentiethExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), dobro = 0, cubo = 0;
		
		for(int i = 1; i <= N; i++) {
			dobro = i * i;
			cubo = i * i * i;
			System.out.println(i + " " + dobro + " " + cubo);
		}
		
		

		sc.close();
	}

}

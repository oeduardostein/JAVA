package Exercicios;

import java.util.Scanner;

public class seventhExercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim, tempoDeJogo;

		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		tempoDeJogo = horaFim - horaInicio;
		
		if (horaInicio > 24) {
			System.out.println("invalido, dia nao passa de 24 horas");
		} else if (horaFim > 24) {
			System.out.println("invalido, dia nao passa de 24 horas");
		}else if (tempoDeJogo > 24) {
			System.out.println("invalido, jogo nao passa de 24 horas");			
		} else if (horaFim == horaInicio) {
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if ((horaInicio > horaFim)  && (tempoDeJogo < 0)) {
			tempoDeJogo = ((24 - horaInicio) + horaFim);
			System.out.println("O JOGO DUROU " + tempoDeJogo + " HORAS");
		} else if ((horaFim > horaInicio) && (tempoDeJogo < 0)) {
			System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");			
		} else if (tempoDeJogo > 0) {
			System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
		}
		
		sc.close();
	}

}

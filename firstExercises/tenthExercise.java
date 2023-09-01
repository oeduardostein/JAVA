package Exercicios;

import java.util.Scanner;

public class tenthExercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double taxacao, salarioParaImposto1, salarioParaImposto2, salarioParaImposto3, taxa1, taxa2, taxa3;
		
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if ((salario > 2000.00) && (salario <= 3000.00)) {
			salarioParaImposto1 = salario - 2000.00;
			taxacao = (salarioParaImposto1 /= 100) * 8;
			System.out.println("Imposto de Renda: " + taxacao);
		} else if ((salario > 3000.00) && (salario <= 4500.00)) {
			salarioParaImposto2 = salario - 3000.00;
			taxa2 = (salarioParaImposto2 /= 100) * 18;
			salarioParaImposto1 = 3000.00 - 2000.00;
			taxa1 = (salarioParaImposto1 /= 100) * 8;
			taxacao = taxa1 + taxa2; 
			System.out.println("Imposto de Renda: " + taxacao);
		} else if (salario > 4500.00) {
			salarioParaImposto3 = salario - 4500.00;
			taxa3 = (salarioParaImposto3 /= 100) * 28;
			salarioParaImposto2 = 4500.00 - 3000.00;
			taxa2 = (salarioParaImposto2 /= 100) * 18;
			salarioParaImposto1 = 3000.00 - 2000.00;
			taxa1 = (salarioParaImposto1 /= 100) * 8;
			taxacao = taxa1 + taxa2 + taxa3;
			
			System.out.println("Imposto de Renda: " + taxacao);
		}
		
		sc.close();
	}

}

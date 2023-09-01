package poo;

import java.util.Scanner;

import entities.aluno;

public class thirdEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		aluno aluno;
		aluno = new aluno();
		
		aluno.nome = sc.nextLine();
		aluno.primeiro = sc.nextDouble();
		aluno.segundo = sc.nextDouble();
		aluno.terceiro = sc.nextDouble();
		
		System.out.printf("Media Final: %.2f%n", aluno.mediaFinal());
		if (aluno.mediaFinal() > 60) {
			System.out.print("Aprovado!");
		} else {
			System.out.println("Reprovado! ");
			System.out.printf("Faltaram: %.2f pontos", aluno.notaRestante());
		}
		
		
		sc.close();
	}

}

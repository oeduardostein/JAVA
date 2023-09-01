package poo;

import java.util.Scanner;
import entities.funcionario;

public class secondEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		funcionario funcionario;
		funcionario = new funcionario();
		
		
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario.nome + " " + funcionario.salarioLiquido());
		System.out.println("Quantos % aumentar o salario?");
		
		double porcentagem = sc.nextDouble();
		funcionario.aumentoEmPorcentagem(porcentagem);
		
		System.out.println("Dados Atualizados: " + funcionario.nome + " " + funcionario.salarioLiquido());
		
		sc.close();
	}

}

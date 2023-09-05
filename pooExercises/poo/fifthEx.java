package poo;

import java.util.Scanner;
import entities.contaBancaria;

public class fifthEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Coloque seu numero de conta bancária: ");
		int numeroConta = sc.nextInt();
		System.out.print("Insira seu nome: ");
		sc.nextLine();
		String titularConta = sc.nextLine();
		System.out.println("O titular da conta deseja inserir um valor inicial? (s/n)");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {	
			System.out.println("Insira o valor que deseja depositar inicalmente: ");
			valor = sc.nextDouble();
		} else {
			valor = 0.00;
		}
		
		contaBancaria contaBancaria = new contaBancaria(numeroConta, titularConta, valor);
		
		System.out.println("Dados atualizados: ");
		System.out.println("Numero da conta: " + contaBancaria.numeroConta + ", Nome: " + contaBancaria.titularConta + ", Saldo da Conta: " + contaBancaria.valor);
		
		System.out.println("Insira (d) para deposito ou (s) para saque: ");
		resposta = sc.next().charAt(0);
		
		if (resposta == 'd') {	
			System.out.println("Insira o valor que deseja depositar: ");
			valor = sc.nextDouble();
			contaBancaria.deposito(valor);
		} else {
			System.out.println("Insira o valor que deseja sacar: ");
			valor = sc.nextDouble();
			contaBancaria.saque(valor);
		}
		
		System.out.println("Dados atualizados: ");
		System.out.println("Numero da conta: " + contaBancaria.numeroConta + ", Nome: " + contaBancaria.titularConta + ", Saldo da Conta: " + contaBancaria.valor);
		
		
		
		sc.close();
	}

}

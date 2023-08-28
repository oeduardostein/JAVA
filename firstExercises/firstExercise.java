package Exercicios;

import java.util.Scanner;

public class firstExercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int registerNumber;
		double workHours;
		double valueForHour;
		double Salary;
		
		System.out.println("Digite seu número no registro dos trabalhadores, seu número de horas trabalhadas e quanto recebe por hora");
		
		registerNumber = sc.nextInt();
		workHours = sc.nextDouble();
		valueForHour = sc.nextDouble();
		
		Salary = workHours * valueForHour;
		
		System.out.println("Numero: " + registerNumber);
		System.out.printf("Salario: U$%.2f", Salary);
		
		sc.close();
	}

}

package entities;

public class contaBancaria {
	
	public int numeroConta;
	public String titularConta;
	public double valor;
	
	public contaBancaria(int numeroConta, String titularConta, double valor) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.valor = valor;
	}
	
	public contaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}
	
	public void deposito(double valor) {
		this.valor += valor;
	}
	
	public void saque(double valor) {
		this.valor -= valor + 5.00;
	}
	
	
	
}

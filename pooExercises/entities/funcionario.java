package entities;

public class funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		return salarioBruto - imposto;
	}
	
	public void aumentoEmPorcentagem(double porcentagem) {
		double p = porcentagem / 100;
		double aumento = this.salarioBruto * p;
		this.salarioBruto += aumento;
	}
}

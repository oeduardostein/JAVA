package entities;

public class conversorMoeda {
	public double dolar;
	public double valor;
	
	public double conversor() {
		double valorConvertido = valor * dolar;
		double impostoAplicado = valorConvertido * 0.06;
		return valorConvertido + impostoAplicado;
	}
	
}

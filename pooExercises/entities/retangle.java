package entities;

public class retangle {
	public double comprimento;
	public double largura;


public double area() {
	return (comprimento * largura);
	
}

public double perimetro() {
	return (2 * comprimento) + (2 * largura);
}

public double diagonal() {
	return Math.sqrt((comprimento * comprimento) + (largura * largura));
}
}
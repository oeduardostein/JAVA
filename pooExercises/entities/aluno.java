package entities;

public class aluno {
	public String nome;
	public double primeiro;
	public double segundo;
	public double terceiro;
	public int aprovado = 0, reprovado = 0;
	
	public double mediaFinal() {
		return primeiro + segundo + terceiro;		
	}
	
	public double notaRestante() {
		if (mediaFinal()<60) return 60 - mediaFinal();
		else return 0.00;
	}
}

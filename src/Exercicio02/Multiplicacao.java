package Exercicio02;

public class Multiplicacao extends Operacao {
	
	public String nome;
	
	public Multiplicacao (int a, int b) {
		super(a, b);
	}

	@Override
	int efetuar() {
		return a * b;		
	}
}

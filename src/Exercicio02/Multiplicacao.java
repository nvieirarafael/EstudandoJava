package Exercicio02;

public class Multiplicacao extends Operacao {
	
	public Multiplicacao (int a, int b) {
		super(a, b);
	}

	@Override
	int efetuar() {
		return a * b;		
	}
}

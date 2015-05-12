package Exercicio02;

public class Subtracao extends Operacao{
	
	public Subtracao(int a, int b) {
		super(a, b);
	}

	@Override
	int efetuar() {
		return a - b;	
	}
}

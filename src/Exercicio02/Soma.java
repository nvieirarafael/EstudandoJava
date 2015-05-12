package Exercicio02;

public class Soma extends Operacao{

	public Soma(int a, int b) {
		super(a, b);
	}

	@Override
	int efetuar() {
		return a + b;		
	}
	
}

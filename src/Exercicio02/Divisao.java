package Exercicio02;

public class Divisao extends Operacao{

	public Divisao(int a, int b) {
		super(a, b);	
	}

	@Override
	int efetuar() {
			return a / b;
	}
	
	

}

package Exercicio02;

public class Fatoracao extends Operacao {

	public Fatoracao(int a, int b) {
		super(a, b);
	
	}

	@Override
	int efetuar() {
		int temp = a;		
		a--;
		if(a > 1)			
			return temp * this.efetuar();
		else
			return a;
	}

}

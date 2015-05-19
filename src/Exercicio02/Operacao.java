package Exercicio02;

public abstract class Operacao {
	
	protected int b;
	protected int a;
		
	public Operacao(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	


	abstract int efetuar();
	
	
	
}

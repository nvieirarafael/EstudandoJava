package exercicio01.calculadora01;

public class Fatorial extends Operacao {

	public Fatorial(int a) {
		super(a, 0);	
	}

	@Override
	int efetuar() {
		int temp = a;		
		a--;
		
		if(a > 1){
			return temp * this.efetuar();
		}			
		
		return temp;
	}

}

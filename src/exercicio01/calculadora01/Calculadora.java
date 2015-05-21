package exercicio01.calculadora01;

public class Calculadora {
	
	int calcular(Operacao operacao){
		try{
			return operacao.efetuar();
		} catch (ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
	}	
}

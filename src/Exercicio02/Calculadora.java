package Exercicio02;

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

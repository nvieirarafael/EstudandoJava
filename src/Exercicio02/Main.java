package Exercicio02;

public class Main {
	
	public static void main(String[] args){
		
		Calculadora calculadora = new Calculadora();
		
		int resultSoma = calculadora.calcular(new Soma(1,2));
		
		int resultSubtracao = calculadora.calcular(new Subtracao(2,1));
		
		int resultDivisao = calculadora.calcular(new Divisao(2,0));
		
		int resultMultiplicacao = calculadora.calcular(new Multiplicacao(7, 8));
		
		System.out.println("A soma foi: " + resultSoma + ", "
						 + "a subtracao foi " + resultSubtracao + " "
						 + "e a divisão foi " + resultDivisao + " "
						 + "e a multiplicação foi " + resultMultiplicacao);
	}
	
}

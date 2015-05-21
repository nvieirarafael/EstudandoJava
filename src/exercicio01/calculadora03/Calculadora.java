package exercicio01.calculadora03;

public class Calculadora {
	int entrada1 ;
	Integer entrada2;
	char operador;
	float resultado;
	
	public void somar() {
		resultado=entrada1 + entrada2;
		
	}
	public void dividir() {
		resultado=entrada1 / entrada2;
		
	}
	public void subtrair() {
		resultado=entrada1 - entrada2;
		
	}
	public void multiplicar() {
		resultado=entrada1 * entrada2;
		
	}
	
	public void verificarOperacao(){
		if (operador == '+') {
			somar();
			System.out.println(resultado);
			
		}
		else if (operador == '-') {
				subtrair();
				System.out.println("O resultado foi " + resultado);
			
		}
		else if (operador == '*') {	
				multiplicar();
				System.out.println("O resultado foi " + resultado);
		}
		else if (operador == '/') {
			 	dividir();
			 	System.out.println("O resultado foi " + resultado);	
		}
	}
}
	
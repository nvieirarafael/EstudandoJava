package exercicio03;

public class Calculadora extends Operacao {
	
	float resultado;
	
	void Calcular() {

		switch (operacao) {
		case 'd':
			resultado = Dividir();
			break;
		case 's':
			resultado = Subtrair();
			break;
		case 'a':
			resultado = Adicionar();
			break;			
		case 'm':
			resultado = Multiplicar();
			break;			
			
		default:
			break;
		}
		System.out.println("O resultado é: "+ resultado);
	
	}	

}


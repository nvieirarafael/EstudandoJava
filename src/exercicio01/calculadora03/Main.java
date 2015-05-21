package exercicio01.calculadora03;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.entrada1 = 58;
		calculadora.entrada2 = 15;
		calculadora.operador = '-';
		
		calculadora.verificarOperacao();

		Calculadora calculadoraAmarela = new Calculadora();
		calculadoraAmarela.entrada1 = 7;
		calculadoraAmarela.entrada2 = 8;
		calculadoraAmarela.operador = '*';
		
		calculadoraAmarela.verificarOperacao();;
	}

}

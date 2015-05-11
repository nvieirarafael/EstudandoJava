package exercicio03;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Calculadora calc = new Calculadora();
		
		calc.x1 = 10;
		calc.x2 = 5;
		calc.operacao = 'm';
		float resultado = 0;
		
		switch (calc.operacao) {
		case 'd':
			resultado = calc.Dividir();
			break;
		case 's':
			resultado = calc.Subtrair();
			break;
		case 'a':
			resultado = calc.Adicionar();
			break;			
		case 'm':
			resultado = calc.Multiplicar();
			break;			
			
		default:
			break;
		}
		
		System.out.println("O resultado é: "+ resultado);
		
	}

}

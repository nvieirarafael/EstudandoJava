package exercicio01.calculadora02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculadora calc = new Calculadora();
		
		calc.x1 = 10;
		calc.x2 = 0;
		calc.operacao = 'd';
		calc.Calcular();		

		
		
		Calculadora calcAzul = new Calculadora();
		
		calcAzul.x1 = 7;
		calcAzul.x2 = 8;
		calcAzul.operacao = 'm';
		calcAzul.Calcular();

	}

}

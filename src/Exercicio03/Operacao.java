package Exercicio03;



public class Operacao {
	
	public int x1;
	public int x2;
	public char operacao;	
		
	
	public int Adicionar() {

	
		return x1 + x2;
	}

	public int Subtrair() {

		
		return x1 - x2;
	}
	
	public int Multiplicar() {

		
		return x1 * x2;
	}
	
	public float Dividir() {
		
		try
		{
			return x1/x2;
		}
		catch (Exception ex)
		{
			System.out.println("Erro na divisão!!!");
			return 0;
		}
		

		
	}
	
	
	
}


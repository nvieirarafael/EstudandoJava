package exercicio01;

public class main {

	public static void main(String[] args) {
		Carro hb20Novo = new Carro();
		Carro hb20Velho = new Carro();

		hb20Novo.ano = 2015;
		hb20Velho.ano = 2000;

		hb20Novo.correr();
		hb20Velho.correr();

		System.out.println("carro: " + hb20Novo);

		Carro.bater(hb20Novo);

		hb20Novo.correr();
	}

}
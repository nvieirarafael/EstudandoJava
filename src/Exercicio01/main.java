package Exercicio01;

public class main {

	public static void main(String[] args) {
		Carro hb20Novo = new Carro();
		Carro hb20Velho = new Carro();
		CarroFiat palio = new CarroFiat("palio","2015");
		
		hb20Novo.ano = 2015;
		hb20Velho.ano = 2000;
		palio.cor = "Preto";
		
		palio.qtdLitros=50;
		palio.nome = "corsa";
		
		main.facaAlgumaCoisaComCarros(palio);
	}
	
	public static void facaAlgumaCoisaComCarros(Carro carro) {
		carro.correr();
	}

}

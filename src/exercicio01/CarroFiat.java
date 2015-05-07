package exercicio01;

public class CarroFiat extends Carro {
	int qtdLitros;
	public String nome;

	public CarroFiat(int qtdLitros) {
		super();
		this.qtdLitros = qtdLitros;
	}
		
	public CarroFiat(String nome, String modelo) {
		super(modelo);
		this.nome = nome;
		
	}


}

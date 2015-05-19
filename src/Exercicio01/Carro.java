package Exercicio01;

public class Carro {

	public String modelo;
	public Integer ano;
	public String cor;
	public char nomes;
	
	
	
	public Carro(String modelo) {
		super();
		this.modelo = modelo;
	}
	
	public Carro() {
		super();
	}

	public void correr(){
		int velocity = ano / 10;
		System.out.println("Velocity: " + velocity);
		System.out.println("correndo com carro simples");
	}

	public static void bater(Carro carro){
		carro.ano -= 150;
		System.out.println("carro: " + carro);
	}

}

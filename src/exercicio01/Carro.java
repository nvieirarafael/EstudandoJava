package exercicio01;

public class Carro {

	public String modelo;
	public Integer ano;

	public void correr(){
		int velocity = ano / 10;

		System.out.println("Velocity: " + velocity);
	}

	public static void bater(Carro carro){
		carro.ano -= 150;
		System.out.println("carro: " + carro);
	}

}

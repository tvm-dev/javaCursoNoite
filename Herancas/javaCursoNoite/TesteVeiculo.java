package javaCursoNoite;

public class TesteVeiculo {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corrola", 2004, 4);
		Moto moto = new Moto("Honda", "CB500", 2019, true);

		System.out.println("Detalhes do Carro: ");
		carro.exibirDetalhes();
		
		System.out.println("\nDetalhes da Moto: ");
		moto.exibirDetalhes();

	}
}

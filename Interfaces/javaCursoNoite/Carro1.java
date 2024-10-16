package javaCursoNoite;

public class Carro1 implements Veiculo1  {
	// Construtor sem parametros(necessário para a linha 'new Carro()')

	public Carro1() {
		// se houver lógica de inicialização, insira-a aqui!

	}

	@Override
	public void banana() {
		System.out.println("O carro está acelerando...");
	}

	@Override //Sobrescrever!
	public void frear() {
		 System.out.println("O carro está freando...");
	}

}

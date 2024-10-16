package javaCursoNoite;

public class TesteInteface {
	public static void main(String[] args) {
		Veiculo1 meuCarro = new Carro1();
		Veiculo1 minhaBike = new Bicicleta();
		
		//Usando o carro:
		meuCarro.banana();
		meuCarro.frear();
		
		
		minhaBike.banana();
		minhaBike.frear();
		
		
	}

}

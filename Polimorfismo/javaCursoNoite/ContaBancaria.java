package javaCursoNoite;

public class ContaBancaria {
	// Criando atributo privado:
	private double saldo;

	// Criando método construtor para iniciar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Método público para depositar dinheiro na conta:
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor; // saldo = saldo + valor;
			System.out.println("Depósito de R$ " + valor + " realizado!");
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}

	// Método para sacar dinheiro da conta:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor; // saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado com Sucesso!");
		} else {
			System.out.println("Saque inválido: saldo insuficiente ou valor negativo!");

		}

	}
	//Método público para consultar o saldo (getter):
	public double getSaldo() {
		return saldo;
	}
}


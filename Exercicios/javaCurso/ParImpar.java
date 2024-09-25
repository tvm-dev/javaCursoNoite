package javaCurso;
import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int valor = scanner.nextInt();
		if (valor % 2 == 0) {
			System.out.println("Número Par");
		} else {
			System.out.println("O numero é Ímpar");
		}		
	}

}

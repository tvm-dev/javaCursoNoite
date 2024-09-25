package javaCurso;

public class TabuadaFor {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Tabuada do "+ n + ":");
		for (int i = 1; i <= 12; i++) {
			int resultado = n * i;
		System.out.println(n + "x" + i + "="+ resultado);
		}
	}
}

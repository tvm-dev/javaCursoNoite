package javaCursoNoite;

public class ManipulandoStrings {

	public static void main(String[] args) {
		//Criando Strings:
		String texto = "bem vindo ao Curso Intermediário de Java";
		String texto2 = "Vamos aprender sobre Strings!";
				
		//1.Comprimento da string:
		//System.out.println("Comprimento da string: " + texto.length());
		
		//2.Concatenar Strings:
		//String textoCompleto = "\n"+ texto +"\n"+ texto2;
		String textoCompleto = texto + texto2;
		//System.out.println("Texto Completo: "+textoCompleto);
		
		//3.Converte/r para MAIÚSCULAS E minúsculas:
		//System.out.println("MAIÚSCULAS: "+ texto.toUpperCase());
		//System.out.println("minúsculas: "+ texto2.toLowerCase());
		
		//4.Substituir uma parte da string:
		String novoTexto = texto.replace("Java", "Doralice");
		//System.out.println("Texto após a substituição: "+ novoTexto);
		
		//5.Buscar por uma substring:
		//int posicao = texto.indexOf("curso");
		//System.out.println("Posição da palavra 'curso': "+ posicao);
	
		//6.Verificar se uma string começa ou termina com uma substring:
		//System.out.println("Começa com 'Bem': " + texto.startsWith("bem"));
		
		//7.Dividir uma String:
//		String nomeCompleto = "Thiago Viana de Menezes";
//		String[] parteDoNomeCompleto = nomeCompleto.split(" ");
//		System.out.println("Partes no nome completo: ");
//		for ( String parteDoNome : parteDoNomeCompleto  ) {
//			System.out.println(parteDoNome);
		//}
		
		//8. Remover espaços:
		String textoComEspacos = "   Texto com espaços.         ";
		
    System.out.println("Texto sem espaços: '" + textoComEspacos.trim().replaceAll("\\s+", " " ) + "'");
    /* O comando: " \\s+ " => captura todos os espaços da string
     * O comando " " => substitui todos os espaços por apenas 1.
     */
    
    
    
		
	}

}

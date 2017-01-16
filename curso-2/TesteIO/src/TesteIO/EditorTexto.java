package TesteIO;

import java.io.*;
import java.util.Scanner;

public class EditorTexto {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(new FileOutputStream("texto.txt"));
		
		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		saida.close();
		entrada.close();
	}
}
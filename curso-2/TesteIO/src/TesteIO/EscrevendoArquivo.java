package TesteIO;

import java.io.*;
import java.util.Scanner;

public class EscrevendoArquivo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);

		PrintStream ps = new PrintStream("saida.txt");
		
		while (entrada.hasNextLine()) {
			ps.println(entrada.nextLine());
		}
		entrada.close();
		ps.close();
	}
}
package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<Integer>();
		//Collection<Integer> teste = new HashSet<>();
		
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto na inserção: " + tempo);

		inicio = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto na pesquisa: " + tempo);
	}
}
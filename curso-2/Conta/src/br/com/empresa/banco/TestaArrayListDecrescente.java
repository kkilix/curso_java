package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayListDecrescente {
	public static void main(String[] args) {
		ArrayList<Integer> conjunto = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			conjunto.add(i);
		}
		
		Collections.reverse(conjunto);
		
		for (Integer i : conjunto) {
			System.out.print(i + " ");
		}
	}
}

package br.com.empresa.banco;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao2 {
	public static void main(String[] args) {
		Random gerador = new Random();
		ContaPoupanca[] cp = new ContaPoupanca[4];
		List<ContaPoupanca> contas = new LinkedList<>();
		
		for (int i = 0; i < cp.length; i++) {
			Double saldo = gerador.nextDouble() * 2000;
			int conta = gerador.nextInt() * 10;
			
			cp[i] = new ContaPoupanca(conta, "Conta " + conta);
			cp[i].deposita(saldo);
			
	        contas.add(cp[i]);
		}
				
        System.out.println(contas);

	}
}

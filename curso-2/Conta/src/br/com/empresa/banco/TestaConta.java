package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		System.out.println(conta);
	}

}

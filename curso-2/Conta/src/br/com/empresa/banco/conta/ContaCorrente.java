package br.com.empresa.banco.conta;

import br.com.empresa.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente() {}
	
	public ContaCorrente(int numero, String nome) {
		super(numero, nome);		
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}

package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		/*ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();

		cc1.setNumero(10);
		cc2.setNumero(10);

		if (cc1 == cc2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		if (cc1.equals(cc2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}*/
		
		ContaCorrente cc = new ContaCorrente(6, "Leonardo");
        ContaCorrente cc2 = new ContaCorrente(6, "Leonardo");

        if (cc == cc2)
            System.out.println("mesmo objeto");
        else 
            System.out.println("outro objeto");

        if (cc.equals(cc2))
            System.out.println("objeto equivalente");
        else 
            System.out.println("objeto nao equivalente");

	}

}
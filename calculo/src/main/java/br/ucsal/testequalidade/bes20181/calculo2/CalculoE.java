package br.ucsal.testequalidade.bes20181.calculo2;

public class CalculoE {

	Double calcularE(Integer n) {
		Double e = 0d;
		for (int i = 0; i <= n; i++) {
			e += 1. / calcularFatorial(i);
		}
		return e;
	}

	Long calcularFatorial(int n) {
		Long fat = 1L;
		for (int i = 1; i <= n; i++) {
			fat *= i;
		}
		return fat;
	}

}

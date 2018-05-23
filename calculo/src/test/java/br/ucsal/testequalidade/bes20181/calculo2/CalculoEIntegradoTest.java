package br.ucsal.testequalidade.bes20181.calculo2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculoEIntegradoTest {

	CalculoE calculoE;

	@Before
	public void setup() {
		// Construção de infra-estrutura para o teste (configuração, setup)
		calculoE = new CalculoE();
	}

	@Test
	public void calculoE2() {
		// Dados de entrada
		Integer n = 2;

		// Saída esperada
		Double eEsperado = 2.5d;

		// Execução do método em teste e obtenção do resultado atual
		Double eAtual = calculoE.calcularE(n);

		// Comparar o resultado esperado com o resultado atual
		Assert.assertEquals(eEsperado, eAtual, 0.001);
	}

}

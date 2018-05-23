package br.ucsal.testequalidade.bes20181.calculo2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculoEIntegradoTest {

	CalculoE calculoE;

	@Before
	public void setup() {
		// Constru��o de infra-estrutura para o teste (configura��o, setup)
		calculoE = new CalculoE();
	}

	@Test
	public void calculoE2() {
		// Dados de entrada
		Integer n = 2;

		// Sa�da esperada
		Double eEsperado = 2.5d;

		// Execu��o do m�todo em teste e obten��o do resultado atual
		Double eAtual = calculoE.calcularE(n);

		// Comparar o resultado esperado com o resultado atual
		Assert.assertEquals(eEsperado, eAtual, 0.001);
	}

}

package br.ucsal.testequalidade.bes20181.calculo2;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculoEFatorialMockTest {

	CalculoE calculoE;

	@Before
	public void setup() {

		calculoE = spy(new CalculoE());
		
		// Opcional*
		// Definindo a uma regra de negócio para o metodo calcularFatorial da
		// classe CalculoE
		when(calculoE.calcularFatorial(0)).thenReturn(1L);
		when(calculoE.calcularFatorial(1)).thenReturn(1L);
		when(calculoE.calcularFatorial(2)).thenReturn(2L);
		// Podemos definir que o fatorial de 2 é igual 8, logo o teste do
		// calculoE dará erro, pois essa mudaça irá influenciar diretamente no
		// resultado esperado do calculoETest
		// when(calculoE.calcularFatorial(0)).thenReturn(1L);
		// when(calculoE.calcularFatorial(1)).thenReturn(1L);
		// when(calculoE.calcularFatorial(2)).thenReturn(8L);  <<--------
	}
	
	@Test
	public void calcularFatorialTest0(){
		
		Assert.assertSame(1L,calculoE.calcularFatorial(0));
	}
	
	@Test
	public void calcularFatorialTest1(){
		
		Assert.assertSame(1L,calculoE.calcularFatorial(1));
	}
	
	@Test
	public void calcularFatorialTest2(){
		
		Assert.assertSame(2L,calculoE.calcularFatorial(2));
	}
	
	
	
	

	@Test
	public void calculoETest() {

		Integer n = 2;

		Double eEsperado = 2.5d;

		Double eAtual = calculoE.calcularE(n);

		Assert.assertEquals(eEsperado, eAtual, 0.001);

	}

}

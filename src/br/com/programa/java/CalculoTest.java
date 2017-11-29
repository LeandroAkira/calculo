package br.com.programa.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTest {

	@Test
	public void testExecutarCalculo_ValoresPositivos() {
		Calculo calculo = new Calculo();
		float esperado = 6;
		float somatorio = calculo.ExecutarCalculo(1,2,3);
		assertEquals(esperado, somatorio,0);
	}
	@Test
	public void testExecutarCalculo_ValoresPositivosNegativos() {
		Calculo calculo = new Calculo();
		float esperado = 16;
		float somatorio = calculo.ExecutarCalculo(1,-5,20);
		assertEquals(esperado, somatorio,0);
	}	
	@Test
	public void testExecutarCalculo_Valores() {
		Calculo calculo = new Calculo();
		float esperado = 0;
		float somatorio = calculo.ExecutarCalculo(1,-8,5);
		assertEquals(esperado, somatorio,0);
	}	
}

package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest{

	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 15;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaSomaCorretaParaDoisInteirosNegativos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = -5;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaSubtrair() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 10;		
		int resultadoEsperado = 0;
		
		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaMultiplicar() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 2;		
		int resultadoEsperado = 20;
		
		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaDividirUm() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 2;		
		int resultadoEsperado = 5;
		
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testaDividirDois() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 1;
		int entradaNumero2 = 0;		
		int resultadoEsperado = -1;
		
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
}


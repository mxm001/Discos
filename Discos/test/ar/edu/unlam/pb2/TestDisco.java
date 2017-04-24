package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestDisco {

	@Test
	public void testParaCalcularPerimetroInterior() {
		Disco miDisco = new Disco(6.00, 7.00);
		Double Obtenido = miDisco.calcularPerimetroInterior();
		Double Esperado = 2 * Math.PI*miDisco.getRadioInterior();
		Assert.assertEquals(Esperado, Obtenido);
	}
	
	@Test
	public void testParaCalcularPerimetroExterior(){
		Disco miDisco = new Disco(6.00, 7.00);
		Double Obtenido = miDisco.calcularPerimetroExterior();
		Double Esperando = 2 * Math.PI* miDisco.getRadioExterior();
		Assert.assertEquals(Esperando, Obtenido);
	}
	
	@Test
	public void testParaCalcularSuperficie() {
		Disco miDisco = new Disco(6.00, 7.00);
		Double Obtenido = miDisco.calcularSuperficie();
		Double Esperando = Math.PI * Math.pow((miDisco.calcularPerimetroExterior()-miDisco.getRadioInterior()),2.00);
		Assert.assertEquals(Esperando, Obtenido);
	}

}

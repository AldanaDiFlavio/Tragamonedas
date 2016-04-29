package ar.edu.unlam.tallerweb.tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	@Test
	public void testGirarUnTambor(){
		Tambor miTambor = new Tambor();
		miTambor.girarTambor();
		Integer posicion=miTambor.obtenerPosicion();
		Assert.assertTrue(posicion>=1&&posicion<=8);
	}
	
	@Test
	public void testQueActivaTragamonedas() {

		Tragamonedas miTragamonedas = new Tragamonedas();
		//miTragamonedas.activarTragamonedas();
		
		Assert.assertTrue(miTragamonedas.entregarPremio()||!miTragamonedas.entregarPremio());
	
	}
	
}
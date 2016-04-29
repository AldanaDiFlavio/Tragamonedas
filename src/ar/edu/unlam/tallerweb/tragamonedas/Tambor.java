package ar.edu.unlam.tallerweb.tragamonedas;

import java.util.concurrent.ThreadLocalRandom;

public class Tambor {

	//atributos
	private Integer valorActual;
	
	public void girarTambor() {
		this.valorActual=ThreadLocalRandom.current().nextInt(1,8);
		
	}
		public Integer obtenerPosicion() {
			return this.valorActual;
		}
}

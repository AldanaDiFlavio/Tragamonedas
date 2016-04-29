package ar.edu.unlam.tallerweb.tragamonedas;

public class Tragamonedas {
	//atributos
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	//constructor
	public Tragamonedas() {
		
		this.tambor1=new Tambor();
		this.tambor2=new Tambor();
		this.tambor3=new Tambor();
	}
	//metodos
	public void activarTragamonedas() {
		tambor1.girarTambor();
		tambor2.girarTambor();
		tambor3.girarTambor();
	}
	
	public Boolean entregarPremio(){
		if(tambor1==tambor2 && tambor2==tambor3)
			return true;
		else
			return false;
	}
}

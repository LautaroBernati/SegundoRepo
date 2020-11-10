package ort.thp.objetos.tp3;

public class Raton {
	private int energia;
	private int desgaste;
	
	
	
	
	
	
	
	
	
	public Raton(int energia) {
		this.energia = energia;
		setDesgaste(2);
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getDesgaste() {
		return desgaste;
	}
	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
	}
	
	
}

package ort.thp.objetos.tp3;

public class Gato {

	private int energia;
	private int desgaste;
	
	
	
	public boolean alcanzar(Raton raton,int metros){
		boolean resultado=false;
		int distQueCorreGato=0;
		int distQueCorreRaton=0;
		
		distQueCorreGato=getEnergia();
		distQueCorreRaton=raton.getEnergia()/raton.getDesgaste();
		
		if(distQueCorreGato-metros-distQueCorreRaton >= 0){
			//System.out.println("Lo atrapo");
			resultado=true;
		}	
		else{
			//System.out.println("No lo atrapo");
		}
		
		return resultado;
	}
	
	
	
	
	//-----------------
	public Gato(int energia) {
		this.energia = energia;
		setDesgaste(1);
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

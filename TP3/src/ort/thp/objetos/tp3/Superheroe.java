package ort.thp.objetos.tp3;

public class Superheroe {
	
	private String name;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public String competir(Superheroe superheroe){
		String resultado="";
		int contador1=0;
		int contador2=0;
		
		if(this.fuerza > superheroe.getFuerza()){
			contador1++;
		}
		else if(this.fuerza<superheroe.getFuerza()){
			contador2++;
		}
		
		if(this.resistencia > superheroe.getResistencia()){
			contador1++;
		}
		else if(this.resistencia<superheroe.getResistencia()){
			contador2++;
		}
		
		if(this.superpoderes > superheroe.getSuperpoderes()){
			contador1++;
		}
		else if(this.superpoderes<superheroe.getSuperpoderes()){
			contador2++;
		}
		
		if(contador1>contador2){
			resultado="VICTORIA";
		}
		else if(contador2>contador1){
			resultado="DERROTA";
		}
		else{
			resultado="EMPATE";
		}
		
		return resultado;
	}
	
	
	
	//----------------------->>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<
	
	@Override
	public String toString() {
		return "Superheroe [name=" + name + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", superpoderes="
				+ superpoderes + "]";
	}
	public Superheroe(String name, int fuerza, int resistencia, int superpoderes) {
		setName(name);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setFuerza(int fuerza) {
		if(fuerza > 100){
			this.fuerza = 100;
		}
		else if(fuerza < 0){
			this.fuerza = 0;
		}
		else{
			this.fuerza = fuerza;
		}
	}
	private void setResistencia(int resistencia) {
		if(resistencia > 100){
			this.resistencia = 100;
		}
		else if(resistencia < 0){
			this.resistencia = 0;
		}
		else{
			this.resistencia = resistencia;
		}
	}
	private void setSuperpoderes(int superpoderes) {
		if(superpoderes > 100){
			this.superpoderes = 100;
		}
		else if(superpoderes < 0){
			this.superpoderes = 0;
		}
		else{
			this.superpoderes = superpoderes;
		}
	}
	public String getName() {
		return name;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public int getSuperpoderes() {
		return superpoderes;
	}
}

package ort.thp.objetos.tp3;

public class Automovil {//ej6
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	
	public double viajar(double km){
		double viajado=0;
		viajado=consumirCombustible(km)*getRendimientoPorLitro();
		return viajado;
	}
	
	private double consumirCombustible(double kmsAConsumir){
		//double litrosConsumidos=0;
		double LitrosAConsumir=0;
		LitrosAConsumir=(kmsAConsumir*1)/getRendimientoPorLitro();
		//System.out.println(LitrosAConsumir+" aqui debug");
		
		if(LitrosAConsumir<getCantidadDeCombustible()){
			setCantidadDeCombustible(getCantidadDeCombustible()-LitrosAConsumir);
		}
		else{
			LitrosAConsumir=getCantidadDeCombustible();
			setCantidadDeCombustible(LitrosAConsumir-getCantidadDeCombustible());
		}
		//litrosConsumidos=(kmsAConsumir*1)/getRendimientoPorLitro();//stage 2 experimental
		//setCantidadDeCombustible(getCantidadDeCombustible()-litrosConsumidos);
		return LitrosAConsumir;
	}
	
	public boolean cargarCombustible(double cantAcargar){
		boolean resultado=false;
		if (cantAcargar<getCapacidadTanque() && cantAcargar>0) {
			setCantidadDeCombustible(getCantidadDeCombustible()+cantAcargar);
			System.out.println("Carga aceptada.");
			resultado=true;
		}
		else{
			System.out.println("Carga no aceptada.");
		}
		return resultado;
	}
	
	private double espacioDisponible(){
		double espacio=0;
		espacio=getCapacidadTanque()-getCantidadDeCombustible();
		return espacio;
	}
	
	public boolean pocoCombustible(){
		boolean resultado=false;
		double porcentajeCantidad=0;
		porcentajeCantidad=(getCantidadDeCombustible()*100)/getCapacidadTanque();
		//System.out.println("% debug"+porcentajeCantidad);
		if(porcentajeCantidad<15){
			resultado=true;
		}
		return resultado;
	}
	
	
	
	
	//<<<<<<<getters-setters-constructor-toString>>>>>>>>
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		setMarca(marca);//this.marca = marca;
		setModelo(modelo);//this.modelo = modelo;
		setPatente(patente);//this.patente = patente;
		setCapacidadTanque(capacidadTanque);//this.capacidadTanque = capacidadTanque;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPatente() {
		return patente;
	}
	public double getCapacidadTanque() {
		return capacidadTanque;
	}
	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}
	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}
	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}
}

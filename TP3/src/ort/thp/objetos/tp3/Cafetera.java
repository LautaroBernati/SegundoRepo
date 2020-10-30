package ort.thp.objetos.tp3;

public class Cafetera {
	
	private int capacidadMaxima;
	private final int capacidadMinima = 250;
	private int cantidadActual;
	
	public Cafetera(){//cafetera vacia
		super();
		setCapacidadMaxima(1000);//this.capacidadMaxima = capacidadMaxima;
		setCantidadActual(0);//this.cantidadActual = cantidadActual;
	}
	
	public Cafetera(int capacidad){
		setCapacidadMaxima(capacidad);
	}
	
	public Cafetera(int capacidad, int cantidad){
		setCapacidadMaxima(capacidad);
		if(cantidad>capacidad){
			setCantidadActual(capacidad);
		}
		else{
			setCantidadActual(cantidad);
		}
	}
	
	public void llenar(){
		setCantidadActual(getCapacidadMaxima());
	}
	
	public void servirTaza (int taza){
		setCantidadActual(getCantidadActual() - taza);
	}
	
	public void vaciar(){
		setCantidadActual(0);
	}
	
	public int agregarCafe(int cafeRecibido){ //duda
		int sobrante=0;
		
		if((cafeRecibido + getCantidadActual())>getCapacidadMaxima()){
			sobrante=getCantidadActual()+cafeRecibido-getCapacidadMaxima();
			llenar();
			System.out.println("Cafetera llena. Te sobro "+sobrante+" ml de cafe.");
		}
		else{
			setCantidadActual(getCantidadActual()+cafeRecibido);
		}
		return sobrante;
	}
	
	private void setCapacidadMaxima(int capacidadMaxima) {
		if(capacidadMaxima < this.capacidadMinima){
			System.out.println("Error: Debe ingresar un valor mayor a " + this.capacidadMinima);
		}
		else{
			this.capacidadMaxima = capacidadMaxima;
			}
	}
	private void setCantidadActual(int cantidadActual) {
		if(cantidadActual < 0 || cantidadActual > getCapacidadMaxima()){
			System.out.println("Error:");
		}
		else{
			this.cantidadActual = cantidadActual;
		}
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	//seguir por el punto d
	
}

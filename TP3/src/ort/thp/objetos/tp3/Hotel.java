package ort.thp.objetos.tp3;


public class Hotel {//ejercicio 5, tp3
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	
	
	public Hotel(String nombre, String localidad, int habitacionesTotales) {
		setNombre(nombre);//this.nombre = nombre;
		setLocalidad(localidad);//this.localidad = localidad;
		setHabitacionesTotales(habitacionesTotales);//this.habitacionesTotales = habitacionesTotales;
	}
	
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas,
			int habitacionesReservadas) {
		setNombre(nombre);//this.nombre = nombre;
		setLocalidad(localidad);//this.localidad = localidad;
		setHabitacionesTotales(habitacionesTotales);//this.habitacionesTotales = habitacionesTotales;
		setHabitacionesOcupadas(habitacionesOcupadas);//this.habitacionesOcupadas = habitacionesOcupadas;
		setHabitacionesReservadas(habitacionesReservadas);//this.habitacionesReservadas = habitacionesReservadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}
	private void setHabitacionesTotales(int habitacionesTotales) {
		if(habitacionesTotales<1){//debe tener minimo 1 habitacion
			this.habitacionesTotales = 1;
		}
		else{
			this.habitacionesTotales = habitacionesTotales;
		}
	}
	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}
	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}
	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}
	private void setHabitacionesReservadas(int habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}
	
	@Override
	public String toString() {
		return String.format("Hotel %s %s [habitaciones=%d, ocupadas=%d, reservadas=%d, libres=%s, disponibles=%d]", nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas,cantidadHabitacionesLibres(), disponibilidad());
	}

	//-----metodos------
	
	public boolean reservarHabitaciones(int cantHab){
		boolean resultado=false;
		System.out.println("Intento reservar "+cantHab+" habitaciones.");
		if(cantHab>cantidadHabitacionesLibres()){
			System.out.println("No es posible reservar esa cantidad de habitaciones");
			System.out.println("Habitaciones restantes: "+cantidadHabitacionesLibres());
		}
		else{
			setHabitacionesReservadas(getHabitacionesReservadas()+cantHab);
			resultado=true;
		}
		if(resultado){
			System.out.println("Pudo reservar las habitaciones.");
		}
		else{
			System.out.println("No pudo reservar las habitaciones.");
		}
		return resultado;
	}
	
	public boolean ocuparHabitaciones(int cantHab, boolean sonDeLaReserva){
		boolean resultado=false;
		if(sonDeLaReserva){
			System.out.println("Intento ocupar "+cantHab+" habitaciones con reserva.");
		}
		else{
			System.out.println("Intento ocupar "+cantHab+" habitaciones sin reserva.");
		}
		if(sonDeLaReserva == true && cantHab <= getHabitacionesReservadas()){
			ocuparConReserva(cantHab);
			resultado=true;
		}
		
		if(sonDeLaReserva == false && cantHab <= disponibilidad()){
			ocuparSinReserva(cantHab);
			resultado=true;
		}
		if(resultado){
			System.out.println("Pudo ocupar "+cantHab+" habitaciones.");
		}
		else{
			System.out.println("No se pudo ocupar las habitaciones.");
		}
		return resultado;
	}
	
	private void ocuparConReserva(int cantHab){
		setHabitacionesReservadas(getHabitacionesReservadas()-cantHab);
		setHabitacionesOcupadas(getHabitacionesOcupadas()+cantHab);
	}
	
	private void ocuparSinReserva(int cantHab){
		setHabitacionesOcupadas(getHabitacionesOcupadas()+cantHab);
	}
	
	public boolean descouparHabitaciones(int cantHab){
		boolean resultado=false;
		System.out.println("Intento liberar "+cantHab+" habitaciones.");
		if(cantHab<=getHabitacionesOcupadas()){
			setHabitacionesOcupadas(getHabitacionesOcupadas()-cantHab);
			System.out.println("Pudo liberar las habitaciones solicitadas.");
			resultado=true;
		}
		if(resultado==false){
			System.out.println("No pudo liberar las habitaciones solicitadas.");
		}
		return resultado;
	}
	
	public int cantidadHabitacionesLibres(){
		int resultado=0;
		resultado=getHabitacionesTotales()-getHabitacionesOcupadas();
		return resultado;
	}
	
	public int disponibilidad(){
		int resultado=0;
		resultado = getHabitacionesTotales()-getHabitacionesOcupadas()-getHabitacionesReservadas();
		return resultado;
	}
}

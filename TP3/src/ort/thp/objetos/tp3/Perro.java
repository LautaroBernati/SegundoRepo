package ort.thp.objetos.tp3;

public class Perro {

	private String nombre;
	private int edad;
	private String patas;
	//as
	
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", patas=" + patas + "]";
	}
	
	public Perro() {
		
		setNombre("asd");//this.nombre = nombre;
		setEdad(10);//this.edad = edad;
		setPatas("cortitas");//this.patas = patas;
	}

	public Perro(String nombre, int edad, String patas) {
		
		setNombre(nombre);//this.nombre = nombre;
		setEdad(edad);//this.edad = edad;
		setPatas(patas);//this.patas = patas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPatas() {
		return patas;
	}
	public void setPatas(String patas) {
		this.patas = patas;
	}
	
	
}

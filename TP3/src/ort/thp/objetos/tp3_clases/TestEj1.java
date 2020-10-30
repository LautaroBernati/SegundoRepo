package ort.thp.objetos.tp3_clases;
import ort.thp.objetos.tp3.Persona;
import java.util.Scanner;

public class TestEj1 {
	private static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona1 = cargarDatos(persona1);
		persona2 = cargarDatos(persona2);
		
		mostrarPersona(persona1);
		mostrarPersona(persona2);
		
		input.close();
	}
	
	public static void mostrarPersona(Persona persona){
		System.out.println(persona);
	}
	
	public static Persona cargarDatos(Persona persona){
		//Persona resultado = new Persona();
		String nombre;
		String apellido;
		String direccion;
		
		System.out.println("Ingrese el nombre");
		persona.setNombre(input.nextLine());
		System.out.println("Ingrese el apellido");
		persona.setApellido(input.nextLine());
		System.out.println("Ingrese la direccion");
		persona.setDireccion(input.nextLine());
		return persona;
	}
}

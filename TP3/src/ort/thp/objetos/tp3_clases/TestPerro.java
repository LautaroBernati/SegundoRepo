package ort.thp.objetos.tp3_clases;
import java.util.*;
import ort.thp.objetos.tp3.Perro;

public class TestPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro perro1 = new Perro("bobby",10,"largas");
		Perro perro2 = new Perro("asd",10,"jojo"); 
		Perro perro3 = new Perro("julio",10,"jojo"); 
		
		ArrayList<Perro> perros=new ArrayList<Perro>();
		
		perro1.setNombre("firulais");
		perros.add(perro1);
		perros.add(perro2);
		
		System.out.println(perro1.getNombre());
		
		System.out.println(perros);
		
		//perro3 = perros.set(1, perro3); invierte perro 2 por perro 3
		
		perros.set(1, perro3); //cambia a perro 2 por perro 3 en el arraylist
		
		System.out.println("Perro3 = " + perro3);
		
		System.out.println(perros);
		
		perros.remove(0);
		System.out.println(perros);
		
		perros.set(0, perro2);
		System.out.println(perros);
		
	}

}

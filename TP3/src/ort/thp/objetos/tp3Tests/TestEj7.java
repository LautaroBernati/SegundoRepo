package ort.thp.objetos.tp3Tests;

import ort.thp.objetos.tp3.Gato;
import ort.thp.objetos.tp3.Raton;

public class TestEj7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato1 = new Gato(100);
		Raton raton1 = new Raton(100);
		
		probar(gato1, raton1, 80);
		probar(gato1, raton1, 50);
		probar(gato1, raton1, 10);
		//gato1.alcanzar(raton1, 80);	
		//gato1.alcanzar(raton1, 50);
		//gato1.alcanzar(raton1, 10);
	}
	
	public static String probar(Gato gatoTest, Raton ratonTest, int metros){
		String resultado="";
		if(gatoTest.alcanzar(ratonTest, metros)){
			System.out.println("Lo alcanzo");
		}
		else{
			System.out.println("No lo alcanzo");
		}
		return resultado;
	}
	
}

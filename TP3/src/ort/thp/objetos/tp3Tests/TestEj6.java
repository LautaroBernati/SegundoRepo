package ort.thp.objetos.tp3Tests;

import ort.thp.objetos.tp3.Automovil;

public class TestEj6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovil auto1 = new Automovil("Audi", "A4", "OKF-301", 40);
		auto1.setRendimientoPorLitro(10);
		System.out.println(auto1);
		auto1.cargarCombustible(20);
		System.out.println(auto1);
		System.out.println(viajar(180,auto1));
		System.out.println(auto1);
		System.out.println(viajar(50,auto1));
		System.out.println(auto1);
	}
	
	public static String viajar(double km, Automovil auto){
		String resultado=null;
		resultado="Intento viajar "+km+" kilometros y viajo "+auto.viajar(km);
		return resultado;
	}
}

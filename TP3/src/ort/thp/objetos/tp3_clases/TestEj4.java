package ort.thp.objetos.tp3_clases;

import ort.thp.objetos.tp3.Cafetera;

public class TestEj4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(500);
		Cafetera cafetera3 = new Cafetera(750, 500);
		
		testearCafetera(cafetera3);
		
		
	}

	public static void testearCafetera(Cafetera cafeteratest){
		//System.out.println(cafeteratest);
		cafeteratest.llenar();
		//System.out.println(cafeteratest);
		cafeteratest.servirTaza(150);
		//System.out.println(cafeteratest);
		cafeteratest.agregarCafe(100);
		//System.out.println(cafeteratest);
		cafeteratest.vaciar();
		System.out.println(cafeteratest);
	}
}

package ort.thp.objetos.tp3Tests;

import ort.thp.objetos.tp3.Superheroe;

public class TestEj8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Superheroe superheroe1 = new Superheroe("Batman", 90, 70, 0); 
	Superheroe superheroe2 = new Superheroe("Superman", 95, 60, 70);
	
	System.out.println(superheroe1.competir(superheroe2));
	System.out.println(superheroe2.competir(superheroe1));
	System.out.println(superheroe1.competir(superheroe1));
	//felicidades ha completado el tp3
	}

}

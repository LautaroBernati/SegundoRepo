package ort.thp.objetos.tp3_clases;

import ort.thp.objetos.tp3.Hotel;

public class TestEj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel1 = new Hotel("Hilton", "CABA", 200);
		System.out.println(hotel1);
		hotel1.ocuparHabitaciones(201, true);
		System.out.println(hotel1);
		hotel1.ocuparHabitaciones(30, false);
		System.out.println(hotel1);
		hotel1.reservarHabitaciones(50);
		System.out.println(hotel1);
		hotel1.descouparHabitaciones(200);
		System.out.println(hotel1);
		hotel1.ocuparHabitaciones(30, true);
		hotel1.ocuparHabitaciones(30, true);
		hotel1.descouparHabitaciones(40);
	}

}

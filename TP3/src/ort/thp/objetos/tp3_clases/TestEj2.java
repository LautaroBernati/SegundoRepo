package ort.thp.objetos.tp3_clases;

import ort.thp.objetos.tp3.Cuadrado;

public class TestEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadradito = new Cuadrado(10);
		mostrarCuadrado(cuadradito);
		System.out.println("Cambio el tamaño del cuadrado a 50 por lado.");
		cuadradito.setLado(50);
		mostrarCuadrado(cuadradito);
	}

	public static void mostrarCuadrado(Cuadrado cuadrado){
		System.out.println(cuadrado);
		//System.out.println(cuadrado.getLado()); testeo, esto solo muestra el lado.
	}
	
}

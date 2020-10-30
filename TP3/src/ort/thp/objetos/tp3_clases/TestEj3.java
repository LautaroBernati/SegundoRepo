package ort.thp.objetos.tp3_clases;

import ort.thp.objetos.tp3.TarjetaDeCredito;

public class TestEj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
		tarjeta1.actualizarLimite(3000);
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
	}

}

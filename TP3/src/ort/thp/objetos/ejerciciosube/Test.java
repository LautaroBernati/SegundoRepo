package ort.thp.objetos.ejerciciosube;
import ort.thp.objetos.clases.Sube;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sube sube = new Sube();
		sube.setNumeroTarjeta("111122222333334444");
		sube.setSaldo(10);
		System.out.println(sube.getNumeroTarjeta());
		System.out.println(sube);
		System.out.println(sube.consumirSaldo(50));
		System.out.println(sube);
		System.out.println(sube.consumirSaldo(80));
		System.out.println(sube);
		System.out.println(sube.cargarSaldo(500));
		System.out.println(sube);
	}

}

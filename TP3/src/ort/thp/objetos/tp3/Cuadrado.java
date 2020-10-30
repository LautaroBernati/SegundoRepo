package ort.thp.objetos.tp3;

public class Cuadrado {

	private double lado;
	

	public Cuadrado(double lado) {
		super();
		setLado(lado);//this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
		
	public double perimetro(double lado){
		double resultado=0;
		
		resultado=lado*4;
		
		return resultado;
	}
	
	public double superficie(double lado){
		double resultado=0;
		
		resultado=lado*lado;
		
		return resultado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]" + " Perimetro()=" + perimetro(lado) + ", superficie()=" + superficie(lado);
	}
	
}


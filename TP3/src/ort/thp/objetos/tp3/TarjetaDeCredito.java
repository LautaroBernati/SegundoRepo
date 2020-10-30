package ort.thp.objetos.tp3;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		super();
		setNumero(numero);//this.numero = numero;
		setTitular(titular);//this.titular = titular;
		setLimiteDeCompra(limiteDeCompra);//this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0; //el ejercicio pedia explicitamente que no haya set de este metodo y que se inicializara en 0.
	}

	public String getNumero() {
		return numero;
	}
	private void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	private void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	public double getAcumuladoActual() {
		return acumuladoActual;
	}
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoTotal=" + acumuladoActual + "]" + ", disponible()=" + montoDisponible();
	}

	public double montoDisponible(){
		double resultado=0;
		
		resultado = this.limiteDeCompra - this.acumuladoActual;
		if(resultado<0){
			resultado=0;
		}
		
		return resultado;
	}
	
	private boolean compraPosible(double monto){
		boolean posible=false;
		if(montoDisponible()>monto){
			posible=true;
		}
		
		return posible;
	}
	
	public void actualizarLimite(double monto){
		setLimiteDeCompra(monto);
	}
	
	private void acumularGastoActual(double compra){
		this.acumuladoActual=+compra;
	}
	
	public boolean realizarCompra(double monto){
		boolean realizada=false;
		
		if(compraPosible(monto)){
			acumularGastoActual(monto);
			System.out.println("Compra exitosa.");
		}
		else{
			System.out.println("Compra no realizada.");
		}
		return realizada;
	}
	
}

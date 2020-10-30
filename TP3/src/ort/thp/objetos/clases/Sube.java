package ort.thp.objetos.clases;

public class Sube {
	private double limiteNegativo;
	private double limiteCarga;
	private String numeroTarjeta;
	private double saldo;
	
	public Sube(){
		setLimiteCarga(600);//this.limiteCarga=600;
		setLimiteNegativo(-100);//this.limiteNegativo=-100;
		setNumeroTarjeta("");//this.numeroTarjeta="";
		setSaldo(0);//this.saldo=0;
	}
	
	public Sube(double limiteNegativo, double limiteCarga, String numeroTarjeta, double saldo) {
		super();
		this.limiteNegativo = limiteNegativo;
		this.limiteCarga = limiteCarga;
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
	}


	public double getLimiteNegativo() {
		return limiteNegativo;
	}
	public void setLimiteNegativo(double limiteNegativo) {
		if(numeroTarjeta.length()==16){
			this.limiteNegativo = limiteNegativo;
		}
		
	}
	public double getLimiteCarga() {
		return limiteCarga;
	}
	public void setLimiteCarga(double limiteCarga) {
		this.limiteCarga = limiteCarga;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Hola, soy el toString. Sube [numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + "]";
	}
	
	public boolean consumirSaldo(double importe){
		boolean resul=false;
		if(this.saldo-importe>=limiteNegativo){
			this.saldo-=importe;
			resul=true;
		}
		return resul;
	}
	
	public void usarSube(double importe) {
		if(consumirSaldo(importe)){
			System.out.println("OK, tu saldo es "+ this.saldo);
		}
		else{
			System.out.println("Error, tu saldo es de "+ this.saldo);
		}
	}
	
	public boolean cargarSaldo(double importe){
		boolean resul=false;
		if(this.saldo+importe>=limiteCarga){
			System.out.println("Error, no podes cargarle mas de $ "+limiteCarga+" de saldo.");
		}
		else{
			this.saldo=importe;
		}
		return resul;
	}
}

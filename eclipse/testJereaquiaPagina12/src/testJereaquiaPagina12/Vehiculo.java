package testJereaquiaPagina12;

public class Vehiculo {
	public int velocidad;
	public int ruedas;

	public void parar() {
		velocidad = 0;
	}

	public void acelerar(double kmh) {
		velocidad += kmh;
	}

	public Vehiculo(int velocidad, int ruedas) {
		super();
		this.velocidad = velocidad;
		this.ruedas = ruedas;
	}
	
	
}

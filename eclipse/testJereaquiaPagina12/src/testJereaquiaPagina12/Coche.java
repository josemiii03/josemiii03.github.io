package testJereaquiaPagina12;

public class Coche extends Vehiculo {
	public int ruedas = 4;
	public int gasolina;

	public void repostar(int litros) {
		gasolina += litros;
	}

	public Coche(int velocidad, int gasolina) {
		super(velocidad, gasolina);
		this.gasolina = gasolina;
	}
	
	public void acelerar(double kmh) {
		super.acelerar(kmh);
		gasolina*=0.9;
	}

	@Override
	public String toString() {
		return "Coche [gasolina=" + gasolina + ", velocidad=" + velocidad + "]";
	}
	
	
	
}

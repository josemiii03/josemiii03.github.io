package testJereaquiaPagina12;

public class Coche extends Vehiculo {
	public int ruedas = 4;
	public int gasolina;

	public void repostar(int litros) {
		gasolina += litros;
	}

	@Override
	public void acelera() {
		velocidad=90;
		gasolina*=0.9;
		
	}

	public Coche(int velocidad, int gasolina) {
		super(velocidad, gasolina);
		this.gasolina = gasolina;
	}

	@Override
	public String toString() {
		return "Coche [gasolina=" + gasolina + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
	
}

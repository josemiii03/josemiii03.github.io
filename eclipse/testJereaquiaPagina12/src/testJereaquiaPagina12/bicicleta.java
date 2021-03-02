package testJereaquiaPagina12;

public class bicicleta extends Vehiculo {

	public bicicleta(int velocidad, int ruedas) {
		super(velocidad, ruedas);

	}

	@Override
	public void acelera() {
		velocidad = 25;

	}

	@Override
	public String toString() {
		return "bicicleta [velocidad=" + velocidad + "]";
	}

}

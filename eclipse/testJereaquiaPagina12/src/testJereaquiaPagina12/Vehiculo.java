package testJereaquiaPagina12;

public abstract class Vehiculo {
	public int velocidad;
	public int ruedas;

	public void parar() {
		velocidad = 0;
	}

	abstract public void acelera();

	public void para() {
		velocidad = 0;
	}

	public Vehiculo(int velocidad, int ruedas) {
		super();
		this.velocidad = velocidad;
		this.ruedas = ruedas;
	}

}

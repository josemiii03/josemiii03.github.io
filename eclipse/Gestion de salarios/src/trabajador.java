
public class trabajador {

	public String Nombre;
	public String Apellidos;
	public int salarioBruto;
	public boolean Situación;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param salarioBruto
	 * @param situación
	 */
	public trabajador(String nombre, String apellidos, int salarioBruto, boolean situación) {
		Nombre = nombre;
		Apellidos = apellidos;
		this.salarioBruto = salarioBruto;
		Situación = situación;
	}

	@Override
	public String toString() {
		return "trabajador [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", salarioBruto=" + salarioBruto
				+ ", Situación=" + situacion() + "]";
	}

	public String situacion() {

		if (Situación == true) {
			return " Activo ";
		}
		return " De Baja ";

	}

	public boolean isSituación() {
		return Situación;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}
	
	
	
	
}


public class trabajador {

	public String Nombre;
	public String Apellidos;
	public int salarioBruto;
	public boolean Situaci�n;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param salarioBruto
	 * @param situaci�n
	 */
	public trabajador(String nombre, String apellidos, int salarioBruto, boolean situaci�n) {
		Nombre = nombre;
		Apellidos = apellidos;
		this.salarioBruto = salarioBruto;
		Situaci�n = situaci�n;
	}

	@Override
	public String toString() {
		return "trabajador [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", salarioBruto=" + salarioBruto
				+ ", Situaci�n=" + situacion() + "]";
	}

	public String situacion() {

		if (Situaci�n == true) {
			return " Activo ";
		}
		return " De Baja ";

	}

	public boolean isSituaci�n() {
		return Situaci�n;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}
	
	
	
	
}

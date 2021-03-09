

import java.time.LocalDate;

public class analista extends empleado{
	
	String herramienta;

	/**
	 * @param emp_no
	 * @param apellido
	 * @param oficio
	 * @param fecha_alt
	 * @param salario
	 * @param dep
	 * @param herramienta
	 */
	public analista(int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario, departamento dep,
			String herramienta) {
		super(emp_no, apellido, oficio, fecha_alt, salario, dep);
		this.herramienta = herramienta;
	}

	
	
	@Override
	public String toString() {
		return  "\n" + "Empleado nº " + emp_no + ", apellido " + apellido + ", oficio " + oficio + ", fecha_alt "
				+ fecha_alt + ", salario " + salario + ", herramienta " + herramienta;
	}

	
	
}

package herencia;

import java.time.LocalDate;

public class analista extends empleado{
	
	String herramienta;

	public analista(int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario, String herramienta) {
		super(emp_no, apellido, oficio, fecha_alt, salario);
		this.herramienta = herramienta;
	}

	@Override
	public String toString() {
		return "analista [herramienta=" + herramienta + ", emp_no=" + emp_no + ", apellido=" + apellido + ", oficio="
				+ oficio + ", fecha_alt=" + fecha_alt + ", salario=" + salario + "]";
	}

	
	
}

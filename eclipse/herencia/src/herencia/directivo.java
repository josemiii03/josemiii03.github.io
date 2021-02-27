package herencia;

import java.time.LocalDate;

public class directivo extends empleado{
	
	int comision;

	public directivo(int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario, int comision) {
		super(comision, oficio, oficio, fecha_alt, comision);
		this.comision=comision;
	}

	@Override
	public String toString() {
		return "directivo [comision=" + comision + ", emp_no=" + emp_no + ", apellido=" + apellido + ", oficio="
				+ oficio + ", fecha_alt=" + fecha_alt + ", salario=" + salario + "]";
	}

	
	

	
	
}
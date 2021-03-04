

import java.time.LocalDate;

public class directivo extends empleado{
	
	int comision;

	
	/**
	 * @param emp_no
	 * @param apellido
	 * @param oficio
	 * @param fecha_alt
	 * @param salario
	 * @param dep
	 * @param comision
	 */
	public directivo(int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario, departamento dep,
			int comision) {
		super(emp_no, apellido, oficio, fecha_alt, salario, dep);
		this.comision = comision;
	}


	@Override
	public String toString() {
		return  "\n" + "Empleado nº " + emp_no + ", apellido " + apellido + ", oficio " + oficio + ", fecha_alt "
				+ fecha_alt + ", salario " + salario + ", comisión " + comision;
	}

	
	

	
	
}
import java.time.LocalDate;

public class jefe extends empleado {

	int salarioExtra;
	
	public jefe(int dept_no, int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario,
			departamento dep, int salarioExtra) {
		super(dept_no, apellido, oficio, fecha_alt, salario, dep);
		this.salarioExtra = salarioExtra;
	
	}

	@Override
	public String toString() {
		return "jefe [salarioExtra=" + salarioExtra + ", emp_no=" + emp_no + ", apellido=" + apellido + ", oficio="
				+ oficio + ", fecha_alt=" + fecha_alt + ", salario=" + salario + "pipo" + "]";
	}


	
	
	
	

}

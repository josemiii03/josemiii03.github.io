import java.time.LocalDate;

public class empleado {
	
	private int emp_no;
	private String apellido;
	private String oficio;
	private LocalDate fecha_alt;
	private int salario;
	private departamento departamento;
	
	public empleado(departamento departamento,int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario) {
		this.departamento = departamento;
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = fecha_alt;
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "empleado " + emp_no + ", apellido=" + apellido + ", oficio=" + oficio + ", fecha_alt="
				+ fecha_alt + ", salario=" + salario + ", departamento = "+ departamento;
	}
	
	public String mostrarDep() {
		return "El departamento de " +  apellido + " es " + departamento.getdNombre();
		
	}
}

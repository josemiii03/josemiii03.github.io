import java.time.LocalDate;

public class empleado{
	
	public int emp_no;
	public String apellido;
	public String oficio;
	public LocalDate fecha_alt;
	public int salario;
	public departamento dep;
	
		
	@Override
	public String toString() {
		return  "\n" + "Empleado nº " + emp_no + ", apellido " + apellido + ", oficio " + oficio + ", fecha_alt "
				+ fecha_alt + ", salario " + salario + dep.getdNombre() ;
	}

	public empleado(int emp_no, String apellido, String oficio, LocalDate fecha_alt, int salario, departamento dep) {
		super();
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = fecha_alt;
		this.salario = salario;
		this.dep = dep;
	}


	public int getEmp_no() {
		return emp_no;
	}

	
	public void reducirEmpNo() {
		this.emp_no = emp_no - 1;
	}
	
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public LocalDate getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(LocalDate fecha_alt) {
		this.fecha_alt = fecha_alt;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public departamento getDep() {
		return dep;
	}
	
	public int getDepNum() {
		return dep.getDept_no();
	}
	public void setDep(departamento dep) {
		this.dep = dep;
	}

}

import java.util.Arrays;

public class departamento {
	
	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getdNombre() {
		return dNombre;
	}

	public void setdNombre(String dNombre) {
		this.dNombre = dNombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	

	int dept_no;
	String dNombre;
	String localizacion;
	
	private empleado personal[];
	
	public departamento(int dept_no, String dNombre, String localizacion, empleado m[]) {
		personal = m;
		this.dept_no = dept_no;
		this.dNombre = dNombre;
		this.localizacion = localizacion;
		
		
	}
	
	@Override
	public String toString() {
		return "departamento [dept_no=" + dept_no + ", dNombre=" + dNombre + ", localizacion=" + localizacion
				+ ", personal=" + Arrays.toString(personal) + "]";
	}

	
	
	
	/**
	private empleado empleados[] = new empleado[5];
	
	public departamento(int dept_no, String dNombre, String localizacion) {
		this.dept_no = dept_no;
		this.dNombre = dNombre;
		this.localizacion = localizacion;
		
		empleados[1] = new empleado(0, "Paco", null, null, 0);
		empleados[2] = new empleado(2, "Manolo", null, null, 0);
		
	}

	@Override
	public String toString() {
		return "departamento [dept_no=" + dept_no + ", dNombre=" + dNombre + ", localizacion=" + localizacion
				+ ", empleados=" + Arrays.toString(empleados) + "]";
	}
	
	

	public empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(String nombre) {
		this.empleados[1].setApellido(nombre);;
	}
	
	
	
	**/
	
	

	
	

}
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
	
	

	

	public String getPersonal() {
		return Arrays.toString(personal);
	}





	int dept_no;
	String dNombre;
	String localizacion;
	
	empleado personal[];
		
	public departamento(int dept_no, String dNombre, String localizacion, empleado[] personal) {
		super();
		this.dept_no = dept_no;
		this.dNombre = dNombre;
		this.localizacion = localizacion;
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "departamento [dept_no=" + dept_no + ", dNombre=" + dNombre + ", localizacion=" + localizacion
				+ ", personal=" + Arrays.toString(personal) + "]";
	}
	
	

	

}
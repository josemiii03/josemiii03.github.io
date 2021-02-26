

public class departamento {
	
	private int dept_no;
	private String dNombre;
	private String localizacion;
	
	public departamento(int dept_no, String dNombre, String localizacion) {
		this.dept_no = dept_no;
		this.dNombre = dNombre;
		this.localizacion = localizacion;
	}

	
	public String toString() {
		return "departamento [dept_no=" + dept_no + ", dNombre=" + dNombre + ", localizacion=" + localizacion
				+  "]";
	}

	public String getdNombre() {
		return dNombre;
	}

	public void setdNombre(String dNombre) {
		this.dNombre = dNombre;
	}
	
	
	
}	
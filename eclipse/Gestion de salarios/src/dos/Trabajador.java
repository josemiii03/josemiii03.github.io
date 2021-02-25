package dos;

public class Trabajador {
	int id;
	String nombre;
	String apellidos;
	double salario;
	boolean enactivo;
	public Trabajador(String nombre, String apellidos, double salario, boolean enactivo) {
		super();
		this.id = 0;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.enactivo = enactivo;
	}
	public Trabajador() {
		id=-1;
		nombre="";
		apellidos="";
		salario=0;
		enactivo=true;
	}
	public Trabajador(Trabajador t) {
		super();
		this.id = t.id;
		this.nombre = t.nombre;
		this.apellidos = t.apellidos;
		this.salario = t.salario;
		this.enactivo = t.enactivo;
	}
	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos el apellidos a establecer
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return el salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @return el enactivo
	 */
	public boolean isEnactivo() {
		return enactivo;
	}
	/**
	 * @param enactivo el enactivo a establecer
	 */
	public void setEnactivo(boolean enactivo) {
		this.enactivo = enactivo;
	}
	public void ModificarSalario(double porcentaje) {
		this.salario+=salario*porcentaje;
	}
	public String toString() {
		String s;
		int i;
		s=""+id;
		if (id<10) s=s+"       ";
		else if (id<100) s=s+"      ";
		s=s+ nombre;
		for (i=nombre.length();i<21;i++) s=s+" ";
		s=s+apellidos;
		for (i=apellidos.length();i<31;i++) s=s+" ";
		s=s+salario;
		if (salario<100000) s= s+ "         ";
		else s=s+"        ";
		if (isEnactivo()) s=s+"A";
		else s=s+"B";
		return(s);
	}
}


public class empleado {
	public int emp_no;
	public String apellido;
	public String oficio;
	public String fecha_alt;
	public double salario;
	
	
	public empleado(String apellido, String oficio, String fecha_alt, int emp_no, double salario) {
		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = fecha_alt;
		this.emp_no = emp_no;
		this.salario = salario;
		
	}
	
	
	public void datoEmpleado() {
		System.out.println("-El número de empleado es      : " + this.emp_no);
		System.out.println("-El Apellido de empleado es    : " + this.apellido);
		System.out.println("-El oficio de empleado es      : " + this.oficio);
		System.out.println("-Su fecha de alta tuvo lugar el: " + this.fecha_alt);
		System.out.println("-Le corresponde un salario de  : " + this.salario);
		System.out.println();
		System.out.println();
	}
}

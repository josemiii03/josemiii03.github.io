
public class Principal {

	public static void main(String[] args) {
		
		empleado empleado1 = new empleado();
			empleado1.apellido = "rodriguez";
			empleado1.emp_no = 1;
			empleado1.oficio = "contable";
			empleado1.fecha_alt = "11-01-2009";
			empleado1.salario = 1123.80;
			
		empleado empleado2 = new empleado();
			empleado2.apellido = "tornes";
			empleado2.emp_no = 2;
			empleado2.oficio ="programador";
			empleado2.fecha_alt = "15-11-2008";
			empleado2.salario = 3.01;
			
		empleado1.datoEmpleado();
		empleado2.datoEmpleado();

	}

}


public class principal {

	public static void main(String[] args) {
		
		departamento departamentos = new departamento(0, null, null);

		empleado empleados = new empleado(0, null, null, null, 0);
		
		System.out.println(departamentos.getEmpleados());
	}

}

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		empleado[] empleados = new empleado[5];

		empleados[0] = new empleado(2, "Jon",		 	"Programador", 	LocalDate.of(2019, 01, 30), 200);
		empleados[1] = new empleado(1, "Campeador",		"Contable", 	LocalDate.of(2020, 04, 03), 1576);
		empleados[2] = new empleado(2, "Martín", 		"Programador", 	LocalDate.of(2019, 10, 30), 200);
		empleados[3] = new empleado(2, "Catalino", 		"Programador", 	LocalDate.of(2020, 01, 10), 100);
		empleados[4] = new empleado(2, "Galdos", 		"Limpiador", 	LocalDate.of(2018, 01, 30), 2030);

		for (int i = 0; i < empleados.length; i++) {
			empleados[i].datoEmpleado();
		}
		
		mostrarSueldoTodos(empleados);
		
		subirSueldoTodos(empleados, 1000);
		
	}
	
	
	public static void subirSueldoTodos(empleado[] empleados, int subida){ 	
		/** for (int i = 0; i < empleados.length; i++) {
			empleados[i].setSalario(500);
		}*/
		
		empleados[0].setSalario(50000);
		
		System.out.println("A todos los empleados se le subió el sueldo en " + subida);
	}
	
	public static void mostrarSueldoTodos(empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("A " + empleados[i].getApellido() +" le corresponden "+ empleados[i].getSalario() );
		}
	}
}


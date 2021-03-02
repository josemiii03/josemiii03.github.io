import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;

public class principal {
	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static departamento dep1;

	static empleado[] empleados = new empleado[5];
	
	public static int numeroEmpleados = 0;
	
	public static int huecoEmpleados = 0;

	
	
	
	
	public static void main(String[] args) {
		
		huecoEmpleados = buscaHueco();
		
		dep1 = new departamento(1, "Matemáticas", "Piso Bajo", empleados);
		
		System.out.println(dep1.getPersonal());
		
		crearEmpleado(0);
		crearEmpleado(0);
		crearEmpleado(0);
		crearEmpleado(0);
		crearEmpleado(1);
		
		System.out.println(dep1);
		
		
		
		
	}
	
	public static void crearEmpleado(int tipo) {
		if (numeroEmpleados != 5){
			if (tipo == 0){
				empleados[huecoEmpleados] = new empleado(huecoEmpleados+1, null, null, null, 0, dep1);
				huecoEmpleados++;
				numeroEmpleados++;
			}
			
			if (tipo == 1){
				empleados[huecoEmpleados] = new jefe(huecoEmpleados+1, 0, null, null, null, 0, dep1, 0);
				numeroEmpleados++;
				huecoEmpleados++;
			}
		}
	}
	
	
	public static int buscaHueco() {
		int i;
		for (i = 0; i < empleados.length; i++) {
			if (empleados[i] == null) {
				return i;
			}
		}
		return -1;
	}
}

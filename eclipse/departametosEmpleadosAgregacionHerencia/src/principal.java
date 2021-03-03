import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;



public class principal {
	
	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static departamento[] listaDepartamentos = new departamento[5];

	static empleado[] listaEmpleados = new empleado[5];
	
	public static int numeroDepartamentos = 0;
	
	public static int huecoDepartamentos = 0;
		
	public static int numeroEmpleados = 0;
	
	public static int huecoEmpleados = 0;

	
	public static void main(String[] args) {
		
		huecoEmpleados = buscaHuecoa();
		
		crearEmpleado(0);
		
		System.out.println(listaEmpleados[1]);
		System.out.println(listaEmpleados[1]);
		
		
	}
	
 static void crearEmpleado(int tipo) {
		if (numeroEmpleados != 5){
		switch(tipo) {
		
		default:
			listaEmpleados[huecoEmpleados] = new empleado(huecoEmpleados+1, null, null, null, 0, listaDepartamentos[1]);
			huecoEmpleados++;
			numeroEmpleados++;
			break;
		case 1:
			listaEmpleados[huecoEmpleados] = new directivo(0, null, null, null, tipo, null, tipo);
			numeroEmpleados++;
			huecoEmpleados++;
			break;
		case 2:
			listaEmpleados[huecoEmpleados] = new directivo(0, null, null, null, tipo, null, tipo);
			numeroEmpleados++;
			huecoEmpleados++;
			}
		}
	}
 
 static void mostrarEmpleadosSegunDepartamentos(){
	 
 }
 static void crearDepartamento(){
	 if (numeroDepartamentos != 5) {
				listaDepartamentos[huecoDepartamentos] = new departamento(0, null, null, listaEmpleados);
				huecoDepartamentos++;
				numeroDepartamentos++;
		}
 }
	
	
	public static int buscaHuecoa() {
		int i;
		for (i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] == null) {
				return i;
			}
		}
		return -1;
	}
}

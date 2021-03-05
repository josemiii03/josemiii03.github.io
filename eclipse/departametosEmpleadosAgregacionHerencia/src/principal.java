import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;

public class principal {

	final static int maxEmpleados = 6;
	
	final static int maxDepartamentos = 5;

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static departamento[] listaDepartamentos = new departamento[maxDepartamentos];

	static empleado[] listaEmpleados = new empleado[maxEmpleados];

	// -------------------------------- VARIABLES DE CONTROL 

	public static int numeroDepartamentos = 0;

	public static int huecoDepartamentos = 0;
	
	public static int huecoInteriorDepartamentos = 0;

	public static int numeroEmpleados = 0;

	public static int huecoEmpleados = 0;

	public static int huecoInteriorEmpleados = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		crearDepartamento();
		crearDepartamento();
		crearDepartamento();
		crearDepartamento();

		crearEmpleado(0, listaDepartamentos[0]);
		crearEmpleado(1, listaDepartamentos[0]);
		crearEmpleado(0, listaDepartamentos[0]);
		
		crearEmpleado(2, listaDepartamentos[1]);
		crearEmpleado(0, listaDepartamentos[1]);
		crearEmpleado(2, listaDepartamentos[1]);
		
		
		mostrarEmpleadosDeUnDepartamento(listaDepartamentos[1]);

		
		
		
	}

	

	static void crearDepartamento() {
		
		comprobarhuecointeriorDEP();
		
		if (numeroDepartamentos != maxDepartamentos) {
			listaDepartamentos[huecoDepartamentos] = new departamento(huecoDepartamentos+1, "Departamento Uno ", null, listaEmpleados);
			huecoDepartamentos++;
			numeroDepartamentos++;
		
		}else {
			System.out.println("No hay hueco para añadir mas Departamentos.");
		}
	}
	
	public static void borrarDepartamento() throws NumberFormatException, IOException {
		System.out.println("Introduce el nº de empleado a borrar");
		int depNum = (Integer.parseInt(teclado.readLine()) - 1);
		if (listaDepartamentos[depNum] != null) {
			listaDepartamentos[depNum] = null;
			System.out.println("Borrado!");

			if (depNum != huecoDepartamentos - 1) {
				huecoInteriorDepartamentos++;
			}

			numeroDepartamentos = numeroDepartamentos - 1;
			huecoDepartamentos = huecoDepartamentos - 1;

		} else {
			System.out.println("Este empleado no es borrable, por que no existe");
		}
	}
	
	
	
	//----------------------- MOSTRADO 
	
	public static void mostrarEmpleadosDeUnDepartamento(departamento departamento) {
		
		for (int i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] != null) {
				if(listaEmpleados[i].getDepNum() == departamento.getDept_no()) {
				System.out.println(listaEmpleados[i]);
				}
			}
		}
	}
	
	public static void mostrarDepartamentos() {
		for (int i = 0; i < listaDepartamentos.length; i++) {
			if (listaDepartamentos[i] != null) {
				System.out.println(listaDepartamentos[i]);
			}
		}
	}

	
	public static void mostrarEmpleados() {
		for (int i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] != null) {
				System.out.println(listaEmpleados[i]);
			}
		}
	}

	// ---------------------- CREACIÓN Y BORRADO DE EMPLEADOS
	
	static void crearEmpleado(int tipo, departamento departamento) {
		if (numeroEmpleados != maxEmpleados) {

			comprobarhuecointeriorEMP();

			switch (tipo) {

			default:
				listaEmpleados[huecoEmpleados] = new empleado(huecoEmpleados + 1, null, null, null, 0, departamento);
				huecoEmpleados++;
				numeroEmpleados++;
				break;
			case 1:
				listaEmpleados[huecoEmpleados] = new directivo(huecoEmpleados + 1, null, null, null, tipo, departamento, 0);
				numeroEmpleados++;
				huecoEmpleados++;
				break;
			case 2:
				listaEmpleados[huecoEmpleados] = new directivo(huecoEmpleados + 1, null, null, null, tipo, departamento, tipo);
				numeroEmpleados++;
				huecoEmpleados++;

			}
		} else {
			System.out.println("No hay hueco para añadir mas empleados");
		}
	}

	public static void borrarEmpleado() throws NumberFormatException, IOException {
		System.out.println("Introduce el nº de empleado a borrar");
		int empNum = (Integer.parseInt(teclado.readLine()) - 1);
		if (listaEmpleados[empNum] != null) {
			listaEmpleados[empNum] = null;
			System.out.println("Borrado!");

			if (empNum != huecoEmpleados - 1) {
				huecoInteriorEmpleados++;
			}

			numeroEmpleados = numeroEmpleados - 1;
			huecoEmpleados = huecoEmpleados - 1;

		} else {
			System.out.println("Este empleado no es borrable, por que no existe");
		}
	}

	// --------------------------------------------------------------------------------------------
	// ------------------------- GESTIÓN DE HUECOS 
	

	public static void comprobarhuecointeriorEMP() {
		if (huecoInteriorEmpleados > 0) {
			huecoEmpleados = buscaHuecoEMP();
		}
	}
	
	

	public static int buscaHuecoEMP() {
		int i;
		for (i = 0; i < listaEmpleados.length; i++) {
			if (listaEmpleados[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public static void comprobarhuecointeriorDEP() {
		if (huecoInteriorDepartamentos > 0) {
			huecoDepartamentos = buscaHuecoDEP();
		}
	}
	
	

	public static int buscaHuecoDEP() {
		int i;
		for (i = 0; i < listaDepartamentos.length; i++) {
			if (listaDepartamentos[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
}

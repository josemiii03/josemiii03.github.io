import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Principal {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) {

		empleado[] empleados = new empleado[5];

		empleados[0] = new empleado(1, "Calderón", "Programador", LocalDate.of(2019, 01, 30), 200);
		empleados[1] = new empleado(2, "Muñoz", "Contable", LocalDate.of(2020, 04, 03), 1576);
		empleados[2] = new empleado(3, "Castaño", "Programador", LocalDate.of(2019, 10, 30), 200);
		empleados[3] = null;
		empleados[4] = new empleado(5, "perez", "Limpiador", LocalDate.of(2018, 01, 30), 2030);


		boolean bandera = false;
		do {
			try {

				System.out.println();
				System.out.println("_______________EMPLEADOS__________________________________________");
				System.out.println();
				System.out.println("1. Mostrar todos los Empleados.");
				System.out.println("2. Mostrar un empleado a partir de su nº de empleado");
				System.out.println("");
				System.out.println("3. Insertar un empleado.");
				System.out.println("4. Borrar un empleado a partir de nº de empleado");
				System.out.println("5. Modificar atributo de empleado a partir de sunº de empleado");
				System.out.println("");
				System.out.println("6. Salir del programa");
				System.out.println("___________________________________________________________________");
				int lectura = Integer.parseInt(teclado.readLine());

				switch (lectura) {
				default:
					System.out.println("Introduce una opción existente");
				case 1:
					mostrarEmpleados(empleados);
					break;
				case 2:
					empleados[EmpleadoPorEmp_N(empleados)].datosEmpleado();
					break;
				case 3:
					añadirEmpleado(empleados);
					break;
				case 4:
					empleados[EmpleadoPorEmp_N(empleados)] = null;
					break;
				case 5:
					
					int emp = EmpleadoPorEmp_N(empleados);
					
					boolean bandera2 = false;
					do {
							System.out.println();
							System.out.println("_______________SUBMENÚ PARA MODIFICAR EMPLEADOS____________________");
							empleados[emp].datosEmpleado();
							System.out.println();
							System.out.println("1. Editar 'nº' de empleado.");
							System.out.println("2. Editar 'Appellido' del empleado.");
							System.out.println("3. Editar 'Oficio' del empleado.");
							System.out.println("4. Editar 'Fecha' del empleado");
							System.out.println("5. Editar 'Salario' del empleado");
							System.out.println("");
							System.out.println("6. Volver al Menú principal");
							System.out.println("___________________________________________________________________");
							lectura = Integer.parseInt(teclado.readLine());

							switch (lectura) {
							default:
								System.out.println("Introduce una opción existente");
							case 1:
								System.out.println("Introduce el número nuevo que deseas asingnarle");
								empleados[emp].setEmp_no(Integer.parseInt(teclado.readLine()));
								break;
							case 2:
								System.out.println("Introduce el Apellido nuevo que deseas asingnarle");
								empleados[emp].setApellido(teclado.readLine());
								break;
							case 3:
								System.out.println("Introduce el Oficio nuevo que deseas asingnarle");
								empleados[emp].setOficio(teclado.readLine());
								break;
							case 4:
								System.out.println("Introduce la fecha nueva en el formato AAAA - MM - DD");
								System.out.println("	Inserta el Año:");
								int año = Integer.parseInt(teclado.readLine());
								System.out.println("	Inserta el Mes:");
								int mes = Integer.parseInt(teclado.readLine());
								System.out.println("	Inserta el dia:");
								int dia = Integer.parseInt(teclado.readLine());
								
								empleados[emp].setFecha_alt(LocalDate.of(año, mes, dia));

								break;
							case 5:
								System.out.println("Introduce el Salario nuevo que deseas asingnarle");
								empleados[emp].setSalario(Integer.parseInt(teclado.readLine()));
								break;
							case 6:
								bandera2 = true;
								break;
						}

					} while (bandera2 == false);
					break;
				case 6:
					bandera = true;
					break;
				}

			} catch (ArrayIndexOutOfBoundsException e ) { //Manejo del array que se genera al devolver un número negativo cuando el empleado no existe
				System.out.println("Este empleado no existe");
			} catch (NumberFormatException | IOException e) { //Manejo el error de entrada de un caracter no numérico o no aceptado
				System.out.println("Introduce un número correcto");
			}

		} while (bandera == false);

	}

	public static void mostrarEmpleados(empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				empleados[i].datosEmpleado();
			}
		}
	}
	
	public static void añadirEmpleado(empleado[] empleados) {
		boolean hueco = false;
		int i;
		for (i = 0; i < empleados.length; i++) {
			if (empleados[i] == null) {
				empleados[i] = new empleado((i+1), null, null, LocalDate.of(2021, 10, 02), 0);
				hueco = true;
				break;
			}
		}
		if (hueco == false) {
			System.out.println("no hay hueco para añadir mas empleados ;-;");
		}
	}
	
	public static int EmpleadoPorEmp_N(empleado[] empleados) throws NumberFormatException, IOException {
		
		System.out.println("Introduce un nº");
		
		int lectura = (Integer.parseInt(teclado.readLine()));
		
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				if (empleados[i].getEmp_no() == lectura) {
					return i;
				}
			}
		}
		return -999999; //devuelvo esto para generar un error y expresar que el empleado no existe
	}
	
	public static void modAtributos(empleado empleados[], int empleado) throws NumberFormatException, IOException{
		
	}

	/*
	 * public static void mostrarEmpleadoPorEmp_N(empleado[] empleados) {
	 * System.out.println(); System.out.println("Introduce el nº de empleador"); try
	 * { boolean encontrado = false; int empNuBuscado =
	 * Integer.parseInt(teclado.readLine()); for (int i = 0; i < empleados.length;
	 * i++) { if(empleados[i].getEmp_no() == empNuBuscado) {
	 * empleados[i].datoEmpleado(); encontrado = true; } } if (encontrado == false)
	 * {System.out.println("No se encuntrea ese empleado");}
	 * 
	 * } catch (NumberFormatException | IOException e) {
	 * System.out.println("Introduce un caracter correcto!!!!!"); } }
	 */
}
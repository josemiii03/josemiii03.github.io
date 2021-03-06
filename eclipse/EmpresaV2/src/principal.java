import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;

public class principal {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static empleado[] empleados = new empleado[5];

	public static void main(String[] args) {

		// Empleados por defecto....
		empleados[1] = new empleado(2, "Mu�oz", "Contable", LocalDate.of(2020, 04, 03), 1576);
		empleados[2] = new empleado(3, "Casta�o", "Programador", LocalDate.of(2019, 10, 30), 200);
		empleados[4] = new empleado(5, "perez", "Limpiador", LocalDate.of(2018, 01, 30), 030);

		boolean terminarMenu = false;

		// int indiceVacio = huecoEmpleado();
		// int numero empleado
		

		do {
			try {

				System.out.println();
				System.out.println("_______________EMPLEADOS__________________________________________");
				System.out.println();
				System.out.println("1. Mostrar todos los Empleados.");
				System.out.println("2. Mostrar un empleado a partir de su n� de empleado");
				System.out.println("");
				System.out.println("3. Insertar un empleado.");
				System.out.println("4. Borrar un empleado a partir de n� de empleado");
				System.out.println("5. Modificar atributo de empleado a partir de sun� de empleado");
				System.out.println("");
				System.out.println("6. Mostrar el empleado con el salario m�ximo ");
				System.out.println("7. Salir del programa ");
				System.out.println("__________________________________________________________________");
				System.out.println("8. Ejecutar Test ");
				System.out.println("__________________________________________________________________");

				int lectura = Integer.parseInt(teclado.readLine());

				switch (lectura) {
				default:
					System.out.println("Introduce una opci�n existente");
				case 1:
					mostrarEmpleados(empleados);
					break;
				case 2:

					empleados[sacarIndice()].datosEmpleado();

					break;
				case 3:
					a�adirEmpleado(empleados);
					mostrarEmpleados(empleados);
					break;
				case 4:
					mostrarEmpleados(empleados);

					System.out.println("Introduce un n� para borrar empleado");

					borrarEmpleado(Integer.parseInt(teclado.readLine()));

					// empleados[sacarIndice(lectura)] = null;

					break;
				case 5:

					int emp = sacarIndice();

					boolean terminarSubmenu = false;
					do {
						System.out.println();
						System.out.println("_______________SUBMEN� PARA MODIFICAR EMPLEADOS____________________");
						empleados[emp].datosEmpleado();
						System.out.println();
						System.out.println("1. Editar 'n�' de empleado.");
						System.out.println("2. Editar 'Appellido' del empleado.");
						System.out.println("3. Editar 'Oficio' del empleado.");
						System.out.println("4. Editar 'Fecha' del empleado");
						System.out.println("5. Editar 'Salario' del empleado");
						System.out.println("");
						System.out.println("6. Volver al Men� principal");
						System.out.println("___________________________________________________________________");
						lectura = Integer.parseInt(teclado.readLine());

						switch (lectura) {
						default:
							System.out.println("Introduce una opci�n existente");
						case 1:
							System.out.println("Introduce el n�mero nuevo que deseas asingnarle");
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
							System.out.print("	Inserta el A�o:");
							int a�o = Integer.parseInt(teclado.readLine());
							System.out.print("	Inserta el Mes:");
							int mes = Integer.parseInt(teclado.readLine());
							System.out.print("	Inserta el dia:");
							int dia = Integer.parseInt(teclado.readLine());

							empleados[emp].setFecha_alt(LocalDate.of(a�o, mes, dia));

							break;
						case 5:
							System.out.println("Introduce el Salario nuevo que deseas asingnarle");
							empleados[emp].setSalario(Integer.parseInt(teclado.readLine()));
							break;
						case 6:
							terminarSubmenu = true;
							break;
						}

					} while (terminarSubmenu == false);
					break;

				case 6:
					System.out.println("El empleado con el mayor salario es: ");
					System.out.println(empleados[posicionSalarioMaximo()]);
					System.out.println("");
					break;
				case 7:
					terminarMenu = true;
					break;
				case 8:
					test();
				}

			} catch (ArrayIndexOutOfBoundsException e) { // control de errores
				System.out.println("Este empleado no existe!!");
			} catch (NumberFormatException | IOException e) {
				System.out.println("Caracter o n�mero Inv�lido!");
			} catch (DateTimeException e) {
				System.out.println("Fecha inv�lida!");
			}
		} while (terminarMenu == false);

	}

	public static void editarNum() {

	}

	// Introducir emp_n y te devuelve donde se encuentra el empleado dentro del
	// array
	public static int sacarIndice() throws NumberFormatException, IOException {
		System.out.println("Introduce un n�");

		int lectura = (Integer.parseInt(teclado.readLine()));

		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				if (empleados[i].getEmp_no() == lectura) {
					return i;
				}
			}
		}
		return -1; // devuelvo esto para generar un error y expresar que el empleado no existe
	}

	public static void mostrarEmpleados(empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				empleados[i].datosEmpleado();
			}
		}
	}

	public static void a�adirEmpleado(empleado[] empleados) {
		boolean hueco = false;
		int i;
		for (i = 0; i < empleados.length; i++) {
			if (empleados[i] == null) {
				empleados[i] = new empleado((i + 1), null, null, LocalDate.of(2021, 10, 02), 0);
				hueco = true;
				break;
			}
		}
		if (hueco == false) {
			System.out.println("no hay hueco para a�adir mas empleados ;-;");
		}
	}

	public static boolean existeEmpleado(int emp_no) {
		int i = 0;
		while (i < 5) {
			if (empleados[i] != null) {
				if (empleados[i].getEmp_no() == emp_no) {
					return true;
				}
			}
			i++;
		}
		return false;

	}

	public static boolean arrayCompleto() {

		int i = 0;
		while (i < 5) {
			if (empleados[i] == null) {
				return false;
			}
			i++;
		}
		return true;

	}

	public static boolean arrayVacio() {
		int i = 0;
		while (i < 5) {
			if (empleados[i] != null) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static int posicionSalarioMaximo() {
		int temp = 0;
		int indice = 0;
		for (int i = 1; i < empleados.length; i++) {
			if (empleados[i] != null) {
				if (empleados[i].salario > temp) {
					temp = empleados[i].salario;
					indice = i;
				}
			}
		}
		return indice;
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

	public static int existeEmpleadoInt(int num) {


		
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null && empleados[i].getEmp_no() == num) {
					return i;
				}
			}
		return -1;
	}

	static void borrarEmpleado(int num) throws NumberFormatException, IOException {
		int indice = existeEmpleadoInt(num);
		if (indice == -1) {
			System.out.println("No se puede borrar por que no existe");
		} else {
			System.out.println("Se ha borrado!");
			empleados[indice] = null;

		}
	}

	public static void test() throws NumberFormatException, IOException {
		// mostrarEmpleados(empleados);
		// System.out.println("El empleado con salario m�ximo tiene el id:
		// "+posicionSalarioMaximo());

		System.out.println("El hueco libre tiene la id " + buscaHueco());

	}
}

package elDepartamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// José Miguel Calderón de la barca Gutíerrez - 1º Dam - Programacion

// Nota: En este programa no se tiene en cuenta la edición del nº de departamento y el mismo se genera en orden.

public class principal {

	static departamento[] departamentos = new departamento[5];

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static int numeroDepartamentos = 0;

	public static void main(String[] args) {

		boolean salirMenu = false;

		do {

			try {

				System.out.println("________________________Gestion Departamentos______________________");
				System.out.println("1 - Mostrar todos los departamentos");
				System.out.println("2 - Mostrar un departamento a partir de su dept_no. ");
				System.out.println("3 - Insertar un departamento.");
				System.out.println("4 - Borrar un departamento a partir de su dept_no.");
				System.out.println("5 - Modificar atributo de departamentos a partir de su dept_no..");
				System.out.println("");
				System.out.println("6 - Salir");
				System.out.println("____________________________________________________________________");

				switch (Integer.parseInt(teclado.readLine())) {
				default:
					System.out.println("Introduce una opción existente");
				case 1:
					if (arrayVacio() == false) {
						mostrarDepartamentos();
					} else {
						System.out.println("No hay ningún departamento que Mostrar ;-;");
					}

					break;
				case 2:
					if (arrayVacio() == false) {
						mostrarDepartamentoDepNO();
					} else {
						System.out.println("No hay ningún departamento en el sistema");
					}
					break;
				case 3:
					if (arrayLLeno() == false) {
						añadirDepartamento();
					} else {
						System.out.println("No hay espacio para mas Departamentos por que está lleno");
					}
					break;
				case 4:
					if (arrayVacio() == false) {
						borrarDepartamentoDepNO();
					} else {
						System.out.println("No hay ningún departamento para borrar por que está vacio");
					}
					break;
				case 5:
					if (arrayVacio() == false) {
						editarDepartamento();
					} else {
						System.out.println("No hay ningún departamento para editar por que está vacio");
					}
					break;

				case 6:
					salirMenu = true;
					break;
				}

			} catch (NumberFormatException | IOException e) {
				System.out.println("Caracter o número Inválido!");
			} catch (ArrayIndexOutOfBoundsException e) { // control de errores
				System.out.println("Este departamento no existe!!");
			}
		} while (salirMenu == false);

	}

	public static void mostrarDepartamentos() {
		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] != null) {
				System.out.println(departamentos[i]);
			}
		}
	}

	public static void mostrarDepartamentoDepNO() throws NumberFormatException, IOException {
		System.out.println("Introduce el nº de departamento");
		int depNum = Integer.parseInt(teclado.readLine());
		if (departamentos[depNum - 1] != null) {
			System.out.println(departamentos[depNum - 1]);
		} else {
			System.out.println("Este departamento no existe");
		}
	}

	public static void borrarDepartamentoDepNO() throws NumberFormatException, IOException {
		System.out.println("Introduce el nº de departamento");
		int depNum = Integer.parseInt(teclado.readLine());
		if (departamentos[depNum - 1] != null) {
			departamentos[depNum - 1] = null;
			System.out.println("Borrado!");
			numeroDepartamentos = numeroDepartamentos - 1;
		} else {
			System.out.println("Este departamento no existe");
		}
	}

	public static void añadirDepartamento() {
		int hueco = buscaHueco();
		departamentos[hueco] = new departamento(hueco + 1, "Departamento", "Venezuela");
		numeroDepartamentos = numeroDepartamentos + 1;
	}

	public static boolean arrayVacio() {
		if (numeroDepartamentos == 0) {
			return true;
		}
		return false;
	}

	public static boolean arrayLLeno() {
		if (numeroDepartamentos == 5) {
			return true;
		}
		return false;
	}

	public static int buscaHueco() {
		int i;
		for (i = 0; i < departamentos.length; i++) {
			if (departamentos[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public static void editarDepartamento() throws NumberFormatException, IOException {

		System.out.println("Introduce el Nº de departamento a editar");

		int depIndice = Integer.parseInt(teclado.readLine()) - 1;

		boolean terminarEditarDep = false;
		do {
			System.out.println();
			System.out.println("_______________SUBMENÚ PARA MODIFICAR Departamentos________________");
			System.out.println(departamentos[depIndice]);
			System.out.println("1. Editar 'Nombre' del Departamento.");
			System.out.println("2. Editar 'Localización' del Departamento.");
			System.out.println("");
			System.out.println("3. Volver al Menú principal");
			System.out.println("____________________________________________________________________");

			switch (Integer.parseInt(teclado.readLine())) {
			default:
				System.out.println("Introduce una opción existente");
			case 1:
				System.out.println("Introduce el 'Nombre' nuevo del Departamento.");
				editarNombreDep(depIndice);
				break;
			case 2:
				System.out.println("Introduce la 'Localizacion' nueva del Departamento.");
				editarLocalizacionDep(depIndice);
				break;

			case 3:
				terminarEditarDep = true;
				break;
			}

		} while (terminarEditarDep == false);

	}

	public static void editarNombreDep(int depIndice) throws IOException {
		departamentos[depIndice].setdNombre(teclado.readLine());
	}

	public static void editarLocalizacionDep(int depIndice) throws IOException {
		departamentos[depIndice].setLocalizacion(teclado.readLine());
	}

	public static int contarDepartamentos() {
		int i;
		int cuenta = 0;
		for (i = 0; i < departamentos.length; i++) {
			if (departamentos[i] != null) {
				cuenta = cuenta + 1;
			}
		}
		return cuenta;
	}

}

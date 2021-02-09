package testgatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalGatos {

	public static void main(String[] args) {

		// gato con argumentos nombre color peso
		gato gato1 = new gato();
		gato1.nombre = args[0];
		gato1.color = args[1];
		gato1.peso = Double.parseDouble(args[2]);
		gato1.fechaCompra = "23-07-2013";

		gato gato2 = new gato();
		gato2.nombre = "Garfield";
		gato2.color = "naranja";
		gato2.peso = 95;
		gato2.fechaCompra = "31-06-2012";

		// ----------------------------

		// Instrucciones
		gato1.leergato();

		System.out.println("El Dia es " + decirDia(gato1.fechaCompra));
		System.out.println("El Mes es " + decirMes(gato1.fechaCompra));
		System.out.println("El Año es " + decirAño(gato1.fechaCompra));

		gato2.leergato();

		System.out.println("El Dia es " + decirDia(gato2.fechaCompra));
		System.out.println("El Mes es " + decirMes(gato2.fechaCompra));
		System.out.println("El Año es " + decirAño(gato2.fechaCompra));

		// FORMA 1

		System.out.println("El gato mas viejo es " + (gatoMasViejo(gato1, gato2)).nombre); // El problema de este es
																							// cuando son iguales.

		gatoMasViejoLocalDate(gato1, gato2);
	}

	public static int decirDia(String fechaCompra) {
		int dia = Integer.parseInt(fechaCompra.substring(0, 2));
		return dia;
	}

	public static int decirMes(String fechaCompra) {
		int mes = Integer.parseInt(fechaCompra.substring(3, 5));
		return mes;
	}

	public static int decirAño(String fechaCompra) {
		int año = Integer.parseInt(fechaCompra.substring(6, 10));
		return año;
	}

	
    public static gato gatoMasViejoLocalDate(gato gato1, gato gato2) {
        LocalDate gatoA = LocalDate.parse(gato1.fechaCompra, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate gatoB = LocalDate.parse(gato2.fechaCompra, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        if (gatoA.isAfter(gatoB)) {
        	System.out.println("El gato mas viejo es '" + gato2.nombre + "'");
        	return gato2;
        } else {
        	if (gatoB.isAfter(gatoA)) {
        		System.out.println("El gato mas viejo es '" + gato1.nombre + "'");
            	return gato1;
            } else {
            	System.out.println(gato1.nombre + " y " + gato2.nombre + " son iguales!!");
            	return null;
            }
        }
    }
	
	

	
	// ------------------------ FORMA1----------------------------------------------------------------------------------------
	public static gato gatoMasViejo(gato gato1, gato gato2) {

		if (decirAño(gato1.fechaCompra) < decirAño(gato2.fechaCompra)) {
			return gato1;
		} else {
			if (decirAño(gato1.fechaCompra) > decirAño(gato2.fechaCompra)) {
				return gato2;
			} else {
				if (decirMes(gato1.fechaCompra) < decirMes(gato2.fechaCompra)) {
					return gato1;
				} else {
					if (decirMes(gato1.fechaCompra) > decirMes(gato2.fechaCompra)) {
						return gato2;
					} else {
						if (decirDia(gato1.fechaCompra) < decirDia(gato2.fechaCompra)) {
							return gato1;
						} else {
							if (decirDia(gato1.fechaCompra) > decirDia(gato2.fechaCompra)) {
								return gato2;
							} else {
								return null; // si son iguales
							}
						}
					}
				}
			}
		}
	}
}

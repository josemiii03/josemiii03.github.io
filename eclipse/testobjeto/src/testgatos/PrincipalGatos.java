package testgatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalGatos {

	public static void main(String[] args) {

		// gatos
		gato gato1 = new gato();
		gato1.nombre = "Misifus";
		gato1.color = "blanco";
		gato1.peso = 12;
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

		// FORMA 2

		System.out.println("El gato mas viejo es el nº " + gatoMasViejo01(gato1, gato2)); // En este te dice el numero
																							// de gato.

		leerGatoMasViejo01(gato1, gato2); // Para decir el nombre del gato por terminal

		// FORMA 3

		System.out.println(gatoMasViejo02(gato1, gato2));
		
		// con clase localdate

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

	// ------------------------ FORMA2----------------------------------------------------------------------------------------
	public static void leerGatoMasViejo01(gato gato1, gato gato2) {
		int gatoviejo = gatoMasViejo01(gato1, gato2);
		if (gatoviejo == 1) {
			System.out.println("El gato mas viejo es '" + gato1.nombre + "'");
		}
		if (gatoviejo == 2) {
			System.out.println("El gato mas viejo es '" + gato2.nombre + "'");
		}
		if (gatoviejo == 0) {
			System.out.println(gato1.nombre + " y " + gato2.nombre + " son iguales!!");
		}
	}

	public static int gatoMasViejo01(gato gato1, gato gato2) {
		int gatoViejo;
		if (decirAño(gato1.fechaCompra) < decirAño(gato2.fechaCompra)) {
			gatoViejo = 1;
		} else {
			if (decirAño(gato1.fechaCompra) > decirAño(gato2.fechaCompra)) {
				gatoViejo = 2;
			} else {
				if (decirMes(gato1.fechaCompra) < decirMes(gato2.fechaCompra)) {
					gatoViejo = 1;
				} else {
					if (decirMes(gato1.fechaCompra) > decirMes(gato2.fechaCompra)) {
						gatoViejo = 2;
					} else {
						if (decirDia(gato1.fechaCompra) < decirDia(gato2.fechaCompra)) {
							gatoViejo = 1;
						} else {
							if (decirDia(gato1.fechaCompra) > decirDia(gato2.fechaCompra)) {
								gatoViejo = 2;
							} else {
								gatoViejo = 0;
							}
						}
					}
				}
			}
		}
		return gatoViejo;
	}

	// -----------------------------Forma 3-----------------------------------------------------------------------------------
	public static String gatoMasViejo02(gato gato1, gato gato2) {
		String gatoViejo;
		if (decirAño(gato1.fechaCompra) < decirAño(gato2.fechaCompra)) {
			gatoViejo = "El gato mas viejo es '" + gato1.nombre + "'";
		} else {
			if (decirAño(gato1.fechaCompra) > decirAño(gato2.fechaCompra)) {
				gatoViejo = "El gato mas viejo es '" + gato2.nombre + "'";
			} else {
				if (decirMes(gato1.fechaCompra) < decirMes(gato2.fechaCompra)) {
					gatoViejo = "El gato mas viejo es '" + gato1.nombre + "'";
				} else {
					if (decirMes(gato1.fechaCompra) > decirMes(gato2.fechaCompra)) {
						gatoViejo = "El gato mas viejo es '" + gato2.nombre + "'";
					} else {
						if (decirDia(gato1.fechaCompra) < decirDia(gato2.fechaCompra)) {
							gatoViejo = "El gato mas viejo es '" + gato1.nombre + "'";
						} else {
							if (decirDia(gato1.fechaCompra) > decirDia(gato2.fechaCompra)) {
								gatoViejo = "El gato mas viejo es '" + gato2.nombre + "'";
							} else {
								gatoViejo = "El gato '" + gato1.nombre + "' tiene la misma fecha que el gato '"	+ gato2.nombre + "'";
							}
						}
					}
				}
			}
		}
		return gatoViejo;
	}
}

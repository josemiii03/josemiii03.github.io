package herencia;


public class principal {

	public static void main(String[] args) {
	
	empleado empleados[] = new empleado[5];
	
	empleados[1] = new directivo(0, "cesar", "CEO", null, 15, 1000);
	
	empleados[3] = new analista(0, "gojo", "Android Developer", null, 3, "eclipse");
	
	empleados[1].aumentoDeSueldo();
	
	empleados[3].aumentoDeSueldo();
	
	}
}

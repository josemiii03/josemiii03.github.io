package herencia;


public class principal {

	public static void main(String[] args) {
	
	empleado empleados[] = new empleado[5];
	
	empleados[1] = new empleado(0, null, null, null, 0);
	empleados[3] = new analista(0, "PACO", "Android Developer", null, 3, "eclipse");
	
	empleados[3].aumentoDeSueldo();
	

	
	
	
	}
}

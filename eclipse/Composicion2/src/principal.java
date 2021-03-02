
public class principal {

	
	public static void main(String[] args) {
		
		metodoAgregacion() ;
	}
	
	public static void metodoAgregacion() {
		
		departamento[] departamentos = new departamento[5];
		
		empleado[] empleados = new empleado[5];
		
		empleados[1] = new empleado(0, "Paco", null, null, 0);
		empleados[2] = new empleado(2, "Manolo", null, null, 0);
		
		departamentos[1] = new departamento(1,"Matemáticas" , "Piso Bajo", empleados);
		
		
		System.out.println(departamentos[1]);
		
	}
	
	public static void metodoComposicion() {
		/**
		departamento[] departamentos = new departamento[5];

		departamentos[1] = new departamento(0, null, null);
		departamentos[2] = new departamento(0, "dsdsd", null);
		
		departamentos[1].setEmpleados("manolo");
		
		System.out.println(departamentos[1]);
		System.out.println(departamentos[2]);
		**/
	}
}

import java.time.LocalDate;

public class principal {

	static empleado[] emps = new empleado[5];
	static departamento[] deps = new departamento[5];
	
	public static void main(String[] args) {
		
		
		emps[1] = new empleado(deps[1], 2, "Muñoz", "Contable", LocalDate.of(2020, 04, 03), 1576);
		
		deps[1]= new departamento(1, "Contables", "piso bajo");
		
		
		emps[2]  = new empleado (deps[1], 2, "Muñoz", "Contable", LocalDate.of(2020, 04, 03), 1576);

		
		System.out.println(emps[2].mostrarDep());
	}

}

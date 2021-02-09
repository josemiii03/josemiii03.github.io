import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		
		
		empleado emp1 = new empleado(1, "Gutiérrez", "Contable",LocalDate.of(1974,04,03), 1576);
			
		emp1.datoEmpleado();
		
		
		String[] vector = new String[5];
		
		for(int i = 0; i<5; i++) {
			vector[i] = emp1.oficio; 

		}

	}

}

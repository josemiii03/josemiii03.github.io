
public class principal {

	static trabajador trabajadores [] = new trabajador[100];
	
	public static void main(String[] args) {
		
		trabajadores[1] = new trabajador ("Paco", "Murillo", 1237, false);
		trabajadores[2] = new trabajador ("Paco", "Murillo", 237, true);
		
		
		System.out.println(trabajadores[1]);
		
	}
	
	

}

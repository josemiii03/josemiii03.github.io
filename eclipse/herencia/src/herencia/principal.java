package herencia;


public class principal {

	public static void main(String[] args) {
	
	
		
	
	empleado lista[] = new empleado[5];
	
	//test agregación
	//departamento dep = new departamento(0, "Correos Express SA", null,lista);
		
	lista[0] = new empleado(0, "paco", "mensajero", null, 15);
	
	lista[1] = new directivo(0, "cesar", "CEO Correos Express", null, 15, 1000);
	
	lista[3] = new analista(0, "gojo", "Ingeniero Analista", null, 3, "lupa");
	
	String s ="";
	
	s+=lista[0];
	s+=lista[1];
	s+=lista[3];
	
	System.out.println(s);
	
	
	
	
	}
	

}

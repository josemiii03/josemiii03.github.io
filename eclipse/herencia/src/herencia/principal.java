package herencia;


public class principal {

	public static void main(String[] args) {
	
	empleado lista[] = new empleado[5];
	
	lista[1] = new directivo(0, "cesar", "CEO Correos Express", null, 15, 1000);
	
	lista[3] = new analista(0, "paco", "Analista", null, 3, "lupa");
	
	lista[1].aumentarSueldo();
	lista[3].aumentarSueldo();
	
	}
}

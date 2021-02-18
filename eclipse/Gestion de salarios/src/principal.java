
public class principal {

	static trabajador trabajadores[] = new trabajador[100];

	public static void main(String[] args) {

		trabajadores[1] = new trabajador("Paco", "Murillo", 1237, true);
		trabajadores[2] = new trabajador("Antonio", "Quijano", 2000, true);
		trabajadores[3] = new trabajador("Alberto", "Brey", 2200, false);

		listadoTrabajadores();
		
		System.out.println(masaSalarial());

	}

	public static void listadoTrabajadores() {
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] != null) {
				System.out.println(trabajadores[i]);
			}
		}
	}

	public static int masaSalarial() {
		int mSalarialCont = 0;
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] != null && trabajadores[i].isSituación() == true) {
				mSalarialCont = (trabajadores[i].getSalarioBruto() + mSalarialCont);
			}
		}
		return mSalarialCont;
	}

}

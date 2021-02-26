package dos;

public class Empresa {
	public Trabajador ListaTrabajadores[];
	public int contadortrabajadores;
	public Empresa(){
		ListaTrabajadores=new Trabajador[100];
		contadortrabajadores=0;
	}
	public void NuevoTrabajador(Trabajador t) {
		int maximo=0;
		for (int i=0;i<contadortrabajadores;i++) {
			if (ListaTrabajadores[i].getId()>maximo) {
				maximo=ListaTrabajadores[i].getId();
			}
			
		}
		t.setId(maximo);
		ListaTrabajadores[contadortrabajadores]=new Trabajador(t);
		contadortrabajadores++;
	}
	public void MostrarListado() {
		System.out.println("Listado de trabajadores de la empresa");
		System.out.println("=====================================");
		System.out.println("Id      Nombre               Apellidos                      Salario         Situación (A/B)");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (int i=0;i<=contadortrabajadores;i++) {
			System.out.println(ListaTrabajadores[i]);
		}
	}
	public boolean IncrementarSalario(String nom,String ap,int porcentaje) {
		int trab=ObtenerIdTrabajador(nom, ap);
		if (trab!=-1) {
			for (int i=0;i<contadortrabajadores;i++) {
				if (ListaTrabajadores[i].getId()==trab) { 
					ListaTrabajadores[i].ModificarSalario(porcentaje);
					return true;
				}	
			}
		}
		return false;
	}
	public int ObtenerIdTrabajador(String nombre, String Apellidos) {
		for (int i=0;i<contadortrabajadores;i++) {
			if ((ListaTrabajadores[i].getNombre()==nombre)&&(ListaTrabajadores[i].getApellidos()==Apellidos)) { 
				return ListaTrabajadores[i].getId();
			}
		}
		return -1;
	}
	public void obtenerMasaSalarial() {
		double total=0;
		for (int i=0;i<contadortrabajadores;i++) {
			if (!ListaTrabajadores[i].isEnactivo()) {
				total-=ListaTrabajadores[i].getSalario();
			}
		}
		System.out.println("===================================================================================");
		System.out.println("Masa salarial total:                                        "+ total);
		
	}
	public boolean darDeBaja(String nom, String ap) {
		int trab=ObtenerIdTrabajador(nom,ap);
		if (trab!=-1) {
			for (int i=0;i<contadortrabajadores;i++) {
				if (ListaTrabajadores[i].getId()==trab) {
					ListaTrabajadores[i].setEnactivo(true);
					return true;
				}	
			}
		}
		return false;		
	}
	public static void main(String[] args) {
		//CODIGO DE PRUEBAS
		Empresa e=new Empresa();
		Trabajador T1=new Trabajador("Juan","Gómez López",27000,true);
		Trabajador T2=new Trabajador("Alicia","Álvarez Aladino",99000,true);
		Trabajador T3=new Trabajador("José Luis","De la Morena Gálvez",27000,true);
		Trabajador T4=new Trabajador("Justo","Márquez Sánchez",99000,true);
		e.NuevoTrabajador(T1);
		e.NuevoTrabajador(T2);
		e.NuevoTrabajador(T3);
		e.NuevoTrabajador(T4);
		e.IncrementarSalario("Juan","Gómez López", 10);
		e.darDeBaja("Justo", "Márquez Sánchez");
		e.MostrarListado();
		e.obtenerMasaSalarial();
		//FIN DEL CÓDIGO DE PRUEBAS
	}

}

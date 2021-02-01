package testgatos;

public class gato {

	public String nombre;
	public double peso;
	public String color;
	public String fechaCompra;
	
	
	public void leergato() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("-El nombre es: " + this.nombre);
		System.out.println("-El peso de " + this.nombre + " es: " + this.peso);
		System.out.println("-El Color de " + this.nombre + " es: " + this.color);
		System.out.println("-----------------------------------------------------------");
	}
}

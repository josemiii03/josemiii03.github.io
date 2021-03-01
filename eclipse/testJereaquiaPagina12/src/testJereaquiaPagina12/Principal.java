package testJereaquiaPagina12;

public class Principal {

	public static void main(String[] args) {

		Coche cuatroLatas = new Coche(0, 100);

		bicicleta canyon = new bicicleta(0, 2);
		System.out.println(cuatroLatas + " " + canyon);

		cuatroLatas.acelera();

		canyon.acelera();

		System.out.println(cuatroLatas + " " + canyon);

		cuatroLatas.para();

		System.out.println(cuatroLatas + " " + canyon);

	}

}

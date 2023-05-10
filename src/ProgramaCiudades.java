interface Ciudad {
	void calcularPoblacionFinal();

	public static void main(String[] args) {
		// cuerpo del método
	}
}

// CLASES QUE IMPLEMENTAN CIUDAD

class Barcelona implements Ciudad {
	private int poblacionParcial = 1620000;
	private double poblacionFinal;

	public void calcularPoblacionFinal() {
		poblacionFinal = poblacionParcial * 0.80;
		System.out.println("La poblacion final de Barcelona es: " + poblacionFinal);
	}

	public static void main(String[] args) {
		Barcelona barcelona = new Barcelona();
		barcelona.calcularPoblacionFinal();
	}

}

class Cordoba implements Ciudad {
	private int poblacionParcial = 325708;
	private double poblacionFinal;

	public void calcularPoblacionFinal() {
		poblacionFinal = poblacionParcial * 0.80;
		System.out.println("La poblacion final de Cordoba es: " + poblacionFinal);
	}
	
	public static void main(String[] args) {
		Cordoba cordoba = new Cordoba();
		cordoba.calcularPoblacionFinal();
	}
}

class Madrid implements Ciudad {
	private int poblacionParcial = 3223000;
	private double poblacionFinal;

	public void calcularPoblacionFinal() {
		poblacionFinal = poblacionParcial * 0.80;
		System.out.println("La poblacion final de Madrid es: " + poblacionFinal);
	}
	
	public static void main(String[] args) {
		Madrid madrid = new Madrid();
		madrid.calcularPoblacionFinal();
	}
}

class Malaga implements Ciudad {
	private int poblacionParcial = 571026;
	private double poblacionFinal;

	public void calcularPoblacionFinal() {
		poblacionFinal = poblacionParcial * 0.80;
		System.out.println("La poblacion final de Malaga es: " + poblacionFinal);
	}
	
	public static void main(String[] args) {
		Malaga malaga = new Malaga();
		malaga.calcularPoblacionFinal();
	}
}

class Sevilla implements Ciudad {
	private int poblacionParcial = 688711;
	private double poblacionFinal;

	public void calcularPoblacionFinal() {
		poblacionFinal = poblacionParcial * 0.80;
		System.out.println("La poblacion final de Sevilla es: " + poblacionFinal);
	}
	
	public static void main(String[] args) {
		Sevilla sevilla = new Sevilla();
		sevilla.calcularPoblacionFinal();
	}
}

// CLASE MAIN
public class ProgramaCiudades {
	public static void main(String[] args) {
		Ciudad[] ciudades = new Ciudad[5];
		ciudades[0] = new Barcelona();
		ciudades[1] = new Cordoba();
		ciudades[2] = new Madrid();
		ciudades[3] = new Malaga();
		ciudades[4] = new Sevilla();

		for (Ciudad ciudad : ciudades) {
			ciudad.calcularPoblacionFinal();
		}
	}
}

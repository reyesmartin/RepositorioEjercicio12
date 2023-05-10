interface Ciudad {
    void calcularPoblacionFinal();
}

// CLASES QUE IMPLEMENTAN CIUDAD

class Barcelona implements Ciudad {
    private int poblacionParcial = 1620000;
    private double poblacionFinal;

    public void calcularPoblacionFinal() {
        poblacionFinal = poblacionParcial * 0.80;
        System.out.println("La poblacion final de Barcelona es: " + poblacionFinal);
    }
}

class Cordoba implements Ciudad {
    private int poblacionParcial = 325708;
    private double poblacionFinal;

    public void calcularPoblacionFinal() {
        poblacionFinal = poblacionParcial * 0.80;
        System.out.println("La poblacion final de Cordoba es: " + poblacionFinal);
    }
}

class Madrid implements Ciudad {
    private int poblacionParcial = 3223000;
    private double poblacionFinal;

    public void calcularPoblacionFinal() {
        poblacionFinal = poblacionParcial * 0.80;
        System.out.println("La poblacion final de Madrid es: " + poblacionFinal);
    }
}

class Malaga implements Ciudad {
    private int poblacionParcial = 571026;
    private double poblacionFinal;

    public void calcularPoblacionFinal() {
        poblacionFinal = poblacionParcial * 0.80;
        System.out.println("La poblacion final de Malaga es: " + poblacionFinal);
    }
}

class Sevilla implements Ciudad {
    private int poblacionParcial = 688711;
    private double poblacionFinal;

    public void calcularPoblacionFinal() {
        poblacionFinal = poblacionParcial * 0.80;
        System.out.println("La poblacion final de Sevilla es: " + poblacionFinal);
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

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ProgramaCiudades {

	public static void main(String[] args) {
		
		Ciudad barcelona = new Ciudad("Barcelona", 1620000);
		Ciudad cordoba = new Ciudad("Cordoba", 325708);
		Ciudad madrid = new Ciudad("Madrid", 3223000);
		Ciudad malaga = new Ciudad("Malaga", 571026);
		Ciudad sevilla = new Ciudad("Sevilla", 688711);
		List<Ciudad> ciudades = Arrays.asList(barcelona, cordoba, madrid, malaga, sevilla);
		
		String proyecto = "Poblacion Ciudades";
		int buildNumero = 1;
		String contenidoJenkinsFile = 
				"pipeline {\n" +
                        "    agent any\n" +
                        "    stages {\n" +
                        "        stage('Build') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'Building " + proyecto + " (Build #" + buildNumero + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n";
		
		
		for(Ciudad c: ciudades) {
			contenidoJenkinsFile +="        stage('"+c.getNombre()+"') {\n" +
                    				"            steps {\n" +
				                    "                script {\n" +
				                    "                    echo 'Poblacion final de "+c.getNombre()+" es: "+c.calculaPoblacionFinal()+"'\n" +
				                    "                }\n" +
				                    "            }\n" +
				                    "        }\n";
		}

		
		contenidoJenkinsFile += "}\n" +
                        "}";
										  	

		try (
			PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile")))
		{
			writer.write(contenidoJenkinsFile);
			System.out.println("Se genero el archivo correctamente");
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
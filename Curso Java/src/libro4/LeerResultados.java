package libro4;
import java.util.Scanner;
public class LeerResultados {

	public static void main(String[] args) 
	{
		Resultados misResultados=new Resultados();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el N�mero de Estudiantes que presentaron la Prueba: ");
		int numeroEstudiantes=entrada.nextInt();
		misResultados.analisis(numeroEstudiantes);
	}

}

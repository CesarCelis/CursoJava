package libro2;
import java.util.Scanner;
public class LeerLibroCalificaciones {

	public static void main(String[] args) 
	{
		LibroCalificaciones libro=new LibroCalificaciones("java 1");
		libro.mostrarNombre();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el n�mero de estudiantes: ");
		int numeroEstudiantes=entrada.nextInt();		
		System.out.println("El promedio de nota de los estudiantes es: "+libro.promedio(numeroEstudiantes));
	
	}

}

package libro2;
import java.util.Scanner;

public class LibroCalificaciones 
{
	//variable de instanciación
	//private:solo es accesible en la propia clase
	private String nombreCurso;
	//public: permite el uso del metodo por clase externas
	public LibroCalificaciones(String nombreCurso)
	{
		//this:indica que la variable es propia de clase
		this.nombreCurso=nombreCurso;
	}
	//método get: Obtener el valor de la variable
	public String getNombreCurso() 
	{
		return nombreCurso;
	}
	//método set: Modificar variables. Establece el valor de la variable.
	public void setNombreCurso(String nombreCurso) {
		
		this.nombreCurso = nombreCurso;
	}
	
	public void mostrarNombre()
	{
		System.out.println("Nombre del Curso: "+getNombreCurso());
	}
	
	public double promedio(int numeroEstudiantes)
	{
		double total=0;
		int contador=0;	
		double promedio=0;
		double nota=0;
		Scanner entrada=new Scanner(System.in);
		
		while(contador<numeroEstudiantes)
		{
			System.out.println("Ingrese la Nota del Estudiante "+(contador+1)+":");
			nota=entrada.nextDouble();
			total=total+nota;
			contador++;
		}
		promedio=total/numeroEstudiantes;
		return promedio;
		
	}
	
}

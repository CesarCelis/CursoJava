package libro3;

import java.util.Scanner;

public class LibroCalificaciones
{
	private String nombreCurso;

	public LibroCalificaciones(String nombreCurso) {
		super();
		this.nombreCurso = nombreCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	public void mostrarNombre()
	{
		System.out.println("Nombre del Curso: "+getNombreCurso());
	}
	
	public double promedio()
	{
		Scanner entrada=new Scanner(System.in);
		int nota=0;
		double promedio=0;
		int contador=0;
		int suma=0;
		System.out.println("Ingrese la nota o -1 para terminar: ");
		nota=entrada.nextInt();
		while(nota!=-1)
		{
			suma=suma+nota;
			System.out.println(suma);
			contador++;	
			System.out.println("Ingrese la nota o -1 para terminar: ");
			nota=entrada.nextInt();
		}
		if(contador!=0)
		{
			promedio=(double)suma/contador;
		}
		else
		{
			System.out.println("No se pudo realizar la operación");
		}
		
		return promedio;
		
		
	}
	
}

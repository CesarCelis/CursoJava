package libro3;

public class LeerLibroCalificaciones {

	public static void main(String[] args) 
	{
		LibroCalificaciones libro=new LibroCalificaciones("Java 1");
		libro.mostrarNombre();	
		double promedio=libro.promedio();
		if(promedio!=0)
		{
			System.out.println("promedio: "+promedio);
		}
	}

}

package libro4;
import java.util.Scanner;
public class Resultados 
{
	private double resultado;
	Scanner entrada=new Scanner(System.in);
	
	public void analisis(int numeroEstudiantes)
	{
		int contador=0;
		int contadorAprobados=0;
		int contadorReprobados=0;
		while(contador<numeroEstudiantes)
		{
			System.out.println("ingrese el Resultado de la prueba : ");
			resultado=entrada.nextDouble();
			if(resultado ==1 || resultado==2)
			{

				if(resultado==1)
				{
					contadorAprobados++;
				}
				else if(resultado==2)
				{
					contadorReprobados++;
				}
				
			}
			else
			{
				System.out.println("Debe Ingresar un valor valido: 1 o 2");
			}
				
			contador++;
		}
		System.out.println("Resumen: \n"+"\tN�mero de EstudiantesAprobados: "+contadorAprobados
				+"\n"+"\tN�mero de Estudiantes Reprobados: "+contadorReprobados);
		
		
		if(contadorAprobados>(numeroEstudiantes*0.8))
		{
			System.out.println("Se Aumentar� la colegiatura");
		}
		else
		{
			System.out.println("La Colegiatura no sufrira cambios");
		}
	}
}

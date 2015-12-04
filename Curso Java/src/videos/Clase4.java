package videos;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class Clase4 {

	
	public static void main(String[] args) 
	{
		int estudiantes=12;
		int aprobaron=0;
		int perdieron=0;
		double notas[]=new double[estudiantes];
		DecimalFormat f=new DecimalFormat("#.##");
		
		for (int i = 0; i < notas.length; i++) 
		{
			notas[i]= Math.random()*5;
			System.out.println(f.format(notas[i]));
			/*
			if(notas[i]<3.0)
			{
				System.out.println(f.format(notas[i]));
				System.out.println(f.format(notas[i]+0.2));
			}*/
			
			if(notas[i]>3.0)
			{
				aprobaron++;
						
			}			
			else if(notas[i]<3.0)
			{
				
				perdieron++;
						
			}
		}
		
		System.out.println("Aprobaron: "+aprobaron+" Estudiantes");
		System.out.println("Perdieron: "+perdieron+" Estudiantes");
		
		String palabra="perro";
		
		for (int i = 0; i < palabra.length(); i++) 
		{
			char letra=palabra.charAt(i);
			
			System.out.println(letra);
			
		}
		final int cantidad=12;
		int []numeros=new int[12];
		int contador=0;
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i]=(int) Math.floor(Math.random()*10)+1;
			System.out.println(numeros[i]);
			if(numeros[i]==3)
			{
				contador++;
				
			}			
		}
		System.out.println("el numero de tres en la cadena es: "+ contador);
		
		@SuppressWarnings("resource")
		Scanner ne=new Scanner(System.in);
		System.out.println("introdusca una palabra ");
		String texto=ne.nextLine();
		System.out.println(texto);			
		int arreglo[]=new int[texto.length()];
		for (int i = 0; i < arreglo.length; i++) 
		{
			char letrica=texto.charAt(i);
			System.out.println(letrica);
			arreglo[i]=letrica;
		}
		
		
	
		
	}
}

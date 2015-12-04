package videos;

import java.util.Scanner;

public class Tocho {

	public static void main(String[] args) 
	{
		String palindroma="anacleta";
		int inc=0;		
		int dec=palindroma.length()-1;	
		while(inc<dec)
		{
			if(palindroma.charAt(inc)==palindroma.charAt(dec))
			{
				inc++;
				dec--;
				
				if(inc==dec)
				{
				
					System.out.println("la palabra es palindroma");
				}				
			}
			else
			{
				System.out.println("No es Palindroma");
				break;
			}	
			
		}
		
		
		    final int FILAS = 5, COLUMNAS = 4;
	        Scanner sc = new Scanner(System.in);
	        int i, j, mayor, menor;
	        int filaMayor, filaMenor, colMayor, colMenor;
	        int[][] A = new int[FILAS][COLUMNAS];
	        System.out.println("Lectura de elementos de la matriz: ");
	        for (i = 0; i < FILAS; i++) {
	            for (j = 0; j < COLUMNAS; j++) {
	                System.out.print("A[" + i + "][" + j + "]= ");
	                A[i][j] = sc.nextInt();
	            }
	        }
	        
	        for (int k = 0; k < A.length; k++) 
	        {
				for (int k2 = 0; k2 < A[k].length; k2++) 
				{
					System.out.print(A[k][k2] + " ");
				}
				System.out.println(" ");
			}

}}

package libro;

public class Numeros 
{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int sumarNumeros(int numero1, int numero2)
	{
		int suma=numero1+numero2;
		return suma;
	}
}

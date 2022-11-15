package clasepractica;


public class Metodos {
	public static int generarNumerosAleatorios(int maximo , int minimo) {

	return (int)(Math.floor(Math.random() *(minimo - (maximo + 1)) + (maximo + 1)));
}
}

package clasepractica;

public abstract class Persona {

	private String Nombre;
	private char Sexo;
	private int Edad;
	private boolean Asistencia;
	
	private final String[] NOMBRES_ALUMNOS = {"Juan" , "Fernando" , "Jose", "Cris"};
	private final String[] NOMBRES_ALUMNAS = {"Maria" , "Fernanda" , "Ariana" , "Rebecca"};
	
	
	
	
	public Persona () {
		int sexoAleatorio = Metodos.generarNumerosAleatorios(0, 1);
		if (sexoAleatorio == 0) {
			this.Nombre = NOMBRES_ALUMNOS[Metodos.generarNumerosAleatorios(0, 3)];
			this.Sexo = 'M';
			
		}else {
			this.Nombre = NOMBRES_ALUMNAS[Metodos.generarNumerosAleatorios(0, 3)];
			this.Sexo = 'F';
		}
		
		Disponibilidad();
			
		
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		this.Sexo = sexo;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	public boolean isAsistencia() {
		return Asistencia;
	}
	public void setAsistencia(boolean asistencia) {
		this.Asistencia = asistencia;
	}
	public abstract void Disponibilidad();
		
	
	
}

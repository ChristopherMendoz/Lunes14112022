package clasepractica;

public class Estudiantes extends Persona{
	
	private int Calificacion;
	
	public Estudiantes() {
		super();
		this.Calificacion= Metodos.generarNumerosAleatorios(0, 10);
		super.setEdad(Metodos.generarNumerosAleatorios(17, 25));
		
	}

	public int getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(int calificacion) {
		Calificacion = calificacion;
	}

	@Override
	public void Disponibilidad() {
		int ProbabilidadDeAsistencia = Metodos.generarNumerosAleatorios(0, 100);
		if (ProbabilidadDeAsistencia < 50 ) {
			super.setAsistencia(false);
			
		}else {
			super.setAsistencia(true);
		}
		
	}
	public String MostrarInfoEstudiantes() {
		return "Nombre: " + super.getNombre() + ", Calificacion: "  + getCalificacion()+ ", Sexo: " + super.getSexo()+ ", Edad: " + super.getEdad();
		
	}
	

}

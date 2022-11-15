package clasepractica;

public class Profesor extends Persona{
	
	private String asignatura;
	
	public Profesor() {
		super();
		this.asignatura= Asignatura.ASIGNATURAS[Metodos.generarNumerosAleatorios(0, 2)];
		super.setEdad(Metodos.generarNumerosAleatorios(25, 50));
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		asignatura = asignatura;
	}

	@Override
	public void Disponibilidad() {
		int ProbabilidadDeAsistencia = Metodos.generarNumerosAleatorios(0, 100);
		if (ProbabilidadDeAsistencia < 20 ) {
			super.setAsistencia(false);
			
		}else {
			super.setAsistencia(true);
		}
	}
}

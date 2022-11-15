package clasepractica;

public class Aula {

	private int ID;
	private final int MaxEstudiantes = 20;
	private String asignatura;
	private Profesor profesor;
	private Estudiantes[] estudiantes;
	
	
	public Aula() {
		this.ID= 1;
		this.profesor= new Profesor();
		this.estudiantes= new Estudiantes[MaxEstudiantes];
		this.asignatura= Asignatura.ASIGNATURAS[Metodos.generarNumerosAleatorios(0, 2)];
		GenerarEstudiantes();
	}
	private void GenerarEstudiantes() {
		for (int i = 0; i < estudiantes.length; i++) {
			 estudiantes[i] = new Estudiantes();
			
		}
	}
	private boolean ContarAsistenciaAlumnos() {
		int contador = 0;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i].isAsistencia()) {
				contador++;
			}
		}
		System.out.println("La Asistencia es de: " + contador+ " Estudiantes.");
		return (contador >= (int)(MaxEstudiantes/2));
			
	}
	public boolean ImpartirClase() {
		if (!profesor.isAsistencia()) {
			System.out.println("El profesor no asistio, No hay Clase!");
			return false;
		
		}else if(!profesor.getAsignatura().equals(asignatura)) {
			System.out.println("La Asinatura del aula no coincide con la del profesor, No hay Clase!");
			return false;
		}else if(!ContarAsistenciaAlumnos()) {
			System.out.println("No hay suficientes alumnos, No hay Clase!");
			return false;
		}else {
			System.out.println("Si Se Puede Impartir Clase");
			return true;
		}
		
	}
	public void MostrarNotasAprobados() {
		int ContadorAlumnosAprobados = 0, ContadorAlumnasAprobadas= 0;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i].getCalificacion()>= 6 ) {
				if (estudiantes[i].getSexo()=='M') {
					ContadorAlumnosAprobados++;
					
				}else {
					ContadorAlumnasAprobadas++;
				}
			   System.out.println(estudiantes[i].MostrarInfoEstudiantes());
			}
		}
		System.out.println("Hay " + ContadorAlumnosAprobados+" Alumnos aprobados y hay " + ContadorAlumnasAprobadas +" Alumnas Aprobadas" );
	}

}

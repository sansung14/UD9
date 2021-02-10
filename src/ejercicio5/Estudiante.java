package ejercicio5;

public class Estudiante extends Persona {

	private int calificacion;
	private final int CALIFICACION_DEF= 0;
	private final boolean FALTA_DEF= false;
	private boolean falta;

	public Estudiante(String nombre, int edad, char sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
		this.falta=FALTA_DEF;
		comprobarCalificacion();
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public void comprobarCalificacion() {
		if(this.calificacion>10 || this.calificacion<0) {
			this.calificacion=CALIFICACION_DEF;
		}
	}
	
	
	
	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}

	
	@Override
	public String toString() {
		return super.toString()+
				"Calificación: "+ calificacion +"\n";
	}
	
}

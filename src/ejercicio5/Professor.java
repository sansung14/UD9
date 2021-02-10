package ejercicio5;

public class Professor extends Persona {
	private String materia;
	private final String MATERIA_DEF = "matematicas";
	private final boolean FALTA_DEF= false;
	private boolean falta;

	public Professor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		this.falta=FALTA_DEF;
		comprobarMateria();
	}

	private void comprobarMateria() {
		if(!this.materia.equals("matematicas") && !this.materia.equals("filosofia") && !this.materia.equals("fisica")) {
			this.materia=MATERIA_DEF;
		}
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	
	@Override
	public String toString() {
		return "Professor: "+super.getNombre()+"\nMateria: "+ materia+"\n";
	}
	
	public boolean compareTo(Object o){
		return this.materia.equals(o);
		
	}
}

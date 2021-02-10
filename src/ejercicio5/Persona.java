package ejercicio5;

public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	private final char SEXO_DEF='H';

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		comprobarSexo();
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void comprobarSexo(){
		if (this.sexo != 'H' && this.sexo != 'M') {

            this.sexo = SEXO_DEF;

        }
    }
	
	
	public String toString() {

        String sexo;

        if (this.sexo == 'H') {

            sexo = "Hombre";

        } else {

            sexo = "Mujer";

        }

        return "Alumno:\n"

                + "Nombre: " + nombre + "\n";

    }
}

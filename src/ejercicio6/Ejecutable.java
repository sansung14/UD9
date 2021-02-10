package ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author David Lascorz
 *
 */
public class Ejecutable {


	public static void main(String[] args) {
		final String[] ASIENTOS = crearAsientos();
		int contar = 0;

		Sala[] peliculas = new Sala[3];
		Espectador[] espectadores = new Espectador[3];

		peliculas[0] = new Sala("Osmosis", 120, 13, "Paquito", 23);
		peliculas[1] = new Sala("Don quijote", 160, 18, "Sancho", 23);
		peliculas[2] = new Sala("La llorona", 100, 18, "maldita", 28);

		espectadores[0] = new Espectador("Fina", 23, 23.80);
		espectadores[1] = new Espectador("Lola", 16, 20.00);
		espectadores[2] = new Espectador("Paco", 18, 55.20);

		ArrayList<Integer> aleatorio = generarAleatoriosNoRepetidos(espectadores.length);

		Random ra = new Random();
		int numero = ra.nextInt(peliculas.length);
		
		System.out.println(peliculas[numero]);
		
		for (int i = 0; i < espectadores.length; i++) {
			if (espectadores[i].getEdad() >= peliculas[i].getEdad()
					&& espectadores[i].getDinero() >= peliculas[numero].getPrecio()) {
				espectadores[i].setAsiento(ASIENTOS[aleatorio.get(i)]);
				contar++;
			}
		}

		String lista[] = new String[contar + 1];

		contar = 0;

		for (int i = 0; i < espectadores.length; i++) {
			if (!espectadores[i].getAsiento().equals("")) {
				lista[contar] = (espectadores[i].getAsiento());
				contar++;
			}
		}

		for (int i = 0; i < 71; i++) {
			for (int x = 0; x < contar; x++) {
				ASIENTOS[i] = ASIENTOS[i].replace(lista[x], "[]");
			}
		}
		
		contar=0;
		for (int i = 0; i < 8; i++) {
			for (int x = 0; x < 9; x++) {
				System.out.print(ASIENTOS[contar]+" ");
				contar++;
			}
			System.out.println("");

		}

		
		System.out.println("\nAsientos cogidos: "+(lista.length-1));

	}
	

	
	
	
	

	private static String[] crearAsientos() {
		String[] asent = new String[72];
		String[] lista = new String[72];
		int contar = 0;
		int contador = 0;

		for (int i = 0; i < 8; i++) {
			for (int x = 0; x < 9; x++) {
				asent[contar] = (i + 1 + "" + ((char) (73 - x)));
				contar++;
			}
		}
		contar--;
		while (contar != -1) {
			lista[contador] = asent[contar];
			contar--;
			contador++;
		}
		return lista;
	}

	public static ArrayList<Integer> generarAleatoriosNoRepetidos(int cantidad) {
		ArrayList<Integer> respuesta = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			respuesta.add(gen(respuesta));
		}
		return respuesta;
	}

	public static int gen(ArrayList<Integer> a) {
		Random ra = new Random();
		int numero = ra.nextInt(72);
		if (!a.contains(numero)) {
			return numero;
		} else {
			return gen(a);
		}
	}

}

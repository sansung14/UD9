package ejercicio2;

public class ejecutable {

	public static void main(String[] args) {
		Serie[] series= new Serie[5];
		Videojuego[] videojuegos= new Videojuego[5];
		
		series[0]=new Serie("WestWorld","Jonathan Nolan i Lisa Joy");
		series[1]=new Serie("Game of thrones","D. B. Weiss",8,"Aventuras, fantasia y drama");
		series[2]=new Serie("La Casa de Papel"," Álex Pina");
		series[3]=new Serie("Big Mouth","Nick Kroll",4,"fantasia");
		series[4]=new Serie("Shingeki no Kyojin","Hajime Isayama");
		
		videojuegos[0]=new Videojuego("Assassins creed",43,"Aventura","Ubisoft");
		videojuegos[1]=new Videojuego("Ciberpunk 2077",45,"Aventura","CD Project");
		videojuegos[2]=new Videojuego("Call of Dutty",28,"Accion","Infinity ward");
		videojuegos[3]=new Videojuego("Pokemon",20,"Aventura","Nintendo");
		videojuegos[4]=new Videojuego("Digimon",15,"Aventura","Digital Monsters");

		
		series[0].entregar();
		series[2].entregar();
		series[3].entregar();

		videojuegos[2].entregar();
		videojuegos[4].entregar();

		

		int contarS=0;
		int contarV=0;
		for (Serie e : series) {
			if(e.isEntregado()==true) {
				contarS++;
				e.devolver();
			}

		}
		
		for (Videojuego e : videojuegos) {
			if(e.isEntregado()==true) {
				contarV++;
				e.devolver();
			}

			
		}
		
		System.out.println("######################################");
		System.out.println("Hay "+contarS+" series entregadas");
		System.out.println("Hay "+contarV+" videojuegos entregados");
		System.out.println("######################################");

		Serie z1 = series[0];
		for (Serie e : series) {
			if(z1.compareTo(e.n_temporadas)) {
				z1=e;
			}
		}
		
		
		System.out.println("La Serie con mas temporadas es: ");

		System.out.println(z1.toString());

		Videojuego x1 = videojuegos[0];
		for (Videojuego e : videojuegos) {
			if(x1.compareTo(e.horas)) {
				x1=e;
			}
		}
		
		System.out.println("######################################");

		System.out.println("El Videojuego con mas horas es: ");

		System.out.println(x1.toString());
	}

}

package ejercicio4;

import java.util.Scanner;

public class Raices {
	private static double a;
	private static double b;
	private static double c;
	
	public static void obtenerRaices() {
		double resultado1=(-b-(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
		double resultado2=(-b+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
		System.out.println("Posibles soluciones:");

		System.out.println("La primera solución: "+ resultado1);
		System.out.println("La segunda solución: "+ resultado2);

		
	}
	
	public static void obtenerRaiz() {
		double resultado1=(-b-(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
		System.out.println("Posible solución:");

		System.out.println("Unica solución: "+ resultado1);

	}
	
	public static double getDiscriminante() {
		double resultado=(Math.pow(b,2))-(4*a*c);
		return resultado;
		
	}
	
	public static boolean tieneRaices() {
		if(getDiscriminante()>=0) {
			return true;
		}
		return false;
		
	}
	
	public static boolean tieneRaiz() {
		if(getDiscriminante()==0) {
			return true;
		}
		return false;
		
	}
	
	public static void calcular() {
		if(tieneRaiz()) {
			obtenerRaiz();
		}else if(tieneRaices()) {
			obtenerRaices();
		}else {
			System.out.println("No tiene solución");
		}
		
		
	}
	
	
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el valor de 'a':");
		double option1 = teclado.nextDouble();
		System.out.println("Introduce el valor de 'b':");
		double option2 = teclado.nextDouble();
		System.out.println("Introduce el valor de 'c':");
		double option3 = teclado.nextDouble();
		Raices c1 = new Raices(option1,option2,option3);

		c1.calcular();
	}
	
	
}

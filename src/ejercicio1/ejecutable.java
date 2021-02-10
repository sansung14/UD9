package ejercicio1;
import java.text.DecimalFormat;

public class ejecutable {

	public static void main(String[] args) {
		
		DecimalFormat formato1 = new DecimalFormat("#.00");
		double total=0;
		Electrodomestico Electrodomesticos[]=new Electrodomestico[10];
		
		Electrodomesticos[0]=new Lavadora("blanco",'A',100.00,29,32);
		Electrodomesticos[1]=new Television("blanco",'A',100.00,30,41,false);
		Electrodomesticos[2]=new Lavadora("Rojo",'F',520.00,7,15);
		Electrodomesticos[3]=new Television("azul",'E',85.00,40,65,true);
		Electrodomesticos[4]=new Television("Negro",'C',150.00,20,30,true);
		Electrodomesticos[5]=new Lavadora("Gris",'B',650.00,7,80);
		Electrodomesticos[6]=new Electrodomestico("Rojo",'E',250,27);
		Electrodomesticos[7]=new Electrodomestico("Blanco",'F',150,35);
		Electrodomesticos[8]=new Electrodomestico("Rojo",'C',350,70);
		Electrodomesticos[9]=new Electrodomestico("azul",'A',550,84);

		Electrodomestico e1;
		Lavadora l1;
        Television t1;
		System.out.println("######################");
		System.out.println("Precio Lavadoras:");

		
        for (Electrodomestico e : Electrodomesticos) {
         
            if(e instanceof Lavadora){
                l1 = (Lavadora)e;
        		System.out.println(formato1.format(l1.precioFinal())+" €");

                l1.precioFinal();
            }

        }
        
		System.out.println("######################");
		System.out.println("Precio Televisores:");

        for (Electrodomestico e : Electrodomesticos) {
            

            if(e instanceof Television){
                t1 = (Television)e;
        		System.out.println(formato1.format(t1.precioFinal())+" €");
            }

        }
        
		System.out.println("######################");
		System.out.println("Precios Electrodomesticos:");

		for (Electrodomestico e : Electrodomesticos) {
	         

            if(e instanceof Electrodomestico){
                e1 = (Electrodomestico)e;
        		if(e1.getClass().getSimpleName().equals("Electrodomestico")) {
            		System.out.println(formato1.format(e1.precioFinal())+" €");

        		}
        		total=total+e1.precioFinal();
            }
        }
		System.out.println("######################");
		System.out.println("Total Electrodomesticos: "+formato1.format(total)+" €");

		
		
	}

}

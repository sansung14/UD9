package ejercicio5;

import java.util.Random;

public class ejecutable {

	public static void main(String[] args) {
		
		int t_alum=0;
		int p_alum=0;
		boolean profe=false;
		boolean alumnos=false;
		int chicos=0;
		int chicas=0;
		
		Persona personas[]=new Persona[12];
		aula aulas[]=new aula[4];
		
		
		
		
		personas[0]=new Estudiante("Lucia",28,'M',8);
		personas[1]=new Estudiante("David",23,'H',7);
		personas[2]=new Estudiante("Lopez",23,'H',7);
		personas[3]=new Estudiante("Alfonso",28,'H',8);
		personas[4]=new Estudiante("Luis",23,'H',7);
		personas[5]=new Estudiante("Manuela",23,'M',3);
		personas[6]=new Estudiante("Antonia",28,'M',8);
		personas[7]=new Estudiante("Federico",23,'H',2);
		personas[8]=new Estudiante("Roberto",23,'H',4);

		personas[9]=new Professor("Carlos",31,'H',"matematicas");
		personas[10]=new Professor("Victor",41,'H',"filosofia");
		personas[11]=new Professor("Antonio",44,'H',"fisica");


		aulas[0]=new aula(1,9,"matematicas");
		

		

		Estudiante l1;
		Professor p1;
		
        for (Persona e : personas) {
         
            if(e instanceof Estudiante){
                l1 = (Estudiante)e;
                Random r = new Random();
                int random = r.nextInt(2);
                if(random==1) {
                    ((Estudiante) e).setFalta(false);

                }else{
                    ((Estudiante) e).setFalta(true);

                }
            }
            
            if(e instanceof Professor){
                p1 = (Professor)e;
                Random r = new Random();
                int random = r.nextInt(5);
                if(random==1) {
                    ((Professor) e).setFalta(false);

                }else{
                    ((Professor) e).setFalta(true);

                }
            }

        }
		
        
        
        
        for (Persona e : personas) {
            if(e instanceof Professor){
                p1 = (Professor)e;
                if(p1.compareTo(aulas[0].getDestino()) && !p1.isFalta()) {
                	profe=true;
                }

            }
            
            if(e instanceof Estudiante){
                l1 = (Estudiante)e;
                p_alum++;
                if(l1.isFalta()) {
                	t_alum++;
                }

            }
        }
        
        if((p_alum/2)>t_alum) {
        	alumnos=true;        
        }
        
        if(profe && alumnos && aulas[0].getN_maximo()>t_alum) {
        	System.out.println(aulas[0]);
        	for (Persona e : personas) {
                if(e instanceof Professor){
                    p1 = (Professor)e;
                    if(p1.compareTo(aulas[0].getDestino())) {
                    	System.out.println(p1.toString());
                    }

                }
            }
        	
        	for (Persona e : personas) {                
                if(e instanceof Estudiante){
                    l1 = (Estudiante)e;
                    if(!l1.isFalta() && l1.getCalificacion()>4 && l1.getSexo()=='H') {
                    	chicos++;
                    }else if(!l1.isFalta() && l1.getCalificacion()>4 && l1.getSexo()=='M') {
                    	chicas++;
                    }
              

                }
            }
        	System.out.println("Alumnos aprobados: "+chicos);
            System.out.println("Alumnas aprobados: "+chicas);
        }else {
            System.out.println("No se puede hacer clase");

        }
       



        //System.out.println(personas[0]);
		//System.out.println(personas[1]);
		//System.out.println(personas[2]);
		//System.out.println(personas[3]);

		
		
	}
	
	
	
	

}

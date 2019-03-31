import videojuego.*;
/**
	Nombre: UsoVideojuego.class
	Descripcion: clase usada para testar la clase Videojuego y sus hijos.
	@author Antonio Martinez
	@version 0.1


*/

public class UsoVideojuego{
	


	public static void main(String[] args) {
		
		Videojuego[] juegos = new Videojuego[7];

		juegos[0] =new Videojuego("Mario", 5, "Plataformas","Nintendo",true);
		juegos[1] = new JuegoArcade("Ghosts 'n Goblins", 4,"Plataformas","Capcom",true,0.30);
		juegos[2] = new Juego_Consola();
		juegos[3] = new Juego_Consola_Online("Call of duty",7,"shooter","Activition",true,"Switch",10);
		juegos[4] = new Videojuego();
		juegos[5] = new JuegoArcade("Ghosts 'n Goblins", 4,"Plataformas","Capcom",true,0.30);
		juegos[6] =new Videojuego("Mario", 5, "Plataformas","Nintendo",true);






		

		System.out.println("\nArcade:");
		listaVideojuegos(juegos, new JuegoArcade());

		System.out.println("\nJuego_Consola:");
		listaVideojuegos(juegos, new Juego_Consola());


		System.out.println("\nJuego_Consola_Online:");
		listaVideojuegos(juegos, new Juego_Consola_Online());

		System.out.println("\nTodos:");
		listaVideojuegos(juegos, new Videojuego());




		System.out.println("\n");
		comparaVideojuegos(juegos);






	}		
		/**
		 Metodo que lista un array de Videojuegos comparado cada elemento del array con
		 la clase de otro objeto que recive como parametro para filtra los que no sean del
		 mismo tipo.
		 @author Antonio Martinez
		 @param v array que sera listado
		 @param nombreclase objeto del que se obtendra la clase para compararlo con los elementos del array.

		*/
		static void listaVideojuegos(Videojuego [] v , Videojuego nombreclase){

		

			for (int i =0 ;i<v.length ;i++ ) {

				if( nombreclase.getClass().isInstance(v[i]) ){

					System.out.println((i+1)+": "+v[i]);

				}
				
			}


		}
		
		/**
			Compara todos los elementos de un array videojuegos entre si para ver si son iguales
			usando el metodo equals.
			@author Antonio Martinez
			@param v array de videojuegos que se usa para comparar todos los elementos entre si.


		*/
		static void comparaVideojuegos(Videojuego[] v){
			for(int i = 0; i<v.length; i++){

				for(int j = 0; j<v.length; j++){

					 if(i!=j){	
						if( v[i].equals(v[j])){
							System.out.println((i+1)+": "+v[i].getTitulo()+" es igual a: "+(j+1)+": "+v[j].getTitulo());
						}else{
							System.out.println((i+1)+": "+v[i].getTitulo()+" no es igual a: "+(j+1)+": "+v[j].getTitulo());
						}

					}



				}
				System.out.println("\n");
			}

		}








}
package videojuego;


	/**
	*
	* nombre: Juego_Consola_Online.class
	* Descripcion: Permite crear objetos de tipo Juego_Consola_Online. 
	* autor: Antonio Martinez
	* Version: 0.1
	*
	*/
public class Juego_Consola_Online extends Juego_Consola{
		private static final double PRECIOSERVICIO = 1;
		private double precioservicio;

		//constructores
		public Juego_Consola_Online(String titulo, int duracion, String genero, 
									String compania,boolean entregado,
									String consola, double precioservicio){
			
			super(titulo,duracion,genero,compania,entregado,consola);
		
			this.precioservicio = precioservicio;


		}

		public Juego_Consola_Online(){
			this(DEFTITULO,DEFDURACION,DEFGENERO, DEFCOMPANIA, DEFENTREGADO,CONSOLA, PRECIOSERVICIO);
		}


		@Override
		public String toString(){

			return super.toString()+" \n "+this.precioservicio;



		}

		//getter
		public double getPrecioservicio(){
			return this.precioservicio;
		}

		//setter
		public void setPrecioservicio(double precioservicio){
			this.precioservicio = precioservicio;
		}


		@Override
		public boolean equals(Object Obj){
			 boolean igual = false;
			if(Obj  instanceof Juego_Consola_Online && super.equals(Obj)){

				Juego_Consola_Online tmp = (Juego_Consola_Online)Obj;

				if(tmp.getPrecioservicio() ==  tmp.getPrecioservicio() ){
					igual = true;

				}



			}
			return igual;

		}














}
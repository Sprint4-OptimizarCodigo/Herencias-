package videojuego;
	/**
	*
	* nombre: Juego_Consola.class
	* Descripcion: Permite crear objetos de tipo Juego_Consola. 
	* @author: Antonio Martinez
	* @version: 0.1
	*
	*/
public class Juego_Consola extends Videojuego {
	protected final static String [] consolasDisponibles = {"Switch", "Xbox", "PlayStation"};
	protected final static String[] CONSOLADEF = {"PlayStation"};
	protected String[] consolas;
		
		public Juego_Consola(String titulo, int duracion, String genero, String compania,boolean entregado,String[] consolas){
			super(titulo,  duracion,  genero, compania, entregado);
			this.consolas=consolas;
		    this.setConsola(consolas);

		}
		public Juego_Consola(){
			this(DEFTITULO,DEFDURACION,DEFGENERO, DEFCOMPANIA, DEFENTREGADO,CONSOLADEF);
		}

		
		public void setConsola(String[] consolas){
			if(compruebaConsola(consolas)){
				
			}
		}

		public String getConsolas(){
			return this.consolas;
		}		
		/**
		Comprueva si el nombre de la consola es valido comprobando el nombre
		de la consola en un array de string.
		 @author Antonio Martines
		 @param consola nombre de la consola a validar.	
		 @return devuleve true si es valida
		*/
		private boolean compruebaConsola(String[] consolas){

		}

		@Override
		public boolean equals(Object obj){
			boolean valida = false;
			if(obj instanceof Juego_Consola){
				if(super.equals(Obj)){
					Juego_Consola tmp =(Juego_Consola) Obj;
					if(tmp.getConsola().equals(tmp.getConsola())){
						valida = true;
					}
				}
			}
			return valida;
		} 


		@Override
		public String toString(){
			return super.toString()+"\n consola: "+this.getConsola();
		}



















}
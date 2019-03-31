package videojuego;
	/**
	*
	* nombre: JuegoArcade.class
	* Descripcion: Permite crear objetos de tipo JuegoArcade. 
	* @author: Antonio Martinez
	* @version: 0.1
	*
	*/

public class JuegoArcade extends Videojuego{
	/**
		 DEFPRECIOPARTIDA precio de la partida por defecto
	*/
	private static final double DEFPRECIOPARTIDA =0.25;
	/**
		variable de clase que almacena el precio de la partida
	*/
	private double preciopartida;


	//constructores
	public JuegoArcade(){
		this(DEFTITULO,DEFDURACION,DEFGENERO, DEFCOMPANIA, DEFENTREGADO,DEFPRECIOPARTIDA);
	}


	public JuegoArcade(String titulo, int duracion, String genero, String compania,boolean entregado, double preciopartida){
		super(titulo,duracion,genero,compania,entregado);
		/*
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.compania = compania;
		this.entregado = entregado;
		*/
		this.preciopartida = preciopartida;
	}

	//getter
	public double getPreciopartida(){
		return this.preciopartida;
	}
	//setter
	public void setPreciopartida(int preciopartida){
		this.preciopartida = preciopartida;
	}


	@Override
	public String toString(){
		return super.toString()+"\n Precio por partida "+this.preciopartida;
		/*
		return "\n Titulo: "+this.titulo+
		"\n duracion: "+this.duracion+" hora/s "+
		"\n compania "+this.compania+
		"\n genero "+this.genero +"\n entregado "+
		this.entregado+
		"\n Precio por partida "+this.preciopartida;;
		*/
	}

	@Override
	public boolean equals(Object obj){
		boolean igual = false;
		if(obj instanceof JuegoArcade){
			if(super.equals(obj)){
				JuegoArcade tmp = (JuegoArcade) obj;
				if(tmp.getPreciopartida() == this.preciopartida){
					igual = true;
				}
			}
		}
		return igual;
	}
}
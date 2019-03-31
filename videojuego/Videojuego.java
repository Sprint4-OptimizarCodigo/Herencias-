package videojuego;
/**
	* nombre: Videojuego.class
	* Descripcion: permite crear objetos tipo videojuego que contiene informacion del mismo.
	* @author: Antonio Martinez
	* @version: 0.1
*/
public class Videojuego{
	//constantes de los atributos
	protected final static String DEFTITULO = new String("Anonimo");
	protected final static int DEFDURACION=10;
	protected final static boolean DEFENTREGADO = false;
	protected final static String DEFGENERO= new String("desconocido");
	protected final static String DEFCOMPANIA = new String("desconocido");

	//atributos
	protected String titulo;
	protected int duracion;
	protected String genero;
	protected String compania;
	protected boolean entregado;

	//constructores
	public Videojuego(String titulo, int duracion, String genero, String compania,boolean entregado){
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.compania = compania;
		this.entregado = entregado;
	}

	public Videojuego(){
		this(DEFTITULO,DEFDURACION,DEFGENERO, DEFCOMPANIA, DEFENTREGADO);
	}

	public Videojuego(String titulo, int duracion){
		this(titulo,duracion,DEFGENERO, DEFCOMPANIA, DEFENTREGADO);
	}

	//getters
	public String getTitulo(){
		return this.titulo;
	}
	public int getDuracion(){
		return this.duracion;
	}	
	public String getCompania(){
		return this.compania;
	}	
	public String getGenero(){
		return this.genero;
	}	

	//setters
	public void setDuracion (int duracion){
		this.duracion = duracion;
	}	
	public void setTitulo (String titulo){
		this.titulo = titulo;
	}	
	public void setCompania (String compania){
		this.compania = compania;
	}	
	public void setGenero (String genero){
		this.genero = genero;
	}	

	//metodos sobreescritos
    @Override
	public String toString(){
		return "\n Titulo: "+this.titulo+
		"\n duracion: "+this.duracion+" hora/s "+
		"\n compania "+this.compania+
		"\n genero "+this.genero +"\n entregado "+
		this.entregado;
	}

	@Override
	public boolean equals(Object Obj){
		boolean igual = false;
		if( Obj instanceof Videojuego){
			Videojuego tmp = (Videojuego) Obj;
			if(    this.titulo.equals(tmp.getTitulo())&&
				   this.genero.equals(tmp.getGenero())&&
				   this.duracion== tmp.getDuracion()&&       
				   this.compania.equals(tmp.getCompania() )){
				igual = true;
			}
		}
		return igual;
	}
}
package daniel.torres.examen;

public class Carta {

	private String nombre;
	private Plato [] platos;
	private Bebida [] bebidas;
	
	
	public Carta(String nombre, Plato[] platos, Bebida[] bebidas) {
	
		this.nombre = nombre;
		this.platos = platos;
		this.bebidas = bebidas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Plato[] getPlatos() {
		return platos;
	}


	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}


	public Bebida[] getBebidas() {
		return bebidas;
	}


	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	

}

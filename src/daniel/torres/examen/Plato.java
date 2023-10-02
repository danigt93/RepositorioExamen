package daniel.torres.examen;

public class Plato {

	private String nombre;
	private double precio;
	private boolean disponible;
	
	
	public Plato(String nombre, double precio, boolean disponible) {
	
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	public void platoDisponible(Plato platos) {
		boolean disponible;
		do {
		for (int i = 0; true ; i++) {
	
		}
		}while(disponible == true);
		
	}



	

}

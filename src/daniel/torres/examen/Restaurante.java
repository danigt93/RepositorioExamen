package daniel.torres.examen;

import java.util.Scanner;

public class Restaurante {


	private String nombre;
	
	

	

	public Restaurante(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String usuario = scan.nextLine();
		
		Restaurante restaurante = new Restaurante("Restaurante CFTIC");
		restaurante.abrirRestaurante();
		
		//Creamos los platos, las bebidas y 2 cartas 
		Plato p1 = new Plato("Filete empanao con patatas", 7.50, true);
		Plato p2 = new Plato("Papas arrugas y mojo picón", 4.50, true);
		Plato p3 = new Plato("Sopa de picadillo", 5.40, true);
		Plato p4 = new Plato("Arroz a la cubana con huevo frito", 4.50, true);
		Plato p5 = new Plato("Solomillo al wisky", 7.50, false);
		
		Plato [] platosCarta1 = {p1,p2,p3};
		Plato [] platosCarta2 = {p4,p5};
		
		
		
		Bebida b1 = new Bebida("Fanta de Naranja", 2.50);
		Bebida b2 = new Bebida("Agua", 2.10);
		
		Bebida [] bebidasCarta1 = {b1};
		Bebida [] bebidasCarta2 = {b2};
		
		
		Carta c1 = new Carta("Menu del día", platosCarta1, bebidasCarta1);
		Carta c2 = new Carta("Fuera de carta", platosCarta2, bebidasCarta2);
		
		Carta [] cartaRestaurante = {c1,c2};
		
		usuario.pedir();
	}
	
	public void abrirRestaurante() {
		
	}
	
	public void pedir() {
		Scanner scan = new Scanner(System.in);
		String cliente = scan.nextLine();
		
		System.out.println("Buenas " + cliente + " que desea pedir?");
		
	}
	
	public void mostrarCarta(Carta [] cartas, Plato [] platos) {
		
		System.out.println(getNombre());
		for (Carta carta : cartas) {
			for (Plato plato : platos) {
				
				}
			}	
		}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
	
	

	
				
				
				
		
	


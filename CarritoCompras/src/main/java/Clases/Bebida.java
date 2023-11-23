package Clases;
public class Bebida {
	private String nombre="";
	private String marca="";
	private double capacidad=0; 

	public Bebida(String nombre, String marca, double capacidad){
		this.nombre=nombre;
		this.marca=marca;
		this.capacidad=capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
}

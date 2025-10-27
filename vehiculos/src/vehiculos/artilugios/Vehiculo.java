package vehiculos.artilugios;

public abstract class Vehiculo {
	
	protected final int peso, capacidad, velocidadMaxima;

	public Vehiculo(int peso, int capacidad, int velocidadMaxima) {
		this.peso=peso;
		this.capacidad=capacidad;
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public abstract void recorrer(int metros);
	
}

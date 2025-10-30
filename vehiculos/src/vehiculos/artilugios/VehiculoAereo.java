package vehiculos.artilugios;

public abstract class VehiculoAereo extends Vehiculo {
	
	protected final int alturaMaxima;
	
	public VehiculoAereo(int peso, int capacidad, int velocidadMaxima, int alturaMaxima) {
		super(peso, capacidad, velocidadMaxima);
		this.alturaMaxima=alturaMaxima;
	}
	
	

}

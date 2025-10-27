package vehiculos.artilugios;

public abstract class VehiculoTerrestre extends Vehiculo {

	protected final int numeroRuedas;
	
	public VehiculoTerrestre(int peso, int capacidad, int velocidadMaxima, int numeroRuedas) {
		super(peso, capacidad, velocidadMaxima);
		this.numeroRuedas=numeroRuedas;
	}
}

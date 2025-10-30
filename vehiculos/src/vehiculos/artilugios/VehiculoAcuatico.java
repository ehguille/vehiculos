package vehiculos.artilugios;

public abstract class VehiculoAcuatico extends Vehiculo {

	protected final boolean esSumergible;

	public VehiculoAcuatico(int peso, int capacidad, int velocidadMaxima, boolean esSumergible) {
		super(peso, capacidad, velocidadMaxima);
		this.esSumergible = esSumergible;
	}

}

package vehiculos.artilugios;

public abstract class Coche extends VehiculoTerrestre {

	public Coche(int peso, int capacidad, int velocidadMaxima) {
		//Todos los coches tienen 4 ruedas
		super(peso, capacidad, velocidadMaxima, 4);
	}

}

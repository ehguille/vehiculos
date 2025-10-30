package vehiculos.artilugios;

public class Bicicleta extends VehiculoTerrestre implements ImpulsoHumano {

	public Bicicleta(int peso, int velocidadMaxima) {
		super(peso, 1, velocidadMaxima, 2);
	}

	public void recorrer(int km) {
		this.arrancar();
		this.girarPedales();
		this.detenerse();
		System.out.println("Una bicicleta recorre " + km + " kilómetros.");
	}

	public void girarPedales() {
		System.out.println("Los pedales de una bicicleta giran.");
	}

}

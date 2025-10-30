package vehiculos.artilugios;

public abstract class Vehiculo {

	protected final int peso, capacidad, velocidadMaxima;
	protected boolean enMovimiento;
	

	public Vehiculo(int peso, int capacidad, int velocidadMaxima) {
		this.peso = peso;
		this.capacidad = capacidad;
		this.velocidadMaxima = velocidadMaxima;
		this.enMovimiento = false;
	}

	public abstract void recorrer(int metros);

	public void arrancar() {
		this.enMovimiento = true;
		
	}

	public void detenerse() {
		this.enMovimiento = false;
	}

}

package vehiculos.artilugios;

public class BicicletaElectrica extends Bicicleta implements MotorElectrico, ImpulsoHumano {

	public BicicletaElectrica(int peso, int velocidadMaxima) {
		super(peso, velocidadMaxima);
	}
	
	@Override
	public void recargar() {
		System.out.println("Una bicicleta eléctrica se recarga");
	}
	
	@Override
	public void recorrer(int km) {
		System.out.println("Funciona el motor eléctrico.");
		super.recorrer(km);
		System.out.println("El motor eléctrico deja de funcionar.");
	}
	
}

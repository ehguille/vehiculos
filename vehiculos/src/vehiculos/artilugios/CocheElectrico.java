package vehiculos.artilugios;

public class CocheElectrico extends VehiculoTerrestre implements MotorElectrico {

	public CocheElectrico(int peso, int capacidad) {
		//Todos los coches eléctricos tienen una velocidad máxima de 120
		//y cuatro ruedas.
		super(peso, capacidad, 120, 4);
	}

	public void recargar() {
		System.out.println("Recargar un coche eléctrico.");
		
	}

	@Override
	public void recorrer(int metros) {
		// TODO Auto-generated method stub
		
	}

}

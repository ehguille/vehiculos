package vehiculos.artilugios;

public class CocheElectrico extends Coche implements MotorElectrico {

	public CocheElectrico(int peso, int capacidad) {
		// Todos los coches eléctricos tienen una velocidad máxima de 120.
		super(peso, capacidad, 120);
		// Suponemos que, cuando se crea un coche, no tiene batería, y esto genera un
		// error.
		System.out.println(Errores.e274);
	}

	public void recargar() {
		System.out.println("Recargar un coche eléctrico.");

	}

	@Override
	public void recorrer(int metros) {
		// TODO Auto-generated method stub

	}

}

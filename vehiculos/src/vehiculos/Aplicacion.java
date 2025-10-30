package vehiculos;

import vehiculos.artilugios.*;

public class Aplicacion {

	public Aplicacion() {
		BicicletaElectrica bc=new BicicletaElectrica(20,60);
		bc.recorrer(20);
	}

	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();

	}

}

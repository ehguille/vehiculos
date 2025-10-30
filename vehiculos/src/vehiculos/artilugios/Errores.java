package vehiculos.artilugios;

public abstract class Errores {
	
	/*
	 * public, porque cualquier clase puede acceder a los mensajes de error;
	 * final, porque no se modificará la cadena;
	 * static, porque no será necesario crear un objeto para acceder al atributo.
	 */
	public final static String e274="El vehículo no tiene batería";
	public final static String e307="Alguna rueda está pinchada";

}

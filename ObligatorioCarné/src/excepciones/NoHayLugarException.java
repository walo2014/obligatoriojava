package excepciones;

public class NoHayLugarException extends Exception{
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public NoHayLugarException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

}

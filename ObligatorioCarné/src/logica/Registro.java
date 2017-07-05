package logica;
import java.util.Calendar;
//Pendiente de programar
public abstract class Registro {
	private Calendar fecha;//verificar si es int??
	private String comentario;// debe ir en mayuscula es mas apropiado??
	
	//constructor
	public Registro(Calendar fecha, String comentario){//los nombres van completos x eso ponemos this son nombres muy cortos 
		this.fecha = fecha;
		this.comentario = comentario;

	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public abstract String mostrarRegistro();
}

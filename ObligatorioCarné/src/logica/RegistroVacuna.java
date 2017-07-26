package logica;

import java.io.Serializable;
import java.util.Calendar;

public class RegistroVacuna extends Registro implements Serializable {
	private Vacuna vacuna;
	public RegistroVacuna(Calendar fecha, String comentario,Vacuna vacuna) {
		super(fecha, comentario);
		this.vacuna=vacuna;
	}
	public Vacuna getVacuna() {
		return vacuna;
	}
	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}

	public String toString(){
		return "Tipo Registro : Vacunacion "+super.toString()+" Vacuna es "+vacuna.toString();
	}
}

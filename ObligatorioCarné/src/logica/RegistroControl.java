package logica;

import java.util.Calendar;

public class RegistroControl extends Registro {
	
	private double peso;
	private double altura;

	public RegistroControl(Calendar fecha, String comentario, double peso, double altura) {
		super(fecha, comentario);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String mostrarRegistro() {
		
		return super.mostrarRegistro()+" Peso : "+peso +" Altura : "+altura;
	}
}

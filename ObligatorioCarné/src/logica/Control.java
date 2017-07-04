package logica;

public class Control extends Registro {
	//Pendiente de programar por Luis
	private double peso;
	private double altura;
public Control (int fec, String com, double pes, double alt)	{
	super (fec, com);//herencia??
	this.peso=pes;
	this.altura=alt;
}
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
}

}

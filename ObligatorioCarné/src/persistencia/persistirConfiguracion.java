package persistencia;
//package persistenciafile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class persistirConfiguracion {
	
	public static void Main(String [] args){
		
		persistir(5, 3);
		
		
	}

	public static void persistir(int maxNiños, int maxRegistros)
	{
		 try {
				FileOutputStream fos = new FileOutputStream("c:/configuracion.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//oos.writeObject(coleccion);
				oos.close();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}

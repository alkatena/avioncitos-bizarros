package aviones.vista;

import aviones.modelo.Mapa;
import aviones.modelo.ScoreMax;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* Esta clase tiene algo de vista y algo de control, porque se encarga de mostrarse
 * y tmb trata archivos guardando y creando, se podria separar. Pero seria mas quilombo
 * lograr que apenas se supera el record se muestre..bueno nose que tan quilombo
 * pero asi funciona por ahora. Es un ejemplo de persistencia que podria refactorizarse
 * y quedar mucho mejor no? Pero como dijo algun profeta de Moises,"lo que funciona
 * no se toca" jajaja u algo asi..
 * 
 * cortesia de XP.
 */

public class VistaTextoScoreMax extends VistaTextoScore  
{	
		
		private ScoreMax scoreMax = ScoreMax.getScore();
		private boolean guardar = false;
		private boolean crearArchivo = false;
		
		public VistaTextoScoreMax() //throws FileNotFoundException
		{	
			// codigo BIEN villa;
			// Verifico si existe Archivo, sino existe lo creo
			try {
				InputStream fis = new FileInputStream("scoreMax.dat");
				fis.close(); //negrada
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				crearArchivo = true;
			
			}
			if (crearArchivo)
			{
				try {
				OutputStream fos = new FileOutputStream("scoreMax.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(scoreMax);
				oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}
		}
		
		// hardCore dimensiones mapa
		public int getX()
		{
			return  10;
		}
		
		public int getY()
		{
			return (Mapa.getMapa().getLimiteVer()-50);
		}
			
		public String getTexto() 
		{
			try {
				//abro el archivo con el score guardado
				InputStream fis = new FileInputStream("scoreMax.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ScoreMax scoreMaxAnterior = (ScoreMax)ois.readObject();
				// bandera para indicar si es necesario guardar los datos
				if ( scoreMaxAnterior.esMayorElPuntaje(score.devolverPuntaje()) )
				{
					guardar = true;
				}
				// actualizo con el score parcial
				scoreMaxAnterior.actualizarPuntaje(score.devolverPuntaje());
				// actualizo mi actual score maximo
				scoreMax.actualizarPuntaje(scoreMaxAnterior.devolverPuntaje());
		
				ois.close();
				
				this.guardarScoreMaximo(); // no deberia hacerse aca.
				
				return "Score Max: "+String.valueOf(scoreMax.devolverPuntaje());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			/* Algo teniamos que devolver, y ya que estamos si alguien te borra
			 * el archivo scoreMax.dat mientras el programa se ejecuta te avisa
			 */
			return "Se borraron los datos del scoreMax en tiempo de ejecucion," +
					"reinicie la aplicacion";
		}
		
	public void guardarScoreMaximo()
	{
		if (guardar) 
		{
			try {
				OutputStream fos = new FileOutputStream("scoreMax.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(scoreMax);
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

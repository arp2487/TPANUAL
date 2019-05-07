package factory;

import usal.edu.implementacion.RegistroProductoDAOimplArchivo;
import usal.edu.implementacion.RegistroProductoDAOimplBD;
import usal.edu.interfaces.RegistroProductoDAO;

public class Factory {
	public static RegistroProductoDAO getDAO(String source) {
		if(source.equals("archivo")) {
			return new RegistroProductoDAOimplArchivo();
		}else if(source.equals("bd")) {
			
			return new RegistroProductoDAOimplBD();
		}
		return null;
	}
}

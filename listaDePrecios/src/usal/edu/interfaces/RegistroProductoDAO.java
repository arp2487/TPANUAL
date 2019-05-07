package usal.edu.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import usal.edu.negocio.Producto;



public interface RegistroProductoDAO {
	public ArrayList<Producto> cagrgarLista()throws IOException;
	public void guardarLista(ArrayList<Producto> lista)throws IOException;
}

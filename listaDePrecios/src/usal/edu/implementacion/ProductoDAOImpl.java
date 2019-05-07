package usal.edu.implementacion;

import java.util.ArrayList;

import usal.edu.interfaces.ProductoDAO;
import usal.edu.negocio.Producto;
import usal.edu.util.IOGeneral;

public class ProductoDAOImpl implements ProductoDAO{

	
	public void add(Producto producto,ArrayList<Producto>lista) {
		lista.add(producto);
		
	}


	public void remove(Producto producto,ArrayList<Producto>lista) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equals(producto)) {
				lista.remove(i);
			}
		}
		
	}

	public void mod(String nombre, Producto producto,ArrayList<Producto>lista) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNombre().equals(nombre)) {
				lista.set(i, producto);
			}
		}
		
	}



	public Producto mostrarProducto(String nombre, ArrayList<Producto> lista) {
		int po = lista.size() + 1;
		for(int i = 0; i < lista.size();i++) {
			if(lista.get(i).getNombre() == nombre);
			po = i - 1;
		}
		
		return lista.get(po);
	}


	public void mostrarLista(ArrayList<Producto> lista) {
		for(int i = 0; i < lista.size(); i++) {
			IOGeneral.pritln("nombre: "+lista.get(i).getNombre()+"||"+
			"marca: "+lista.get(i).getMarca()+"||"+
			"precio: "+lista.get(i).getPrecio()+"||"+
			"tipo: "+ lista.get(i).getTipo());
		}
	}

}

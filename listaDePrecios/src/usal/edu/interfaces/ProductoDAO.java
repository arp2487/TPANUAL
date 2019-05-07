package usal.edu.interfaces;

import java.util.ArrayList;

import usal.edu.negocio.Producto;

public interface ProductoDAO {
	public void add(Producto producto,ArrayList<Producto>lista);
	public void remove(Producto producto,ArrayList<Producto>lista);
	public void mod(String nombre, Producto producto,ArrayList<Producto>lista);
	public Producto mostrarProducto(String nombre, ArrayList<Producto> lista);
	public void mostrarLista(ArrayList<Producto> lista);
	public boolean existeProducto(String nombre,ArrayList<Producto>lista);
}

package usal.edu.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import usal.edu.interfaces.RegistroProductoDAO;
import usal.edu.negocio.Producto;


public class RegistroProductoDAOimplArchivo implements RegistroProductoDAO{

	public ArrayList<Producto> cagrgarLista() throws IOException{
		String productos = "";
		String linea;
		ArrayList<Producto> lista = new ArrayList();
		
		File file = new File("precios.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((linea = br.readLine())!= null) {
			productos =  productos + linea +"-" ;
		}
		br.close();
		fr.close();
		
		String [] listalineas = productos.split("-");
		if(listalineas != null ) {
		for(int i = 0; i < listalineas.length;i++) {
			float precio = 0;
			String[] aux = listalineas[i].split(";");
			if(aux[0].isEmpty() == false) {
			Producto producto = new Producto();
			producto.setNombre(aux[0]);
			producto.setMarca(aux[1]);
			precio = Float.parseFloat(aux[2]);
			producto.setPrecio(precio);
			producto.setTipo(aux[3]);
			
			lista.add(producto);
			}
		}
		}
		
		return lista;
	}

	public void guardarLista(ArrayList<Producto> lista) throws IOException {
		File file = new File("precios.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		for(int i = 0; i < lista.size(); i++) {
		Producto pr = new Producto();
		pr.setNombre(lista.get(i).getNombre());
		pr.setMarca(lista.get(i).getMarca());
		pr.setPrecio(lista.get(i).getPrecio());
		pr.setTipo(lista.get(i).getTipo());
		pw.write(pr.getNombre()+";"+pr.getMarca()+";"+pr.getPrecio()+";"
				+pr.getTipo()+"\n");
		pw.flush();
		}
		pw.close();
		bw.close();
		fw.close();
	}

}

package usal.edu.ejecutar;

import java.io.IOException;
import java.util.ArrayList;

import factory.Factory;import usal.edu.implementacion.ProductoDAOImpl;
import usal.edu.interfaces.ProductoDAO;
import usal.edu.interfaces.RegistroProductoDAO;
import usal.edu.negocio.Producto;
import usal.edu.util.IOGeneral;

public class main {

	public static void main(String[] args) throws IOException {
		int op = 0;
		RegistroProductoDAO rpd = Factory.getDAO("archivo");
		ArrayList<Producto> lista = rpd.cagrgarLista();
		ProductoDAO prd = new ProductoDAOImpl();
		
		
		op = IOGeneral.leerInt("1)cargar producto\n"+"2) borrar producto\n"+"3) modificar\n"
				+"4) mostrar producto\n"+"5) mostrar lista\n"+"6) guardar y salir", "ingresar valor valido");
		
		while(op != 7) {
			if(op == 1) {
			ProductoDAO pd = new ProductoDAOImpl();
			Producto pr = new Producto();
			pr.setNombre(IOGeneral.leerFrase("ingresar nombre de producto "));
			pr.setMarca(IOGeneral.leerFrase("ingresar marca "));
			pr.setPrecio(IOGeneral.leerFloat("ingresar precio ", "valor no valido ingrese precio"));
			pr.setTipo(IOGeneral.leerFrase("ingresar tipo "));
			pd.add(pr, lista);
		}
		if(op == 2) {
			ProductoDAO pd = new ProductoDAOImpl();
			Producto pr = new Producto();
			pr.setNombre(IOGeneral.leerFrase("ingresar nombre de producto "));
			pr.setMarca(IOGeneral.leerFrase("ingresar marca "));
			pr.setPrecio(IOGeneral.leerFloat("ingresar precio ", "valor no valido ingrese precio"));
			pr.setTipo(IOGeneral.leerFrase("ingresar tipo "));
			pd.remove(pr, lista);
		}
		if(op == 3) {
			String nombre = IOGeneral.leerFrase("ingrese producto a modifica");
			ProductoDAO pd = new ProductoDAOImpl();
			Producto pr = new Producto();
			pr.setNombre(IOGeneral.leerFrase("ingresar nombre de producto "));
			pr.setMarca(IOGeneral.leerFrase("ingresar marca "));
			pr.setPrecio(IOGeneral.leerFloat("ingresar precio ", "valor no valido ingrese precio"));
			pr.setTipo(IOGeneral.leerFrase("ingresar tipo "));
			pd.mod(nombre, pr, lista);
		}
		if(op == 4) {
			String nombre = IOGeneral.leerFrase("ingrese producto a mostrar: ");
			ProductoDAO pd = new ProductoDAOImpl();
			pd.mostrarProducto(nombre, lista);
			IOGeneral.pritln("nombre: "+pd.mostrarProducto(nombre, lista).getNombre()+"||"+
			"marca: "+pd.mostrarProducto(nombre, lista).getMarca()+"||"+
			"precio: "+pd.mostrarProducto(nombre, lista).getPrecio()+"||"+
			"tipo: "+ pd.mostrarProducto(nombre, lista).getTipo());
			
		}
		if(op == 5) {
			prd.mostrarLista(lista);
		}
		if(op == 6) {
			rpd.guardarLista(lista);
			
		}
		op = IOGeneral.leerInt("1) cargar producto\n"+"2) borrar producto\n"+"3) modificar\n"
				+"4) mostrar producto\n"+"5) mostrar lista\n"+"6) guardar \n"+"7) salir", "ingresar valor valido");
		}
	}

}

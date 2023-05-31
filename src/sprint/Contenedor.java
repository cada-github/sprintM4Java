package sprint;

import java.util.ArrayList;

public class Contenedor {

	ArrayList<IAsesoria> listaIAsesoria = new ArrayList<>();
	ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();
	
	public void almacenarCliente(Cliente itemCliente) {
		listaIAsesoria.add(itemCliente);
	 }
	public void almacenarProfesional(Profesional itemProfesional) {
		listaIAsesoria.add(itemProfesional);
	 }

	public void almacenarAdministrativo(Administrativo itemAdministrativo) {
		listaIAsesoria.add(itemAdministrativo);
	 }
	public void almacenarCapacitacion(Capacitacion itemCapacitacion) {
		listaCapacitacion.add(itemCapacitacion);
	 }
	public void eliminarUsuario(int runUsuario) {
		for (int i = 0; i < listaIAsesoria.size(); i++) {
		//for (IAsesoria iasesoria: listaIAsesoria) {
			//if (iasesoria.obtieneRutUsuario()==runUsuario) {
			if (listaIAsesoria.get(i).obtieneRutUsuario()==runUsuario) {
				listaIAsesoria.remove(i);
				System.out.println("Usuario eliminado.");
				System.out.println("******************");
			}
		}
	}
	public void listarUsuarios() {
		for (IAsesoria iasesoria: listaIAsesoria) {
			System.out.println("Usuario: "+iasesoria.toString());
		}
	}
	public void listarUsuario(Usuario itemUsuario) {
		for (IAsesoria iasesoria: listaIAsesoria) {
			if (iasesoria.obtieneRutUsuario()==itemUsuario.getRunUsuario()) {
				System.out.println("Usuario: "+iasesoria.toString());
			}
		}
	}
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion: listaCapacitacion) {
			System.out.println("Capacitacion: "+capacitacion.toString());
		}
	}
}

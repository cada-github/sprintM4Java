package sprint;

import java.util.Calendar;


public class Usuario implements IAsesoria {
	
	// Variables de clase
	private String nombreUsuario; 
	private String fechaNacimientoUsuario;
	private int runUsuario;
	
	// Constructores
	public Usuario() {	}
	
	public Usuario(String nombreUsuario, String fechaNacimiento, int run) {
		this.setNombreUsuario(nombreUsuario);
		this.setFechaNacimientoUsuario(fechaNacimientoUsuario);
		this.setRunUsuario(run);
		
		this.nombreUsuario = this.getNombreUsuario();
		this.fechaNacimientoUsuario = this.getFechaNacimientoUsuario();
		this.runUsuario = this.getRunUsuario();
	}

	// Metedos de la clase
	public String mostrarEdad(String fechaNacimientoUsuario) {
		Calendar hoy = Calendar.getInstance();
		int anoActual=hoy.get(Calendar.YEAR);	 
		int anoNacimiento = Integer.parseInt(fechaNacimientoUsuario.substring(6));
		String edad = "El usuario tiene: " + (anoActual - anoNacimiento)+ " años";
		return edad; 
	} 
	
	
	//Metodos setters y getters
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		if (Validaciones.validaLargoCadena(nombreUsuario, 10, 50)) {
			this.nombreUsuario = nombreUsuario;
		}
	}

	public String getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}

	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		if (Validaciones.validaFecha(fechaNacimientoUsuario)) {
			this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		}
	}

	public int getRunUsuario() {
		return runUsuario;
	}

	public void setRunUsuario(int runUsuario) {
		if (Validaciones.validaRut(runUsuario)) {
			this.runUsuario=runUsuario;
		}
	}
	
	// Métodos sobreescritos
	
	
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimientoUsuario=" + fechaNacimientoUsuario + ", runUsuario=" + runUsuario + "]";
	}
	

	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es: "+this.nombreUsuario);
		System.out.println("La fecha de nacimiento es: "+this.fechaNacimientoUsuario);
		System.out.println("El rut es: "+this.runUsuario);
		System.out.println("**********************************************");
	}

	@Override
	public int obtieneRutUsuario() {
		return this.getRunUsuario();
	} 
}

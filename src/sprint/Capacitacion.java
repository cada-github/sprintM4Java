package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase principal con selector de opciones
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 
 */

public class Capacitacion {
	
	// Variables de clase (atributos)
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	// Metodos Constructores
	public Capacitacion(int identificador,
			int rutCliente,
			String dia,
			String hora,
			String lugar,
			String duracion,
			int cantidadAsistentes) {
		
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setDia(dia);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setDuracion(duracion);
		this.setCantidadAsistentes(cantidadAsistentes);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.dia = this.getDia();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.duracion = this.getDuracion();
		this.cantidadAsistentes = this.getCantidadAsistentes();
	}
	public Capacitacion() {	}

	//Metodos de la clase
	public String mostrarDetalle(String lugar,
			String hora,
			String dia,
			int duracion) {
		
		String mensaje= "La capacitación será en "+lugar
				+ " a las "+hora
				+ " del dia "+dia
				+ " y durará "+duracion+" minutos";
		
		return mensaje;
	}
	
	// Metodos getters y setters
	
	// Metodos Identificador
	
	/**
	 * @return
	 */
	public int getIdentificador() {
		return this.identificador;
	}
	
	/**
	 * @param identificador
	 * Identificador: obligatorio, número interno de la capacitación manejado por la empresa
	 */
	public void setIdentificador(int identificador) {
		if (identificador==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.identificador = identificador;
		}
	}
	// Fin Metodos Identificador
	
	// Metodos RutCliente
	
	/**
	 * @return
	 */
	public int getRutCliente() {
		return this.rutCliente;
	}
	
	/**
	 * @param rutCliente
	 * RUT cliente: obligatorio
	 */
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)) {
			this.rutCliente = rutCliente;
		}
	}
	// Fin Metodos RutCliente
	
	// Metodo Dia
	
	/**
	 * @return
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia
	 * Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)
	 */
	public void setDia(String dia) {
		if (Validaciones.validaDia(dia)) {
			this.dia=dia.toUpperCase();
		}
	}
	// Metodo Dia
	
	// Metodo Hora
	
	/**
	 * @return
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora
	 * Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	 */
	public void setHora(String hora) {
		if (Validaciones.validaHora(hora)) {
			this.hora = hora;
		}
	}
	// Metodo Hora
	
	// Metodo Lugar
	
	/**
	 * @return
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar
	 * Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	 */
	public void setLugar(String lugar) {
		if (Validaciones.validaLargoCadena(lugar,10,50)) {
			this.lugar = lugar;
		}
	}
	// Fin Metodo Lugar
	
	// Metodo duracion
	
	/**
	 * @return
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion
	 * Duración: máximo 70 caracteres
	 */
	public void setDuracion(String duracion) {
		if (Validaciones.validaDuracion(duracion)) {
			this.duracion = duracion;
		}
	}
	// Fin Metodo duracion
	
	// Metodo Cantidad de asistentes
	
	/**
	 * @return
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	/**
	 * @param cantidadAsistentes
	 * Cantidad de asistentes: obligatorio, número entero menor que 1000
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		if (Validaciones.validaCantidadAsistentes(cantidadAsistentes)) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
	}
	// Fin Metodo Cantidad de asistentes
	
	
	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}	
}

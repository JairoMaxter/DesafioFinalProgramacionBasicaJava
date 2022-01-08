package modelo;

public class Cliente {

	//Requerimiento 4.- de la prueba
	private String runCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private int aniosCliente;
	
	// Un simple ejemplo donde se declara enum
	// fuera de cualquier clase (Nota la palabra enum en lugar
	// de la palabra class)
	enum nombreCategoria
	{
	    Activo, Inactivo;
	}
	 
	public class Test
	{
	    // El método para dar salida por pantalla del enum
	    public static void main(String[] args)
	    {
	        nombreCategoria c1 = nombreCategoria.Activo;
	        System.out.println(c1);
	    }
	}
// Constructor
	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, int aniosCliente) {
		super();
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
	}

	
	//Getters y Setters
	
	public String getRunCliente() {
		return runCliente;
	}
	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getAniosCliente() {
		return aniosCliente;
	}
	public void setAniosCliente(int aniosCliente) {
		this.aniosCliente = aniosCliente;
	}

	//Metodo TOSTRING

	@Override
	public String toString() {
		return "Cliente [runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", aniosCliente=" + aniosCliente + "]";
	}
	
	
	
}

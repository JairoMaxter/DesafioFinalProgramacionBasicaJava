/**
 * 
 */
package vista;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import servicio.ClienteServicio;
import utilidades.Utilidad;


/**
 * @author camilo Lavado
 *
 */

/**
 * 
 * @requirements 
 * ● clienteServicio, instancia de ClienteServicio.
● archivoServicio, instancia de ArchivoServicio.
● exportadorCsv, instancia de ExportarCsv.
● exportarTxt, instancia de ExportarTxt.
● Definir un String fileName = “Clientes” (para exportar el archivo)
● Definir un String fileName1 = “DBClientes.csv” (para importar el archivo)
● scanner, instancia de Scanner para recibir valores a través del teclado.
● iniciarMenu, muestra el menu principal y recibe la entrada del teclado a través
del scanner. Contiene la lógica para denotar los demás métodos en base a la
entrada del teclado.
 *
 */
public class Menu {
	// metodos para la construcción y selección del menú (Hay que hacer los metodos)
	public static void listarCliente () {}
	public static void agregarCliente () {}
	public static void editarCliente () {}
	public static void importarDatos () {}
	public static void exportarDatos () {}
	public static void terminarPrograma () {}
	
	//Adaptar menu copiado de otro ejercicio
	//Static que ire ocupando en tiempo de ejecución
	static Scanner sc = new Scanner(System.in);
	public static String leer = "";
	public static String auxiliar = "";
	//Codigo anterior ADAPTAR
	/*//Inicio instancias de clases que ocupare en el proceso
	static ProductoServicio productoServicio = new ProductoServicio();
	static Producto producto = new Producto();
	static ExportadorTxt exp = new ExportadorTxt(); 
	*/
	//Inicio del programa
	public static void iniciarMenu(String[] args) throws IOException, InterruptedException {
		int x = 1;
		
		System.out.println("Prueba == Sistema de Clientes\n"+"*PASTELERÍA BON BON JOVI*");
		System.out.println("__________________________________");
		//En un while condiciono la repetición hasta que el usuario ingrese opción 4
		while (x == 1) {
			//Llamo al menú inicio
			do {
			menuInicio();
			leer = sc.nextLine();
			Utilidad.controlaOpcion();
			}
			while (leer.equals(""));
			
			//Controlo las diversas instancias acorde al menú planteado
			switch(Integer.parseInt(leer)) {
			//Listar clientes
				case 1:
					listarCliente();
					x = 1;
					break;
		   //Agregar Cliente 
				case 2:
					System.out.println("__________________________________");
					System.out.println("Agregar Cliente:\r\n");
					do {
						System.out.println("-------------Crear Cliente-------------");
						System.out.println("Ingresar RUN del Cliente: \n");
						auxiliar = sc.nextLine();
						Utilidad.controlaNum();
					}
					while (auxiliar.equals(""));
					cliente.setRunCliente(auxiliar);
					//////////////////////
					do {
						System.out.println("Ingresa Nombre del Cliente: \n");
						auxiliar = sc.nextLine();
						Utilidad.ControlaCaracter();
				
					}
					while (auxiliar.equals(""));
					cliente.setNombreCliente(auxiliar);
					//////////////////////////////////////
					do {
						
						/*07-01-2022 ------------------- PUNTO DE REVISIÓN - HASTA AQUI QUEDÉ*/
						System.out.println("Ingresa Apellido del Cliente: \n");
						auxiliar = sc.nextLine();
						Utilidad.ControlaCaracter();
					}
					while (auxiliar.equals(""));
					cliente.setApellidoCliente(auxiliar);
					//////////////////////////////////////
					do {
						System.out.println("Ingresa años como Cliente : \n");
						auxiliar = sc.nextLine();
						Utilidad.controlaNum();
					}
					while (auxiliar.equals(""));
					cliente.setAnioCliente(auxiliar);
					///////////////////////////////
					
					//CODIGO ANTERIOR ADAPTAR
					//Se instancia el metodo agregar Producto
					productoServicio.agregarProductos(producto.getArticulo(), producto.getPrecio(), producto.getDescripcion(),
							producto.getCodigo(), producto.getTalla(), producto.getMarca(), producto.getColor());
					System.out.println("---------------------------------------");
					x = 1;
					break;
			//Exportar archivo
				case 3:
					List<Cliente> listaCliente = ClienteServicio.getListaClientes();
					System.out.println("Se procederá a generar el archivo clientes.txt");
					exp.exportar(listaCliente);
					x = 1;
					break;
			//Salir
				case 4:
					System.out.println("Abandonando el sistema...");
					Thread.sleep(2000);
					x = 0;
					break; 
			}
		}
		System.out.println("Acaba de salir del sistema");
		System.exit(x);
	}

	//Menú inicio
	public static void menuInicio() throws IOException {
		System.out.println("___________________________");
		System.out.println("MENÚ");
		System.out.println("__________________________________");
		System.out.println("1. Listar Clientes\r\n"
				+ "2. Agregar Clientes\r\n"
				+ "3. Editar Clientes\r\n"
				+ "4. Cargar Datos\r\n"
				+ "5. Exportar Datos\r\n"
				+ "6. Salir\r\n"
				+ "Ingrese una opción:");
		
	}

}

	
	/*8. Se deben sobreescribir los métodos nombrados previamente en el punto 7, dentro de
la misma clase Menu de la siguiente manera:
● listarClientes, muestra lista de clientes agregados, ya sea por importación o
agregando a mano.
● agregarCliente, solicita ingreso de datos y llena objeto de tipo Cliente.
● editarCliente, permite la edición de algún cliente en caso de requerirlo o
cambiar el estado del cliente.
● cargarDatos, ejecuta la carga de datos del archivo “DBClientes.csv”.
● exportarDatos, llama a método para exportar clientes en formato “.txt” o
“.csv”.
● terminarPrograma, el cual finaliza la ejecución del sistema.
	 * 
	 * Hint: El único método que no se debe sobreescribir es iniciarMenu, ya que contiene su
implementación al inicio de la clase para formar el menú.
	 */
	



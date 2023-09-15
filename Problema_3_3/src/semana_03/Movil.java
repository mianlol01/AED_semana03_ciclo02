package semana_03;

public class Movil {
	private int numero, segundos;
	private String nombre;
    private double precio;
    
    private static int cantidad;
    private static double importePagar;
    public static final double FACTOR_IGV;
    
    static {
    	cantidad = 0;
    	importePagar = 0;
    	FACTOR_IGV = 0.18;
    }

	public Movil(int numero, String nombre,  int segundos, double precio) {
		this.numero = numero;
		this.segundos = segundos;
		this.nombre = nombre;
		this.precio = precio;
		cantidad ++;
		importePagar +=calcularImportePagar();
	}

	public Movil(int numero, String nombre) {
		this(numero, nombre,75,0.28);
	}
	public Movil() {
		this(987656789, "Juan");
	}

	
//=============== CONTRUCTOR
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static void setCantidad(int cantidad) {
		Movil.cantidad = cantidad;
	}

	public static void setImportePagar(double importePagar) {
		Movil.importePagar = importePagar;
	}
	
	///========== SET
	public int getNumero() {
		return numero;
	}

	public int getSegundos() {
		return segundos;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static double getImportePagar() {
		return importePagar;
	}
	public double calcularConsumo(){
		return (segundos * precio);
		}
	
	public double calcularCostoIGV(){
			return calcularConsumo() *  FACTOR_IGV;
		}	
	
     public double calcularImportePagar(){
	return calcularConsumo() + calcularCostoIGV();
		}


}

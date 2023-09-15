package semana_03;

public class Asesor {
	private int dni, codigo;
	private double remuneracion;
	private String nombre;
	
	private static int cantidad;
	private static double suma;
	public static final String INSTITUCION;
	
	static {
		cantidad = 0;
		suma = 0;
		INSTITUCION = "CONGRESO DE LA REPÚBLICA";
	}

	public Asesor(int dni, int codigo, double remuneracion, String nombre) {
		this.dni = dni;
		this.codigo = codigo;
		this.remuneracion = remuneracion;
		this.nombre = nombre;
		cantidad ++;
		suma += getRemuneracion();
	}

	public Asesor(int dni, String nombre) {
		this(dni,55555, 2000, nombre);
	}

	public Asesor() {
		this(88888888,"NN");
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public String getNombre() {
		return nombre;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Asesor.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Asesor.suma = suma;
	}
}

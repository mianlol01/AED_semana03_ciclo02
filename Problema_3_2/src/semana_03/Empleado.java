package semana_03;

public class Empleado {

	private int codigo, categoria, celular;
	private String nombre;

	private static int cantidad;
	private static double sumaSueldo;
	public static final double FACTOR_DSCTO;

	static {
		cantidad = 0;
		sumaSueldo = 0;
		FACTOR_DSCTO = 0.15;
	}

	public Empleado(int codigo, String nombre, int categoria, int celular) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.celular = celular;
		cantidad++;
		sumaSueldo += calcularSueldoNeto();
	}

	public Empleado(int codigo, String nombre) {
		this(codigo, nombre, 2, 999999999);
	}

	public Empleado() {
		this(4444, "Ninguno");
	}
///=============CONTRUCTOR

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void setCantidad(int cantidad) {
		Empleado.cantidad = cantidad;
	}

	public static void setSumaSueldo(double sumaSueldo) {
		Empleado.sumaSueldo = sumaSueldo;
	}

//===================== set
	public int getCodigo() {
		return codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public int getCelular() {
		return celular;
	}

	public String getNombre() {
		return nombre;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static double getSumaSueldo() {
		return sumaSueldo;
	}

	public double calcularSueldoBruto() {
		if (categoria == 0)
			return 7200.0;
		else if (categoria == 1)
			return 6300.0;
		else
			return 5100.0;
	}

	public double calcularDescuento() {
		return calcularSueldoBruto() * FACTOR_DSCTO;
	}

	public double calcularSueldoNeto() {
		return calcularSueldoBruto() * calcularDescuento();
	}

}

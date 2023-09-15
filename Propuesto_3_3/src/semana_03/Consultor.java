package semana_03;

public class Consultor {
	private int codigo, horas;
	private double tarifa;
	private String nombre;
	
	private static int cantidad;
	private static double sumaSueldos;
	
	private static final double AFP, EPS;
	
	static {
		cantidad = 0;
		sumaSueldos = 0;
		AFP = 0.1;
		EPS = 0.05;
	}
	public Consultor(int codigo, int horas, double tarifa, String nombre) {
		this.codigo = codigo;
		this.horas = horas;
		this.tarifa = tarifa;
		this.nombre = nombre;
		cantidad++;
		sumaSueldos += SueldoNeto();
	}
	public Consultor(int codigo, int horas, String nombre) {
		this(codigo, horas, 65, nombre);
	}
	public Consultor() {
		this(333, 30, "Juan");
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getHoras() {
		return horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public String getNombre() {
		return nombre;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Consultor.cantidad = cantidad;
	}
	public static double getSumaSueldos() {
		return sumaSueldos;
	}
	public static void setSumaSueldos(double sumaSueldos) {
		Consultor.sumaSueldos = sumaSueldos;
	}
	public double SueldoBruto() {
		return horas * tarifa;
	}
	public double DescuentoAFP() {
		return SueldoBruto() * AFP;
	}
	public double DescuentoEPS() {
		return SueldoBruto() * EPS;
	}
	public double SueldoNeto() {
		return SueldoBruto() - DescuentoAFP() - DescuentoEPS();
	}

}

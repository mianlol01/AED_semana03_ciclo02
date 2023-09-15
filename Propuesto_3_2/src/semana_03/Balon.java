package semana_03;

public class Balon {
	private double peso, presion, diametro, precio;
	private String marca;
	
	private static int cantidad;
	private static double sumaImportes;
	public static final double PI, descuento;
	
	static {
		cantidad = 0;
		sumaImportes = 0;
		PI = 3.1416;
		descuento = 0.05;
	}
	public Balon(double peso, double presion, double diametro, double precio, String marca) {
		this.peso = peso;
		this.presion = presion;
		this.diametro = diametro;
		this.precio = precio;
		this.marca = marca;
		cantidad++;
		sumaImportes += ImportePagar();
	}
	public Balon(double peso, double presion, String marca) {
		this(peso, presion, 18.5, 100, marca);
	}
	public Balon() {
		this(1.5, 4.8, "Adidas");
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setPresion(double presion) {
		this.presion = presion;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public double getPresion() {
		return presion;
	}
	public double getDiametro() {
		return diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public String getMarca() {
		return marca;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Balon.cantidad = cantidad;
	}
	public static double getSumaImportes() {
		return sumaImportes;
	}
	public static void setSumaImportes(double sumaImportes) {
		Balon.sumaImportes = sumaImportes;
	}
	public static double getPi() {
		return PI;
	}
	public static double getFactordescuento() {
		return descuento;
	}
	public double Radio() {
		return diametro / 2;
	}
	public double Volumen() {
		return 4 * PI * Radio() * Radio() * Radio() / 3;
	}
	public double Descuento() {
		return precio * descuento;
	}
	public double ImportePagar() {
		return precio - Descuento();
	}

}

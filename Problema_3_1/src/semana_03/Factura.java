package semana_03;

public class Factura {
	private String ruc, empresa;
	private int unidades;
	private double precio;
	
	private static int cantidad;
	private static double importeFacturado;
	public static final String ENTIDAD;
	
	static {
		cantidad =0;
		importeFacturado =0;
		ENTIDAD = "SUNAT";
	}
	//===CONTRUCTOR
	public Factura(String ruc, String empresa, int unidades, double precio) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precio = precio;
		cantidad ++;
		importeFacturado += calcularImporteFacturado();
	}

	public Factura(String ruc, String empresa) {
		this(ruc, empresa, 10,50.0);
		
	}
    public Factura() {
    	this ("11111111111", "MN-Global SRL");
    }

    //===SET 

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}

	public static void setImporteFacturado(double importeFacturado) {
		Factura.importeFacturado = importeFacturado;
	}
  
    ///=======================================
	
	

	public String getRuc() {
		return ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static double getImporteFacturado() {
		return importeFacturado;
	}
	///========== Con el metodo void no se retorna(return)
	
	public double calcularImporteFacturado() {
		return precio * cantidad;
	}
	
	
	

	}

	 

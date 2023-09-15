package gui;

import semana_03.Factura;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_3_1 frame = new Problema_3_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_3_1() {
		setTitle("Problema_3_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		// Creamos los 3 objetos
		Factura f1 = new Factura("234567", "Helenita", 333, 122.50);
		listado(f1);

		Factura f2 = new Factura("12235", "Cristal");
		listado(f2);

		Factura f3 = new Factura();
		listado(f3);

		imprimir("--------------");
		imprimir("Toltal Facturas\t: " + Factura.getCantidad());
		imprimir("Import.Fact.\t: " + String.format("%.2f", Factura.getImporteFacturado()));
		imprimir("Entidad\t\t: " + Factura.ENTIDAD);

	}

	void listado(Factura x) {
		imprimir("Dir. Memoria\t: " + x);
		imprimir("R.U.C\t\t: " + x.getRuc());
		imprimir("Empresa\t\t: " + x.getEmpresa());
		imprimir("Unidad\t\t: " + x.getUnidades());
		imprimir("Precio\t\t: " + String.format("%.2f", x.getPrecio()));
		imprimir("Importe\t\t: " + String.format("%.2f", x.calcularImporteFacturado()));
		imprimir();
	}

	void imprimir() {
		imprimir("");
	}

	// Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}

}
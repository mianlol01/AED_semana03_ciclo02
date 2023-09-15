package gui;

import semana_03.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_3_3 frame = new Problema_3_3();
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
	public Problema_3_3() {
		setTitle("Problema_3_3");
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
		// Creamos 3 objetos
		Movil m1 = new Movil(987654321, "Pedro", 6500, 0.30);
		listado(m1);
		Movil m2 = new Movil(987654321, "Veronica");
		listado(m2);
		Movil m3 = new Movil();
		listado(m3);
		imprimir("------------------");
		imprimir("Tot.Facturas\t:  " + Movil.getCantidad());
		imprimir("Sum.Importes\t:  " + Movil.getImportePagar());
		imprimir("Factor IGV\t:  " + Movil.FACTOR_IGV);
	}

	void listado(Movil x) {
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Numero\t\t: " + x.getNumero());
		imprimir("Segundos\t: " + x.getSegundos());
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Precio\t\t: " + x.getPrecio());
		imprimir("CostoConsumo\t: " + String.format("%.2f", x.calcularConsumo()));
		imprimir("CostoIGV\t: " + String.format("%.2f", x.calcularCostoIGV()));
		imprimir("ImpportePagar\t: " + String.format("%.2f", x.calcularImportePagar()));
		imprimir();
	}

	// Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}

	// Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}

}
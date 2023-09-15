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

public class Problema_3_2 extends JFrame implements ActionListener {

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
					Problema_3_2 frame = new Problema_3_2();
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
	public Problema_3_2() {
		setTitle("Problema_3_2");
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
		// Crear los 3 objetos
		Empleado e1 = new Empleado(54321, "Juan Vilca", 1, 95412356);
		listado(e1);
		Empleado e2 = new Empleado(12235, "Veronica Lik");
		listado(e2);
		Empleado e3 = new Empleado();
		listado(e3);
		imprimir("-----------------");
		imprimir("Tot. Empleados\t: " + Empleado.getCantidad());
		imprimir("Suma Sldo. Neto\t: " + String.format("%.2f", Empleado.getSumaSueldo()));
		imprimir("Factor Dscto\t: " + Empleado.FACTOR_DSCTO);
	}

	void listado(Empleado x) {
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Codigo\t\t: " + x.getCodigo());
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Categoria\t: " + x.getCategoria());
		imprimir("Celular\t\t: " + x.getCelular());
		imprimir("Sldo.Bruto\t: " + String.format("%.2f", x.calcularSueldoBruto()));
		imprimir("Sldo.Neto\t: " + String.format("%.2f", x.calcularSueldoNeto()));
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
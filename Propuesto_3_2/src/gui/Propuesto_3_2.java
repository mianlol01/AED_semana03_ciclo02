package gui;

import semana_03.Balon;

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
import javax.swing.UIManager;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
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
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Propuesto_3_2 frame = new Propuesto_3_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
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
		Balon b1 = new Balon(450, 4.1, 20, 105, "PUMA");
		listado(b1);
		Balon b2 = new Balon(550, 5.2, "NIKE");
		listado(b2);
		Balon b3 = new Balon();
		listado(b3);
		imprimir("--------------");
		imprimir("Cantidad de balones  : " + Balon.getCantidad());
		imprimir("Importes acumulados : " + Balon.getSumaImportes());

	}
	void listado(Balon x) {
		imprimir("Dir. Memoria    : " + x);
		imprimir("Marca           : " + x.getMarca());
		imprimir("Peso(g)         : " + x.getPeso());
		imprimir("Presión(lb)     : " + x.getPresion());
		imprimir("Diámetro(cm)    : " + x.getDiametro());
		imprimir("Radio           : " + x.Radio());
		imprimir("Volumen         : " + x.Volumen());
		imprimir("Precio          : " + x.getPrecio());
		imprimir("Descuento       : " + x.Descuento());
		imprimir("Importe a pagar : " + x.ImportePagar());
		imprimir("");
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}
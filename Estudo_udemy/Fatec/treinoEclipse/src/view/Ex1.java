package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 {

	private JFrame frame;
	private JTextField Ladoum;
	private JTextField Ladodois;
	private JTextField Ladotres;
	private JTextField resultadoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 window = new Ex1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Verifica o tipo de triângulo");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(132, 29, 163, 14);
		frame.getContentPane().add(titulo);
		
		JLabel lblNewLabel = new JLabel("Lado 1:");
		lblNewLabel.setBounds(26, 75, 54, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado 2:");
		lblNewLabel_1.setBounds(26, 108, 54, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado 3:");
		lblNewLabel_2.setBounds(26, 144, 54, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		Ladoum = new JTextField();
		Ladoum.setBounds(80, 72, 86, 20);
		frame.getContentPane().add(Ladoum);
		Ladoum.setColumns(10);
		
		Ladodois = new JTextField();
		Ladodois.setColumns(10);
		Ladodois.setBounds(80, 107, 86, 20);
		frame.getContentPane().add(Ladodois);
		
		Ladotres = new JTextField();
		Ladotres.setColumns(10);
		Ladotres.setBounds(80, 143, 86, 20);
		frame.getContentPane().add(Ladotres);
		
		
		
		JButton verfica = new JButton("Verificar tipo");
		verfica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Lado1 = Integer.parseInt(Ladoum.getText());
				int Lado2 = Integer.parseInt(Ladodois.getText());
				int Lado3 = Integer.parseInt(Ladotres.getText());
				
				if(Lado1 == Lado2 && Lado1 == Lado3) {
					resultadoTexto.setText("Triângulo Equilátero");
				} else if (Lado1 == Lado2 && Lado2 != Lado3 || Lado2 == Lado3 && Lado3 != Lado1) {
					resultadoTexto.setText("Triângulo Isósceles");
				} else if (Lado1 != Lado2 && Lado1 != Lado3) {
					resultadoTexto.setText("Triângulo Escaleno");
				}
			}
		});
		verfica.setBounds(81, 227, 122, 23);
		frame.getContentPane().add(verfica);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(257, 227, 89, 23);
		frame.getContentPane().add(sair);
		
		JLabel resultado = new JLabel("Resultado:");
		resultado.setBounds(26, 183, 69, 14);
		frame.getContentPane().add(resultado);
		
		resultadoTexto = new JTextField();
		resultadoTexto.setEditable(false);
		resultadoTexto.setBounds(93, 180, 123, 20);
		frame.getContentPane().add(resultadoTexto);
		resultadoTexto.setColumns(10);
	}
}

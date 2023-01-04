package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Ex3 {

	private JFrame frame;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JButton sair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 window = new Ex3();
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
	public Ex3() {
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
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 21, 126, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setBounds(28, 67, 63, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número 2:");
		lblNewLabel_2.setBounds(28, 110, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setBounds(28, 150, 63, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		numero1 = new JTextField();
		numero1.setBounds(101, 68, 86, 20);
		frame.getContentPane().add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(101, 107, 86, 20);
		frame.getContentPane().add(numero2);
		numero2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(101, 147, 280, 20);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		JButton somar = new JButton("Somar");
		somar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int numeroum = Integer.parseInt(numero1.getText());
				int numerodois = Integer.parseInt(numero2.getText());
				
				int a = somaConta(numeroum , numerodois);

				resultado.setText("" + a);
			}
		});
		somar.setBounds(28, 193, 78, 23);
		frame.getContentPane().add(somar);
		
		JButton dividir = new JButton("Dividir");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroum = Integer.parseInt(numero1.getText());
				int numerodois = Integer.parseInt(numero2.getText());
				
				int b = divideConta(numeroum, numerodois);
				
				if(numerodois == 0) {
					try {
						divideConta(numeroum, numerodois);
					} catch (ArithmeticException e1){
						resultado.setText("Nao da pra dividir por 0");
					}
				} else if (numerodois != 0){
					resultado.setText("" + b);
				}
			}
		});
		dividir.setBounds(116, 193, 78, 23);
		frame.getContentPane().add(dividir);
		
		JButton multiplicar = new JButton("Multiplicar");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroum = Integer.parseInt(numero1.getText());
				int numerodois = Integer.parseInt(numero2.getText());
				
				int c = multiplicaConta(numeroum, numerodois);
				
				resultado.setText("" + c);
			}
		});
		multiplicar.setBounds(204, 193, 94, 23);
		frame.getContentPane().add(multiplicar);
		
		JButton subtrair = new JButton("Subtrair");
		subtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroum = Integer.parseInt(numero1.getText());
				int numerodois = Integer.parseInt(numero2.getText());
				
				int d = subtraiConta(numeroum, numerodois);
				
				resultado.setText("" + d);
				
			}
		});
		subtrair.setBounds(309, 193, 94, 23);
		frame.getContentPane().add(subtrair);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1.setText("");
				numero2.setText("");
				resultado.setText("");			}
		});
		limpar.setBounds(126, 227, 78, 23);
		frame.getContentPane().add(limpar);
		
		sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(214, 227, 78, 23);
		frame.getContentPane().add(sair);
	}
	
	public int somaConta(int numeroum, int numerodois) {
		int a  = numeroum + numerodois;
		return a;
	}
	
	public int divideConta(int numeroum, int numerodois) {
			int b = numeroum / numerodois;
			return b;
	}
	
	public int multiplicaConta(int numeroum, int numerodois) {
		int c = numeroum * numerodois;
		return c;
	}
	
	public int subtraiConta(int numeroum, int numerodois) {
		int d = numeroum - numerodois;
		return d;
	}
}

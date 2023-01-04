package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TreinoProvaSandraIdiota {

	private JFrame frame;
	private JTextField numero;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreinoProvaSandraIdiota window = new TreinoProvaSandraIdiota();
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
	public TreinoProvaSandraIdiota() {
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
		
		JLabel lblNewLabel = new JLabel("Sandra Maldita");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 11, 151, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 77, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 134, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton Calculo = new JButton("Calculo");
		Calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(numero.getText());
				
				try {
					int x = calculo(a);
					int y = calculoDois(a);
				
					if (a >= 10 && a <= 30) {
						String zero = "0";
						resultado.setText(x + zero + y);
					} else if (a >= 31 && a <= 60) {
						String um = "1";
						resultado.setText(x + um + y);
					} else if (a >= 61 && a <= 99) {
						String dois = "2";
						resultado.setText(x + dois + y);
					} 
				 
				} catch (ArithmeticException e1) {
					resultado.setText("O numero inserido deve estar entre 10 e 99.");
				}
			
			} 
		});
		Calculo.setBounds(58, 174, 89, 23);
		frame.getContentPane().add(Calculo);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero.setText("");
				resultado.setText("");
			}
		});
		limpar.setBounds(181, 174, 89, 23);
		frame.getContentPane().add(limpar);
		
		JButton Sair = new JButton("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Sair.setBounds(305, 174, 89, 23);
		frame.getContentPane().add(Sair);
		
		numero = new JTextField();
		numero.setBounds(82, 68, 145, 23);
		frame.getContentPane().add(numero);
		numero.setColumns(10);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(82, 125, 311, 23);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
	}
	
	public int calculo(int a) {
		int c = 0;
		
		c = a % 100;
		c = c/10;
			
		if (a >= 10 && a <= 99) {
			return c;
		} else {
			throw new ArithmeticException("Deve estar entre 10 e 99.");
		}
		
	}
	
	public int calculoDois(int a) {
		int d = 0;
		
		d = a % 10;
		return d;
	}
}

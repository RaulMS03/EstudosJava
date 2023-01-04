package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2 {

	private JFrame frame;
	private JTextField ladoum;
	private JTextField ladodois;
	private JTextField ladotres;
	private JTextField resultadoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 window = new Ex2();
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
	public Ex2() {
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
		
		JLabel lblNewLabel = new JLabel("Verifica o tipo de triângulo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 11, 153, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado 1:");
		lblNewLabel_1.setBounds(10, 64, 50, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado 2:");
		lblNewLabel_2.setBounds(10, 105, 50, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lado 3:");
		lblNewLabel_3.setBounds(10, 149, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		ladoum = new JTextField();
		ladoum.setBounds(57, 61, 86, 20);
		frame.getContentPane().add(ladoum);
		ladoum.setColumns(10);
		
		ladodois = new JTextField();
		ladodois.setBounds(57, 102, 86, 20);
		frame.getContentPane().add(ladodois);
		ladodois.setColumns(10);
		
		ladotres = new JTextField();
		ladotres.setBounds(57, 146, 86, 20);
		frame.getContentPane().add(ladotres);
		ladotres.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado:");
		lblNewLabel_4.setBounds(10, 193, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		resultadoTexto = new JTextField();
		resultadoTexto.setEditable(false);
		resultadoTexto.setBounds(76, 190, 136, 17);
		frame.getContentPane().add(resultadoTexto);
		resultadoTexto.setColumns(10);
		
		JButton verifica = new JButton("Verificar tipo");
		verifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int lado1 = Integer.parseInt(ladoum.getText());
				int lado2 = Integer.parseInt(ladodois.getText());
				int lado3 = Integer.parseInt(ladotres.getText());
				
				int a = verificarTri(lado1, lado2, lado3);

				if(a == 1) {
					resultadoTexto.setText("1:Triângulo Equilátero");
				} else if(a == 2) {
					resultadoTexto.setText("2:Triângulo Isósceles");
				} else if (a == 3) {
					resultadoTexto.setText("3:Triângulo Escaleno");
				} 
			}
		});
		
		verifica.setBounds(86, 227, 111, 23);
		frame.getContentPane().add(verifica);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(242, 227, 89, 23);
		frame.getContentPane().add(sair);
	}
	
	public int verificarTri(int lado1, int lado2, int lado3) {
		if(lado1 == lado2 && lado1 == lado3) {
			return 1;
		} else if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado3 != lado1) {
			return 2;
		} else if (lado1 != lado2 && lado1 != lado3) {
			return 3;
		} else
			return 0;
	}
}



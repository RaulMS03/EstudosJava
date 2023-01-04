package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 {

	private JFrame frame;
	private JTextField portugues;
	private JTextField matematica;
	private JTextField biologia;
	private JTextField fisica;
	private JTextField quimica;
	private JTextField sexo;
	private JTextField sociologia;
	private JTextField filosofia;
	private JTextField historia;
	private JTextField geografia;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 window = new Ex5();
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
	public Ex5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Curso idiota de Conhecimentos Gerais");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 11, 225, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Portugues:");
		lblNewLabel_1.setBounds(10, 36, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Matematica:");
		lblNewLabel_1_1.setBounds(10, 71, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Biologia:");
		lblNewLabel_1_2.setBounds(10, 106, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fisica :");
		lblNewLabel_1_3.setBounds(10, 140, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Quimica:");
		lblNewLabel_1_4.setBounds(10, 177, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("Media Final:");
		lblNewLabel_2.setBounds(10, 202, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Geografia:");
		lblNewLabel_1_5.setBounds(235, 36, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Historia:");
		lblNewLabel_1_6.setBounds(235, 71, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Filosofia:");
		lblNewLabel_1_7.setBounds(235, 106, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Sociologia:");
		lblNewLabel_1_8.setBounds(235, 140, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Sexologia:");
		lblNewLabel_1_9.setBounds(235, 177, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		portugues = new JTextField();
		portugues.setBounds(82, 36, 86, 20);
		frame.getContentPane().add(portugues);
		portugues.setColumns(10);
		
		matematica = new JTextField();
		matematica.setColumns(10);
		matematica.setBounds(82, 68, 86, 20);
		frame.getContentPane().add(matematica);
		
		biologia = new JTextField();
		biologia.setColumns(10);
		biologia.setBounds(82, 103, 86, 20);
		frame.getContentPane().add(biologia);
		
		fisica = new JTextField();
		fisica.setColumns(10);
		fisica.setBounds(82, 137, 86, 20);
		frame.getContentPane().add(fisica);
		
		quimica = new JTextField();
		quimica.setColumns(10);
		quimica.setBounds(82, 174, 86, 20);
		frame.getContentPane().add(quimica);
		
		sexo = new JTextField();
		sexo.setColumns(10);
		sexo.setBounds(322, 174, 86, 20);
		frame.getContentPane().add(sexo);
		
		sociologia = new JTextField();
		sociologia.setColumns(10);
		sociologia.setBounds(322, 137, 86, 20);
		frame.getContentPane().add(sociologia);
		
		filosofia = new JTextField();
		filosofia.setColumns(10);
		filosofia.setBounds(322, 103, 86, 20);
		frame.getContentPane().add(filosofia);
		
		historia = new JTextField();
		historia.setColumns(10);
		historia.setBounds(322, 68, 86, 20);
		frame.getContentPane().add(historia);
		
		geografia = new JTextField();
		geografia.setColumns(10);
		geografia.setBounds(322, 33, 86, 20);
		frame.getContentPane().add(geografia);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBounds(82, 199, 326, 20);
		frame.getContentPane().add(resultado);
		
		JButton calculo = new JButton("Calcular");
		calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(portugues.getText());
				double b = Double.parseDouble(matematica.getText());
				double c = Double.parseDouble(biologia.getText());
				double d = Double.parseDouble(fisica.getText());
				double x = Double.parseDouble(quimica.getText());
				double f = Double.parseDouble(geografia.getText());
				double g = Double.parseDouble(filosofia.getText());
				double h = Double.parseDouble(sociologia.getText());
				double i = Double.parseDouble(sexo.getText());
				double j = Double.parseDouble(historia.getText());
				
				double y = calculoMedia(a, b, c, d, x, f, g, h, i, j);
			
				if (a <= 5.9 && b <= 5.9 && c <=5.9 || a <= 5.9 && b <= 5.9 && d <=5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && b <= 5.9 && x <= 5.9 || a <= 5.9 && b <= 5.9 && f<= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && b <= 5.9 && g <= 5.9 || a <= 5.9 && b <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && b <= 5.9 && i <= 5.9 || a <= 5.9 && b <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && c <= 5.9 && d <= 5.9 || a <= 5.9 && c <= 5.9 && x <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && c <= 5.9 && f <= 5.9 || a <= 5.9 && c <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && c <= 5.9 && h <= 5.9 || a <= 5.9 && c <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && c <= 5.9 && j <= 5.9 || a <= 5.9 && d <= 5.9 && x <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && d <= 5.9 && f <= 5.9 || a <= 5.9 && d <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && d <= 5.9 && h <= 5.9 || a <= 5.9 && d <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && d <= 5.9 && j <= 5.9 || a <= 5.9 && x <= 5.9 && f <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && x <= 5.9 && g <= 5.9 || a <= 5.9 && x <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && x <= 5.9 && i <= 5.9 || a <= 5.9 && x <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && f <= 5.9 && g <= 5.9 || a <= 5.9 && f <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && f <= 5.9 && i <= 5.9 || a <= 5.9 && f <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && g <= 5.9 && h <= 5.9 || a <= 5.9 && g <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && g <= 5.9 && j <= 5.9 || a <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (a <= 5.9 && h <= 5.9 && j <= 5.9 || a <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && c <= 5.9 && d <= 5.9 || b <= 5.9 && c <= 5.9 && x <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && c <= 5.9 && f <= 5.9 || b <= 5.9 && c <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && c <= 5.9 && h <= 5.9 || b <= 5.9 && c <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && c <= 5.9 && j <= 5.9 || b <= 5.9 && d <= 5.9 && x <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && d <= 5.9 && f <= 5.9 || b <= 5.9 && d <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && d <= 5.9 && h <= 5.9 || b <= 5.9 && d <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && d <= 5.9 && j <= 5.9 || b <= 5.9 && x <= 5.9 && f <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && x <= 5.9 && g <= 5.9 || b <= 5.9 && x <= 5.9 && h <= 5.9) {				 
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && x <= 5.9 && i <= 5.9 || b <= 5.9 && x <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && f <= 5.9 && g <= 5.9 || b <= 5.9 && f <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && f <= 5.9 && i <= 5.9 || b <= 5.9 && f <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && g <= 5.9 && h <= 5.9 || b <= 5.9 && g <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && g <= 5.9 && j <= 5.9 || b <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (b <= 5.9 && h <= 5.9 && j <= 5.9 || b <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && d <= 5.9 && x <= 5.9 || c <= 5.9 && d <= 5.9 && f <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && d <= 5.9 && g <= 5.9 || c <= 5.9 && d <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && d <= 5.9 && i <= 5.9 || c <= 5.9 && d <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && x <= 5.9 && f <= 5.9 || c <= 5.9 && x <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && x <= 5.9 && h <= 5.9 || c <= 5.9 && x <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && x <= 5.9 && j <= 5.9 || c <= 5.9 && f <= 5.9 && g <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && f <= 5.9 && h <= 5.9 || c <= 5.9 && f <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && f <= 5.9 && j <= 5.9 || c <= 5.9 && g <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && g <= 5.9 && i <= 5.9 || c <= 5.9 && g <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && h <= 5.9 && i <= 5.9 || c <= 5.9 && h <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (c <= 5.9 && i <= 5.9 && j <= 5.9 || d <= 5.9 && f <= 5.9 && x <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && x <= 5.9 && g <= 5.9 || d <= 5.9 && x <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && x <= 5.9 && i <= 5.9 || d <= 5.9 && x <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && f <= 5.9 && g <= 5.9 || d <= 5.9 && f <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && f <= 5.9 && i <= 5.9 || d <= 5.9 && f <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && g <= 5.9 && h <= 5.9 || d <= 5.9 && g <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && g <= 5.9 && j <= 5.9 || d <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (d <= 5.9 && h <= 5.9 && j <= 5.9 || d <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (x <= 5.9 && f <= 5.9 && g <= 5.9 || x <= 5.9 && f <= 5.9 && h <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (x <= 5.9 && f <= 5.9 && i <= 5.9 || x <= 5.9 && f <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (x <= 5.9 && g <= 5.9 && h <= 5.9 || x <= 5.9 && g <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (x <= 5.9 && g <= 5.9 && j <= 5.9 || x <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (x <= 5.9 && h <= 5.9 && j <= 5.9 || x <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (f <= 5.9 && g <= 5.9 && h <= 5.9 || f <= 5.9 && g <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (f <= 5.9 && g <= 5.9 && j <= 5.9 || f <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (f <= 5.9 && h <= 5.9 && j <= 5.9 || f <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (g <= 5.9 && h <= 5.9 && i <= 5.9 || g <= 5.9 && h <= 5.9 && i <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (g <= 5.9 && i <= 5.9 && j <= 5.9 || h <= 5.9 && i <= 5.9 && j <= 5.9) {
					resultado.setText("Voce foi reprovado, 3 materias vermelhas.");
				} else if (y > 5.9 && y <= 10.0) {
					resultado.setText(y + ": Parabens animal. Nao fez mais que a obrigação!!");
				} 
			}
		});
		calculo.setBounds(92, 227, 89, 23);
		frame.getContentPane().add(calculo);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				portugues.setText("");
				matematica.setText("");
				biologia.setText("");
				fisica.setText("");
				quimica.setText("");
				geografia.setText("");
				historia.setText("");
				filosofia.setText("");
				sociologia.setText("");
				sexo.setText("");
				resultado.setText("");
			}
		});
		limpar.setBounds(191, 227, 89, 23);
		frame.getContentPane().add(limpar);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(290, 227, 89, 23);
		frame.getContentPane().add(sair);
	}

	public double calculoMedia(double a, double b, double c, double d, double x, double f, double g, double h, double i, double j) {
		
		double y = (a + b + c + d + x + f + g + h + i + j)/10;
		return y;
	}
}

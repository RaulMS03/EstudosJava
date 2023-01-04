package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex4 {

	private JFrame frame;
	private JTextField nome;
	private JTextField peso;
	private JTextField altura;
	private JTextField mensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 window = new Ex4();
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
	public Ex4() {
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
		
		JLabel titulo = new JLabel("Indice de Massa Corporal");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(104, 11, 212, 14);
		frame.getContentPane().add(titulo);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 55, 52, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso:");
		lblNewLabel_1.setBounds(10, 93, 60, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:");
		lblNewLabel_2.setBounds(10, 133, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		nome = new JTextField();
		nome.setBounds(72, 49, 340, 20);
		frame.getContentPane().add(nome);
		nome.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(72, 90, 129, 17);
		frame.getContentPane().add(peso);
		peso.setColumns(10);
		
		altura = new JTextField();
		altura.setBounds(72, 130, 129, 17);
		frame.getContentPane().add(altura);
		altura.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mensagem:");
		lblNewLabel_3.setBounds(10, 182, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		mensagem = new JTextField();
		mensagem.setEditable(false);
		mensagem.setBounds(89, 180, 297, 17);
		frame.getContentPane().add(mensagem);
		mensagem.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(peso.getText());
				double b = Double.parseDouble(altura.getText());
				
				double c = a/(b*b);
				
				if(c <= 18.5) {
					mensagem.setText(c + " :Abaixo do Peso");
				} else if (c >= 18.6 && c <= 24.9) {
					mensagem.setText(c + " :Peso ideal(parabéns)");
				} else if (c >= 25.0 && c <= 29.9) {
					mensagem.setText(c + " :Levemente acima do Peso");
				} else if (c >= 30.0 && c <= 34.9) {
					mensagem.setText(c + " :Obesidade Grau I");
				} else if (c >= 35.0 && c <= 39.9) {
					mensagem.setText(c + " :Obesidade Grau II(severa)");
				} else if (c >= 40.0) {
					mensagem.setText(c + " :Obesidade Grau III(mórbida)");
				}
  			}
		});
		btnNewButton.setBounds(20, 216, 117, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome.setText("");
				peso.setText("");
				altura.setText("");
				mensagem.setText("");
			}
		});
		btnNewButton_1.setBounds(158, 216, 117, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(295, 216, 117, 21);
		frame.getContentPane().add(btnNewButton_2);
	}
}

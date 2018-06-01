package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class formularioDiretoria extends JFrame {

	private JPanel contentPane;

	public formularioDiretoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-Vindo!");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(147, 11, 184, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			cadastrar c = new cadastrar();
			c.setVisible(true);
				
			}
		});		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(33, 132, 140, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alunos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBounds(33, 194, 140, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Professores");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(33, 251, 140, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Configura\u00E7\u00F5es");
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(33, 307, 140, 33);
		contentPane.add(btnNewButton_5);
		
	}
}

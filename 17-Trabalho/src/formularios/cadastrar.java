package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastrar extends JFrame {

	private JPanel contentPane;


	public cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(51, 11, 99, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Professores");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastrarProfessor cp = new cadastrarProfessor();
				cp.setVisible(true);
				
			}
		});		btnNewButton.setBounds(47, 75, 114, 25);
		contentPane.add(btnNewButton);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAluno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastrarAluno ca = new cadastrarAluno();
				ca.setVisible(true);
				
			}
		});
		btnAluno.setBounds(47, 183, 114, 23);
		contentPane.add(btnAluno);
	}

}

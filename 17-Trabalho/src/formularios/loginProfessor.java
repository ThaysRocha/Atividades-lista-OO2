package formularios;

import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SingleSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class loginProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField usuárioProfessor;
	private JPasswordField passwordField;

	public loginProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuárioProfessor = new JTextField();
		usuárioProfessor.setBounds(123, 65, 211, 26);
		contentPane.add(usuárioProfessor);
		usuárioProfessor.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Arial", Font.PLAIN, 18));
		lblUsurio.setBounds(31, 71, 82, 20);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha.setBounds(31, 130, 58, 20);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 130, 94, 22);
		contentPane.add(passwordField);
		
		JButton btnLogar = new JButton("Entrar");
		btnLogar.setFont(new Font("Arial", Font.PLAIN, 18));
		btnLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				LocalDateTime tempo = LocalDateTime.now();
				
				int hora = tempo.getHour();
				int minuto = tempo.getMinute();
				int segundo = tempo.getSecond();
					
					if(hora < 12){
						JOptionPane.showMessageDialog(null, "Bom Dia "+usuárioProfessor+" Agora são "+hora+":"+minuto+":"+segundo);
					}else if(hora > 18){
						JOptionPane.showMessageDialog(null, "Boa Noite "+usuárioProfessor+"Agora são "+hora+":"+minuto+":"+segundo);
					}else if((hora <= 17) && (hora >= 13));
					JOptionPane.showMessageDialog(null, "Boa Tarde "+usuárioProfessor+"Agora são "+hora+":"+minuto+":"+segundo);
			}
			
					
		});		
		btnLogar.setBounds(155, 227, 89, 23);
		contentPane.add(btnLogar);
	
	}
	
}

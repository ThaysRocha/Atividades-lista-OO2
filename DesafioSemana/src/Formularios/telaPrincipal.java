package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SpinnerListModel;

public class telaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JLabel nome;

	public telaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 461);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo1 = new JLabel("Vamos come\u00E7ar a jogar");
		titulo1.setBounds(173, 5, 203, 31);
		titulo1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(titulo1);
		
		campoNome = new JTextField();
		campoNome.setBounds(214, 100, 203, 31);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		nome = new JLabel("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 15));
		nome.setBounds(149, 103, 55, 22);
		contentPane.add(nome);
		
		JButton btnEntrar = new JButton("JOGAR");
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEntrar.setBounds(31, 185, 89, 23);
		contentPane.add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnRanking = new JButton("RANKING");
		btnRanking.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRanking.setBounds(31, 252, 89, 23);
		contentPane.add(btnRanking);
		btnRanking.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBounds(31, 310, 89, 23);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JSpinner categorias = new JSpinner();
		categorias.setToolTipText("Tema\r\n");
		categorias.setModel(new SpinnerListModel(new String[] {"Tema"}));
		categorias.setBounds(261, 185, 171, 22);
		contentPane.add(categorias);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{titulo1, campoNome, nome, btnEntrar, btnRanking, btnSair, categorias}));
		
	}
}

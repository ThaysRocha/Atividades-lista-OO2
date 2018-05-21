package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class formularioPrincipal {

	public static void main(String[] args) {
	
		//Usando o JFrame
		JFrame desafio = new JFrame();
		desafio.setVisible(true);
		desafio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desafio.setSize(900, 500);
		desafio.setTitle("Comprindo o desafio");
		desafio.setLocationRelativeTo(null);
		desafio.setLayout(null);
		
		
		//JLabel Produto
		JLabel produto = new JLabel();
		produto.setText("Escreva qual o nome do produto");
		produto.setBounds(20, 20, 190, 30);
		
		//JTestField campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(210, 20, 120, 30);
		
		//JLabel quantidade
		JLabel quantidade = new JLabel();
		quantidade.setText("Indique a quantidade do produto");
		quantidade.setBounds(20, 80, 190, 30);
				
		//JTestField campo2
		JTextField campo2 = new JTextField();
		campo2.setBounds(210, 80, 120, 30);
				
		//JLabel preço
		JLabel preco = new JLabel();
		preco.setText("Escreva qual o preço do produto");
		preco.setBounds(20, 50, 190, 30);
				
		//JTestField campo3
		JTextField campo3 = new JTextField();
		campo3.setBounds(210, 50, 120, 30);
		
		
		//Criar colunas com JTable
		DefaultTableModel exibirDados = new DefaultTableModel();
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");
		

		//JTable para exibir o Default
		JTable coluna = new JTable(exibirDados);
		
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(coluna);
		barraRolagem.setBounds(350, 250, 250, 150);
		
		
		
		//JButton botão
		JButton botao = new JButton();
		botao.setText("Cadastrar");
		botao.setBounds(350, 150, 100, 30);
		
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				exibirDados.addRow(new Object[]{campo1.getText(), campo2.getText(), campo3.getText()});
				
				//Limpar o campo contendo o nome
				campo1.setText("");
				
				//Selecionar o campo nome
				campo1.requestFocus();
				
				//Limpar o campo contendo o nome
				campo2.setText("");
				
				//Selecionar o campo nome
				campo2.requestFocus();
				
				//Limpar o campo contendo o nome
				campo3.setText("");
				
				//Selecionar o campo nome
				campo3.requestFocus();
				
				
			}
		});
		
		//JButton
		
		
		//Adicionando elementos ao JFrame
		desafio.add(produto);
		desafio.add(campo1);
		desafio.add(quantidade);
		desafio.add(campo2);
		desafio.add(preco);
		desafio.add(campo3);
		desafio.add(botao);
		desafio.add(barraRolagem);
		
		
		//Exibir dados
		desafio.setVisible(true);
		desafio.repaint();
	}

	public String produto;
	public double valor;
	public double quantidade;
		
		

}

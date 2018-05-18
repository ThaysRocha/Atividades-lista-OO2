package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		
	//Usando JFrame, fazendo aparecer o questionário
		JFrame questionario = new JFrame();
		questionario.setVisible(true);
		questionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		questionario.setSize(500, 300);
		questionario.setLocationRelativeTo(null);
		questionario.setTitle("Questionário usando JFrame");
		questionario.setLayout(null);
		
		
	//Instanciando para perguntar nome
		JLabel perguntaN = new JLabel();
		perguntaN.setText("1º Insira seu nome");
		perguntaN.setBounds(20, 10, 130, 20);
		
	//Usando JTextField
		JTextField campoN = new JTextField();
		campoN.setBounds(130, 10, 150, 20);
		
	//Instanciando para perguntar cidade
		JLabel perguntaC = new JLabel();
		perguntaC.setText("2º Qual a cidade onde você vive?");
		perguntaC.setBounds(20, 50, 350, 25);
		
		//Usando JTextField
				JTextField campoC = new JTextField();
				campoC.setBounds(210, 50, 130, 20);
				
	//Instanciando para perguntar idade
		JLabel perguntaI = new JLabel();
		perguntaI.setText("3º Qual a sua idade?");
		perguntaI.setBounds(20, 80, 400, 35);
		
		//Usando JTextField
				JTextField campoI = new JTextField();
				campoI.setBounds(140, 85, 60, 20);
				
		//Usando o JButton para finalizar
		JButton botao = new JButton();
		botao.setText("Finalizar");
		botao.setBounds(220, 150, 90, 20);
	
		//Dar ação ao Botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Olá "+campoN.getText()+" Você tem "+campoI.getText()+" de idade e mora em "+campoC.getText());
				
			//Limpar campo do nome
			campoN.setText("");
			
			//Selecionar campo nome
			campoN.requestFocus();
			
			//Limpar campo do cidade
			campoC.setText("");
			
			//Selecionar campo cidade
			campoC.requestFocus();
			
			//Limpar campo do idade
			campoI.setText("");
			
			//Selecionar campo idade
			campoI.requestFocus();
			
			}
		});
		
		//Adicionar componentes
		questionario.add(perguntaN);
		questionario.add(campoN);
		questionario.add(perguntaC);
		questionario.add(campoC);
		questionario.add(perguntaI);
		questionario.add(campoI);
		questionario.add(botao);
		
		
		//Exibir o questionário
		questionario.setVisible(true);
	}
}

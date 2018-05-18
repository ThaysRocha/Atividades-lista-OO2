package exercicios03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Usar o JFrame
		JFrame boletim = new JFrame();
		boletim.setVisible(true);
		boletim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boletim.setSize(500, 300);
		boletim.setLocationRelativeTo(null);
		boletim.setTitle("Boletim");
		boletim.setLayout(null);
		
		//JLabel
		JLabel nota1 = new JLabel();
		nota1.setText("Insira sua 1ª nota ");
		nota1.setBounds(20, 20, 130, 20 );
		
		//JTestField
		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 20, 50, 20);
		
		//JLabel
		JLabel nota2 = new JLabel();
		nota2.setText("Insira sua 2ª nota ");
		nota2.setBounds(20, 40, 130, 20 );
				
		//JTextField
		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 40, 50, 20);
				
		//JLabel
		JLabel nota3 = new JLabel();
		nota3.setText("Insira sua 3ª nota ");
		nota3.setBounds(20, 60, 130, 20 );
				
		//JTextField
		JTextField campo3 = new JTextField();
		campo3.setBounds(140, 60, 50, 20);
		
		//JLabel
		JLabel nota4 = new JLabel();
		nota4.setText("Insira sua 4ª nota ");
		nota4.setBounds(20, 80, 130, 20 );
						
		//JTextField
		JTextField campo4 = new JTextField();
		campo4.setBounds(140, 80, 50, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Calcular");
		botao.setBounds(175, 150, 100, 20);
		
		//Adicionar elementos ao JFrame
		boletim.add(nota1);
		boletim.add(campo1);
		boletim.add(nota2);
		boletim.add(campo2);
		boletim.add(nota3);
		boletim.add(campo3);
		boletim.add(nota4);
		boletim.add(campo4);
		boletim.add(botao);
		
		//Exibir dados
		boletim.setVisible(true);
		
	}

}

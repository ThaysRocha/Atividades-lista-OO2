package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Usar JFrame
		JFrame calcularP = new JFrame();
		calcularP.setVisible(true);
		calcularP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcularP.setSize(500, 300);
		calcularP.setLocationRelativeTo(null);
		calcularP.setTitle("Clacular desconto do produto");
		calcularP.setLayout(null);
		
		//Instanciar valor do produto
		JLabel valor = new JLabel();
		valor.setText("Informe o valor original do produto  R$");
		valor.setBounds(10, 10, 280, 30);
		
		//Instanciar o campo
		JTextField campo = new JTextField();
		campo.setBounds(230, 15, 50, 20);
		
		//Botão
		JButton botao = new JButton();
		botao.setText("Continuar");
		botao.setBounds(200, 200, 100, 20);
		
		//Dando ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Calcular os 10% do produto
				Double valor1 = (double) 0;
				campo = valor1;
				valor1 = campo;
				JOptionPane.showMessageDialog(null, "O valor do produto original é "+campo.getText()+" E valor do produto com desconto é de R$"+valor1);
				
				
				//Selecionar e Limpar o campo 
				campo.setText("");
				campo.requestFocus();
			}
		});
		
		
		
		
		
		//Juntar os elementos ao JFrame
		calcularP.add(valor);
		calcularP.add(campo);
		calcularP.add(botao);
		
		//Exibir Dados
	}

}

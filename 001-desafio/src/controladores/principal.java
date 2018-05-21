package controladores;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class principal {

	
		//ArrayList
		ArrayList<formularioPrincipal> dados = new ArrayList<>();
		
		//Método para cadastrar no ArrayList 
		private void cadastrar(){
			
			//Instanciar um objeto
			formularioPrincipal d = new formularioPrincipal();
			
			//Obter os dados para a tabela
			d.produto = JOptionPane.showInputDialog("Escreva qual o nome do produto");
			d.valor = Double.parseDouble(JOptionPane.showInputDialog("Indique a quantidade do produto"));
			d.quantidade = Double.parseDouble(JOptionPane.showInputDialog("Escreva qual o preço do produto"));
			
		
			
			//Adicionar o aluno ao vetor
			dados.add(d);
			
			
			
			
		

		

	}

}

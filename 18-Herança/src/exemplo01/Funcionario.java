package exemplo01;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

	//Atributos
	private String cargo;
	private double salario;
	
	//M�todo construtor
	public Funcionario(String nome, String cargo, int idade, double salario) {
		
		//Enviando para os atributos de cada classe
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		
		//Chamar o m�todo mensagem
		mensagem();
		
		
	}
	
	//M�todo para exibir uma mensagem
		public void mensagem(){
			
			//Estrutura da mensagem
			String mensagem = "Nome: "+nome;
				   mensagem = "\nCargo: "+cargo;
				   mensagem = "\nIdade: "+idade;
				   mensagem = "\nSitua��o Idade: "+situacaoIdade();
				   mensagem = "\nSalario: "+salario;
				   
				   //Exibir mensagem
				   JOptionPane.showMessageDialog(null, mensagem);
		}
	
}

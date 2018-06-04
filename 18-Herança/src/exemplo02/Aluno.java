package exemplo02;

import javax.swing.JOptionPane;

public class Aluno extends Notas {

	//Atributos
	private String nome, materia;
	
	//Construtor
	public Aluno(String nome, String materia, int nota1, int nota2, int nota3){
		
		//Chamar construtor da classe Notas
		super(nota1, nota2, nota3);
		
		//Atribuir valores
		this.nome = nome;
		this.materia = materia;
		
		//M�todo situa��o
		situacao();
	}
	
	
	//M�todo situa��o
	private void situacao(){
		
		
	//Estrutura da mensagem
		String mensagem = "Aluno: "+nome;
			   mensagem += "\nMat�ria: "+materia;
			   mensagem += "\nM�dia: "+media();
			   
			   
	//Exibindo Mensagem
	JOptionPane.showMessageDialog(null, mensagem);
	}
	
}


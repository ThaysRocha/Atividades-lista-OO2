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
		
		//Método situação
		situacao();
	}
	
	
	//Método situação
	private void situacao(){
		
		
	//Estrutura da mensagem
		String mensagem = "Aluno: "+nome;
			   mensagem += "\nMatéria: "+materia;
			   mensagem += "\nMédia: "+media();
			   
			   
	//Exibindo Mensagem
	JOptionPane.showMessageDialog(null, mensagem);
	}
	
}


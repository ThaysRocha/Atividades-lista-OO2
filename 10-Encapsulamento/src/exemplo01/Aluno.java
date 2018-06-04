package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/* 
	 
	 Encapsulamento -> Visibilidade de atributos e métodos
	 DEFAULT   -> Visível apenas nas classes no mesmo pacote
	 PUBLIC    -> Visível por qualquer classe (Em qualquer projeto)
	 PRIVATE   -> Visível apenas na classe onde são criados
	 PROTECTED -> Visível na classe onde são criados ou herdados
	 
	 */
	
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//Método para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Informe seu nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		
		exibirFrase();
	}
	
	//Método para retornar a média
	private double calculoMedia(){
		return (nota1/nota2) / 2;
	}
	
	//Método para exibir uma frase
	private  void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+" obteve média "+calculoMedia());
	}
	
}

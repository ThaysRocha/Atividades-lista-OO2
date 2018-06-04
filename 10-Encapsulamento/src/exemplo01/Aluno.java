package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/* 
	 
	 Encapsulamento -> Visibilidade de atributos e m�todos
	 DEFAULT   -> Vis�vel apenas nas classes no mesmo pacote
	 PUBLIC    -> Vis�vel por qualquer classe (Em qualquer projeto)
	 PRIVATE   -> Vis�vel apenas na classe onde s�o criados
	 PROTECTED -> Vis�vel na classe onde s�o criados ou herdados
	 
	 */
	
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//M�todo para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Informe seu nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		
		exibirFrase();
	}
	
	//M�todo para retornar a m�dia
	private double calculoMedia(){
		return (nota1/nota2) / 2;
	}
	
	//M�todo para exibir uma frase
	private  void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+" obteve m�dia "+calculoMedia());
	}
	
}

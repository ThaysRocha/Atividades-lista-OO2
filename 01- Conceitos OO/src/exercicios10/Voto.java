package exercicios10;

import javax.swing.JOptionPane;

public class Voto {

	
	//Atributos
	int voto = 0;
	int[] votos = new int [4];
	int votoN = 0;
	int[] contV = new int[4];
	int contVN = 0;
	int continuar = 0;
	char pergunta = 'S';
	String[] candidato = new String [4];
	
	String saida = "";
	
	//M�todo para Saber o candidato
	public void obterCandidato(){
		
		for(int i = 0; i < 4; i++){
			candidato[i] = JOptionPane.showInputDialog("Insira qual � o "+(i+1)+"� candidato");
			votos[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira seu voto"));
		}
	}
	
}

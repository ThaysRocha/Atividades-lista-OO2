package exercicios06;

import javax.swing.JOptionPane;

public class Media {

	//Atributos
	String nome = "";
	int sexo = 0;
	int masc, fem = 0;
	int nota1, nota2, nota3, nota4 = 0;
	int media;
	int continuar = 0;
	int situacao;
	boolean valida = false;
	
	//M�todo para obter Dados
	public void obterDados(){
	
		nome = JOptionPane.showInputDialog("Insira o nome do aluno");
		
		valida = false;
		do{
			
		sexo = Integer.parseInt(JOptionPane.showInputDialog("Indique qual o sexo do aluno: \n1)Feminino\n2)Masculino"));
		if((sexo == 1) || (sexo == 2)){
			
			valida = true;
		}

		}while(valida == false);
		
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 1� nota")); 
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 2� nota")); 
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 3� nota")); 
		nota4 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 4� nota")); 
		
	}
	
	//M�todo para pegar a quantidade de sexo feminino e masculino
	public int obterSexo(){
		
		if(sexo == 1){
			fem++;
		}else{
			masc++;
		}
		
		return sexo;
	}
	
	
	//M�todo para verificar a situa��o do aluno
	public int obterSituacao(){
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		
		if(media == 10){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: PARAB�NS!");
		}
		if((media == 9) || (media <= 9.9)){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: �TIMA");
		}else if((media == 8) || (media <= 8.9)){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: BOM!");
		}else if((media == 7) || (media <=7.9)){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: SATISFAT�RIO!");
		}else if((media == 5) || (media <= .9)){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: RECUPERA��O!");
		}else if(media < 5){
			JOptionPane.showMessageDialog(null, "Sua situa��o �: REPROVADO!");
		}
		
		return situacao;
		
	}
	
	//M�todo para exibir dados
	public void exibirDados(){
	
	String msg = "A media do aluno �: "+media;
		   msg+= "\nForam cadastrados:\nMULHERES: "+fem+"\nHOMENS: "+masc;

		   JOptionPane.showMessageDialog(null, msg);
}
	
	//M�todo para Continuar
	public void laco(){
		do{
			obterDados();
			obterSexo();
			obterSituacao();
			exibirDados();
			
			JOptionPane.showConfirmDialog(null, "Continuar?");
			
		}while(continuar == 0);
	}
}

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
	
	//Método para obter Dados
	public void obterDados(){
	
		nome = JOptionPane.showInputDialog("Insira o nome do aluno");
		
		valida = false;
		do{
			
		sexo = Integer.parseInt(JOptionPane.showInputDialog("Indique qual o sexo do aluno: \n1)Feminino\n2)Masculino"));
		if((sexo == 1) || (sexo == 2)){
			
			valida = true;
		}

		}while(valida == false);
		
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 1ª nota")); 
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 2ª nota")); 
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 3ª nota")); 
		nota4 = Integer.parseInt(JOptionPane.showInputDialog("Insira a 4ª nota")); 
		
	}
	
	//Método para pegar a quantidade de sexo feminino e masculino
	public int obterSexo(){
		
		if(sexo == 1){
			fem++;
		}else{
			masc++;
		}
		
		return sexo;
	}
	
	
	//Método para verificar a situação do aluno
	public int obterSituacao(){
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		
		if(media == 10){
			JOptionPane.showMessageDialog(null, "Sua situação é: PARABÉNS!");
		}
		if((media == 9) || (media <= 9.9)){
			JOptionPane.showMessageDialog(null, "Sua situação é: ÓTIMA");
		}else if((media == 8) || (media <= 8.9)){
			JOptionPane.showMessageDialog(null, "Sua situação é: BOM!");
		}else if((media == 7) || (media <=7.9)){
			JOptionPane.showMessageDialog(null, "Sua situação é: SATISFATÓRIO!");
		}else if((media == 5) || (media <= .9)){
			JOptionPane.showMessageDialog(null, "Sua situação é: RECUPERAÇÃO!");
		}else if(media < 5){
			JOptionPane.showMessageDialog(null, "Sua situação é: REPROVADO!");
		}
		
		return situacao;
		
	}
	
	//Método para exibir dados
	public void exibirDados(){
	
	String msg = "A media do aluno é: "+media;
		   msg+= "\nForam cadastrados:\nMULHERES: "+fem+"\nHOMENS: "+masc;

		   JOptionPane.showMessageDialog(null, msg);
}
	
	//Método para Continuar
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

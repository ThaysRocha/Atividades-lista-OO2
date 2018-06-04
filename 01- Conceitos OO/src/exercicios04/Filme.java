package exercicios04;

import javax.swing.JOptionPane;

public class Filme {

	//Atributos
	int idade, voto = 0;
	int crianca, adolesente, adulto = 0;
	int exelente, otimo, bom, regular, ruim = 0;
	int continuar = 0;
	int contador = 0;
	boolean valida = false;
	
	//M�todo para obter dados
	public void obterDados(){
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
		voto = Integer.parseInt(JOptionPane.showInputDialog("O que voc� achou do filme 'Alice no Pa�s das Maravilhas'? Nos diga seu voto:\n1)Exelente\n2)�timo\n3)Bom\n4)Regular\n5)Ruim"));
	}
	
	//M�todo para saber se a pessoa � crian�a, adolecente ou adulta.
	public int verificarIdade(){
		valida = false;
		
	do{
		
	
		if((idade >= 0) && (idade <= 9)){
			crianca++;
		}
		if((idade >= 10) || (idade <= 17)){
			adolesente++;
		}else if(idade >= 18){
			adulto++;
		}
		
		valida = true;
	}while(valida = false);
	
	return idade;
	}
	
	//M�todo para verificar os votos
	public int verificarVoto(){
	do{
		contador++;
		
		if(voto == 1){
			exelente++;
		}
		if(voto == 2){
			otimo++;
		}else if(voto == 3){
			bom++;
		}else if(voto == 4){
			regular++;
		}else if(voto == 5){
			ruim++;
		}
	}while(voto != 9);
	
	return voto;
	}
	
	//M�todo para continuar
	public void laco(){
		do{
			
			obterDados();
			verificarIdade();
			verificarVoto();
			exibirDados();
			
		JOptionPane.showConfirmDialog(null, "Continuar?");
		
		}while(continuar == 0);
		
		
	}

	//M�todo para exibri dados
			public void exibirDados(){
				
				String msg = "Persentual de votos: EXELENTE: "+(100/voto*exelente)+"\n�TIMO: "+(100/voto*otimo)+"\nBOM: "+(100/voto*bom)+" REGULAR: "+(100/voto*regular)+"\nRUIM: "+(100/voto*ruim);
					   msg+= "\n Nessa pesquisa foram cadastradas:\nCrian�as: "+crianca+"\n Adolescentes: "+adolesente+"\nAdultos: "+adulto;
					   
					   JOptionPane.showMessageDialog(null, msg);
			}
	
		
	}


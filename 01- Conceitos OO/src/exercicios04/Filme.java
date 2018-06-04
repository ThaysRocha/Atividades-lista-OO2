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
	
	//Método para obter dados
	public void obterDados(){
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
		voto = Integer.parseInt(JOptionPane.showInputDialog("O que você achou do filme 'Alice no País das Maravilhas'? Nos diga seu voto:\n1)Exelente\n2)Ótimo\n3)Bom\n4)Regular\n5)Ruim"));
	}
	
	//Método para saber se a pessoa é criança, adolecente ou adulta.
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
	
	//Método para verificar os votos
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
	
	//Método para continuar
	public void laco(){
		do{
			
			obterDados();
			verificarIdade();
			verificarVoto();
			exibirDados();
			
		JOptionPane.showConfirmDialog(null, "Continuar?");
		
		}while(continuar == 0);
		
		
	}

	//Método para exibri dados
			public void exibirDados(){
				
				String msg = "Persentual de votos: EXELENTE: "+(100/voto*exelente)+"\nÓTIMO: "+(100/voto*otimo)+"\nBOM: "+(100/voto*bom)+" REGULAR: "+(100/voto*regular)+"\nRUIM: "+(100/voto*ruim);
					   msg+= "\n Nessa pesquisa foram cadastradas:\nCrianças: "+crianca+"\n Adolescentes: "+adolesente+"\nAdultos: "+adulto;
					   
					   JOptionPane.showMessageDialog(null, msg);
			}
	
		
	}


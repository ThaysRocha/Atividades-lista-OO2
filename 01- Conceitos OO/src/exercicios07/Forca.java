package exercicios07;

import javax.swing.JOptionPane;

public class Forca {

	//Atributos
	String letras = "";
	int acertos, erros = 0;
	boolean continuar = false;
	
	//Método para ObterDados
	public void obterDados(){
		
		System.out.println("Vamos começar o jogo!");
		
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("e")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
		continuar = false;
		
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("s")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
			continuar = false;
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("t")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
		continuar = false;
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("uss")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
		continuar = false;
		
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("d")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
		continuar = false;
		
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("a")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
		
		continuar = false;
		
		do{
			letras = JOptionPane.showInputDialog("Escolha uma letra");
			if(letras.equals("r")){
				acertos++;
				JOptionPane.showMessageDialog(null, "Você acertou!");
			}else{
				erros++;
				JOptionPane.showMessageDialog(null, "Você errou! Tente de noo!");
			}
			
			if((acertos == 7) || (erros == 7)){
				continuar = true;
			}
		
		}while(continuar == false);
	}
	
	//Método para exibir dados
	public void exibirDados(){
		
		String msg = "A palavra era:\nESTUDAR! ";
		
		JOptionPane.showMessageDialog(null, msg);
	}
	//Método para continuar
	public void continuar(){
	
	
	obterDados();
	exibirDados();

	}
	
}

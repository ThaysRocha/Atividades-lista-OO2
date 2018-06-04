package exercicios09;

import javax.swing.JOptionPane;

public class Ano {

	//Atributos
	int ano = 0;
	
	//Método para descobrir o ano
	public int ano(){
	
	ano = Integer.parseInt(JOptionPane.showInputDialog("Insira um ano"));
	
	if((ano / 400 == 0) || (ano / 4 == 0)){
		JOptionPane.showMessageDialog(null, "Ano BIXESTO!");
	}else if(ano / 100 != 0){
		JOptionPane.showMessageDialog(null, "Esse ano não é bixesto!");
	}
	
	return ano;
	
	}
}

package exercicios05;

import javax.swing.JOptionPane;

public class Papelaria {

	
	//Atributos
	String produto = "";
	double valor = 0;
	double total = 0;
	double percentual = 0.05;
	int i = 1;
	int quantidade = 0;
	
	
	//Método para pegar dados
	public void obterProdutos(){
		
		
		produto = JOptionPane.showInputDialog("Qual o produto de sua escolha: \n1)Lápis");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu produto?"));
		
	}
	
	//Método para fazer o percentual
	public double obterPercentual(){
		
		//LAÇO
		do{
			
			System.out.println(i+" X "+String.format("%.2f",(valor - valor * percentual))+" = "+String.format("%.2f",((valor - valor * percentual)*i)));

			percentual += 0.05;
			i++;
			
		}while(i <= 10);
		
		return percentual;
	}
	
	
	
	//Método para continuar
	public void laco(){
		int continuar = 0;
		
		do{
			obterProdutos();
			obterPercentual();

			
		}while(continuar == 0);
	}
}

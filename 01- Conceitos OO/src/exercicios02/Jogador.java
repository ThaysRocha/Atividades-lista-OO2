package exercicios02;

import javax.swing.JOptionPane;

public class Jogador {

	//Atributos
	String nome = "";
	String nomeMaiorP, nomeMaiorA, nomeMaiorI = "";
	int	continuar = 0;
	int idade = 0; 
	int maiorI = 0;
	int contador = 0;
	int contador1 = 0;
	double altura, peso = 0;
	double maiorP, maiorA = 0;
	double somaA = 0;
	
	//Método para Obterdados
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Informe o nome do jogador");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do jogador"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do jogador"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do jogador"));
		
	}
	
	//Método para continuar/ Fazer laço
	public void laco(){
	do{
		
	obterDados();	
	confirmarIdade();
	confirmarAltura();
	confirmarPeso();
	exibirDados();
	
	continuar = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
	
	}while(continuar == 0);
	
	}
		
	
	//Método para se sertificar da idade
	public int confirmarIdade(){
	
		contador++;
	if(idade > maiorI){
		maiorI = idade;
		nomeMaiorI = nome;
	}
		return idade;
	}
	
	//Método para se sertificar da altura
	public double confirmarAltura(){
	
		contador1++;
	if(altura > maiorA){
		maiorA = altura;
		nomeMaiorA = nome;
	}
		somaA += altura;
		return altura;
	}
	//Método para se sertificar do peso
	public double confirmarPeso(){
	if(peso > maiorP){
		maiorP = peso;
		nomeMaiorP = nome;
	}
		return peso;
	}
	
	
	//Método para exibir dados
	public void exibirDados(){
		
		String msg = "O número de jogadores cadastrados são: "+contador;
			   msg+= "\nO jogador que tem a maior altura é: "+nomeMaiorA+" medindo: "+maiorA;
			   msg+= "\nO jogador mais velho é: "+nomeMaiorI+" com a idade de: "+maiorI;
			   msg+= "\nO jogador mais pesado é: "+nomeMaiorP+" pesando: "+maiorP;
			   msg+= "\nE a média das alturas cadastradas são: "+(somaA/contador1);
			   
			   JOptionPane.showMessageDialog(null, msg);
	}
	
}

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
	
	//M�todo para Obterdados
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Informe o nome do jogador");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do jogador"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do jogador"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do jogador"));
		
	}
	
	//M�todo para continuar/ Fazer la�o
	public void laco(){
	do{
		
	obterDados();	
	confirmarIdade();
	confirmarAltura();
	confirmarPeso();
	exibirDados();
	
	continuar = JOptionPane.showConfirmDialog(null, "Voc� deseja continuar?");
	
	}while(continuar == 0);
	
	}
		
	
	//M�todo para se sertificar da idade
	public int confirmarIdade(){
	
		contador++;
	if(idade > maiorI){
		maiorI = idade;
		nomeMaiorI = nome;
	}
		return idade;
	}
	
	//M�todo para se sertificar da altura
	public double confirmarAltura(){
	
		contador1++;
	if(altura > maiorA){
		maiorA = altura;
		nomeMaiorA = nome;
	}
		somaA += altura;
		return altura;
	}
	//M�todo para se sertificar do peso
	public double confirmarPeso(){
	if(peso > maiorP){
		maiorP = peso;
		nomeMaiorP = nome;
	}
		return peso;
	}
	
	
	//M�todo para exibir dados
	public void exibirDados(){
		
		String msg = "O n�mero de jogadores cadastrados s�o: "+contador;
			   msg+= "\nO jogador que tem a maior altura �: "+nomeMaiorA+" medindo: "+maiorA;
			   msg+= "\nO jogador mais velho �: "+nomeMaiorI+" com a idade de: "+maiorI;
			   msg+= "\nO jogador mais pesado �: "+nomeMaiorP+" pesando: "+maiorP;
			   msg+= "\nE a m�dia das alturas cadastradas s�o: "+(somaA/contador1);
			   
			   JOptionPane.showMessageDialog(null, msg);
	}
	
}

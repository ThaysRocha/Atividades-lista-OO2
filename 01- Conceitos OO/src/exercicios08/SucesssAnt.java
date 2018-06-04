package exercicios08;

import javax.swing.JOptionPane;

public class SucesssAnt {

	//Atributos
	int num = 0;
	/*int antecessor1 = -1;
	int antecessor2 = -2;
	int antecessor3 = -3;
	int antecessor4 = -4;
	int antecessor5 = -5;
	int antecessor6 = -6;
	int antecessor7 = -7;
	int antecessor8 = -8;
	int antecessor9 = -9;
	int antecessor10 = -10;
	int sucessor1 = +1;
	int sucessor2 = +2;
	int sucessor3 = +3;
	int sucessor4 = +4;
	int sucessor5 = +5;
	int sucessor6 = +6;
	int sucessor7= +7;
	int sucessor8 = +8;
	int sucessor9 = +9;
	int sucessor10 = +10;
	*/
	//Método para obter numero
	public void obterNumero(){
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para saber os seus 10 antecessores e 10 sucessores"));
		
	}
	
	//Método para saber o antecessor
	public int[] obterAntecessor(){
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < 10; i++){
			
			numeros[i] = (num-(i+1));
			
		}
		
		return numeros;
		
	}
	
	public void exibirAntecessor(){
		
		for(int i=0; i<10; i++){
			System.out.println(obterAntecessor()[i]);
		}
		
	}
	
	//Método para saber o sucessor
	public int[] obterSucessor(){
		
		int[] numero = new int [10];
		
		for(int indice = 0; indice < 10; indice++){
			
			numero[indice] = (num+(indice+1));
			
			
		}
		
		return numero;
	}
	
	//Método para exibri Sucessores
	public void exibirSucessor(){
		
		for(int indice = 0; indice < 10; indice++){
			System.out.println(obterSucessor()[indice]);
		}
		
	}

	
}

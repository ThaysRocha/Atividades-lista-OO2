package exemplo02;

import javax.swing.JOptionPane;

public class Notas {

	//Atributos
	protected int nota1, nota2, nota3;
	
	//Construtor
	public Notas(int nota1, int nota2, int nota3){
	
	//Inicializar
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nota3 = nota3;
	
	//Mensagem
	JOptionPane.showMessageDialog(null,	"Construtor executado");
	
	
	}
	
	//Método para retornar a média
	protected double media(){
		
		//Cauculo
		double media = (nota1/nota2/nota3)/3;
		
		//Retornar
		return media;
	}
}

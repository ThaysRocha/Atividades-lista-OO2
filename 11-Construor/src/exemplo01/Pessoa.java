package exemplo01;

public class Pessoa {

	//Construtos #01
	public Pessoa(){
		System.out.println("BOA TARDE!");
	}
	
	//Construtor #02
	public Pessoa(String nome){
		System.out.println("Boa Tarde! "+nome);
		
	}
	
	//Construtos #3
	public Pessoa(String nome, int hora){
		
		if(hora < 10){
			System.out.println("Boa Dia "+nome);
		}else if(hora < 18){
			System.out.println("Boa noite "+nome);
		}
	}
}


package projeto;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar
		Cargo c = new Cargo();
		c.imposto(2000);
		c.mensagem();
		
		/*//Instanciar
		Cargo c = new Analista();
		c.imposto(2000);
		c.mensagem();
		
		Quando se faz isso o polimorfismo sobresai do cargo*/

	}

}

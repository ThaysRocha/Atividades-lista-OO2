package exercicios03;

import javax.swing.JOptionPane;

public class Lanchonete {

	//Atributos
	int pedido = 0;
	int HamburguerESucoDeLaranja, sandu�cheNaturalESucoDeUva, pratoDoDia, pizza, lasanha, p�oDeQueijo, bolo = 0;
	int quantidade = 0;
	int continuar = 0;
	double valor = 0;
	double total = 0;
	double troco = 0;
	double dinheiro = 0;
	
	
	//M�todo para pegar Pedido
	public void obterPedido(){
		
		//Pedido
		pedido = Integer.parseInt(JOptionPane.showInputDialog("Fa�a seu pedido: 1) Hamburguer E Suco De Laranja\n2)Sandu�che Natural E Suco De Uva,\n3)Prato Do Dia,\n4)Pizza,\n5)Lasanha,\n6)P�o De Queijo,\n7)Bolo"));
		if(pedido == 1){
			valor = 5;
		}
		if(pedido == 2){
			valor = 4.5;
		}else if(pedido == 3){
			valor = 8;
		}else if(pedido == 4){
			valor = 12;
		}else if(pedido == 5){
			valor = 16.5;
		}else if(pedido == 6){
			valor = 1;
		}else if(pedido == 7){
			valor = 2.5;
		}
		
		 //Pegar a quantidade que foi pedido
	
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que voc� deseja do seu pedido"));
		
		total = quantidade*valor;
	}
	
		//M�todo para fazer o troco do pedido
		public void calcularTroco(){
		
		dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor com o qual voc� esst� pagando"));
		
			troco = dinheiro-total;
		}
		
		//M�todo para exibir os dados.
		public void exibirDados(){
		String msg = "O valor da compra foi: R$"+total;
			   msg+= "O seu troco �: R$"+troco;
		
		JOptionPane.showMessageDialog(null, msg);
	
		}
		
		//M�todo para continuar
		public void laco(){
		
			do{
				
			obterPedido();
			calcularTroco();
			exibirDados();
			
			}while(continuar == 0);
		}
	
	
}

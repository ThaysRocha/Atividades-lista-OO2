package exercicios01;

import javax.swing.JOptionPane;

public class Pessoa {

	
			//Atributos
			String nome;
			int sexo, idade;
			int fem = 0, masc = 0;
			int menorIdade = 0, maiorIdade = 0;
			int cargo = 0;
			int gerente, atendente, acogueiro, secretaria, almocharife, padeiro, estagiario;
			boolean valida = false;
			

			//M�todo para realizar la�o
			public void obterDados1(){
				
					//ObterDados
				nome = JOptionPane.showInputDialog("Insira seu nome");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
				sexo = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu sexo? Digite: \n1)Mulher\n2)Homen"));
				cargo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu cargo: 1)gerente,"+gerente+"\n2)atendente,"+atendente+"\n3)acogueiro,"+acogueiro+"\n4)secretaria,"+secretaria+"\n5)almocharife,"+almocharife+"\n6)padeiro,"+padeiro+"\n7)estagiario"+estagiario));
				
				}
			
			public int contabilizarIdade(){
				//Verificando Idade
				if(idade < 18){
					menorIdade++;
				}else{
					maiorIdade++;
				}
				
				return idade;
			}
			
						
				//M�todo para pegar o sexo
				public int contabilizarSexo1(){
					
				//Verificando Sexo
				valida = false;
				do{	
				
				if((sexo == 1) || (sexo == 2)){
					valida = true;
				}	
				}while(valida = false);

					//Verificando o sexo
				if(sexo == 1){
					fem++;
				}else{
					masc++;
				}
				return sexo;
			}
				//M�todo para Obter cargo
				public int contabilizarCargo(){
					
					//Cargo
					valida = false;
					do{
						if((cargo == 1) || (cargo == 2) || (cargo == 3) || (cargo == 4) || (cargo == 5) || (cargo == 6) || (cargo == 7)){
							valida = true;
						
					}while
						(valida = false);
					if(cargo == 1){
						gerente++;
						break;
					}else if(cargo == 2){
						atendente++;
						break;
					}else if(cargo == 3){
						acogueiro++;
						break;
					}else if(cargo == 4){
						secretaria++;
						break;
					}else if(cargo == 5){
						almocharife++;
						break;
					}else if(cargo == 6){
						padeiro++;
						break;
					}else if(cargo == 7){
						estagiario++;
						break;
					}
					
					}while(cargo != 1);
					
					return cargo;
				
				}
				
				//M�todo para Continuar
				public void laco(){	
				
				//Variavel Continuar
				int continuar;;
							
				//La�o
				do{
					obterDados1();
					contabilizarIdade();
					contabilizarSexo1();
					contabilizarCargo();
					exibirDados1();
					
				continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
				
				}while(continuar == 0);
				
				}
				
				//M�todo para exibir Dados
				public void exibirDados1(){
					
					String msg= "O n�mero de pessoas cadastradas do sexo feminino s�o: "+fem+" E o do sexo Masculino s�o: "+masc;
						   msg+="\nAs pessoas cadastradas Maiores de idade s�o: "+maiorIdade+" E as de menor Idade: "+menorIdade;
						   msg+="\nNos cargos tem: Gerente: "+gerente+"\nAtendente: "+atendente+"\nA�ogueiro: "+acogueiro+" Secret�ria: "+secretaria+" Almocharife: "+almocharife+" Padeiro: "+padeiro+" Estagi�rio: "+estagiario;
				}


	

		

}

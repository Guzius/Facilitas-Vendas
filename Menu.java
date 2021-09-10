package ProjetoMaquinaDeVendas-master;

import ProjetoMaquinaDeVendas2.VetorProduto;

import java.util.Scanner;

public class Menu extends VetorProduto {
	
	private int op;
	
	public Menu(int op)
	{
		this.op = op;
	}
	
	
	
	public int getOp() {
		return op;
	}



	public void setOp(int op) {
		this.op = op;
	}



	public void menuOpcoes()
	{
		String carrinho[] = new String[10];
		int totalPagar=0;
		int x=0;
		
		Scanner leia = new Scanner(System.in);
		while(op==2)
		{
			System.out.println("\n\t\t***Escolha sua op��o***");
			System.out.println("\n1--Refrigerante \n2-- Chocolate \n3-- �gua \n4-- Energ�tico \n5-- M&M's");
			op = leia.nextInt();
			
			while(op<1 || op>5)
			{
				System.out.println("\nOp��o Invalida!! Entre com uma nova op��o: ");
				op = leia.nextInt();
			}
		
	
		switch(op)
		{
			case 1:
				carrinho[x] = "Refrigerante";
				totalPagar+=3;
				x++;
				break;
			case 2:
				carrinho[x] = "Chocolate";
				totalPagar+=3.99;
				x++;
				break;
			case 3:
				carrinho[x] = "�gua";
				totalPagar+=2;
				x++;
				break;
			case 4:
				carrinho[x] = "Energ�tico";
				totalPagar+=3.50;
				x++;
				break;
			case 5:
				carrinho[x] = "M&M's";
				totalPagar+=7.99;
				x++;
				break;
				
			default:
				System.out.println("\nOp��o Inv�lida!!!");
				
		}
		System.out.println("\n\t\t***Deseja comprar continuar compra?*** \n1-- Sim \n2-- N�o");
		op = leia.nextInt();
		}

		
	}


}

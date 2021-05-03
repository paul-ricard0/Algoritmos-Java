import java.util.Scanner;

public class Exer26 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		double preco, venda;
		String nome;

		System.out.print("Entre com o nome do produto: ");
		nome = scn.nextLine();

		System.out.print("Qual o valor de compra do produto? ");
		preco = scn.nextDouble();

		if (preco < 100){
			venda = preco + (preco * 0.7);
		}
		else if (preco < 200){
			venda = preco + (preco * 0.5);
		}
		else{
			venda = preco + (preco * 0.3);
		}

		System.out.println("O preço de venda ideal é de " + venda);
	}
}
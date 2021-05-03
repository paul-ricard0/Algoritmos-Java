import java.util.Scanner;

public class Exer11{

	public static void main (String[] args){

		Scanner scn = new Scanner(System.in);

		double custo_consumidor, custo_fabrica, custo_distribuidor, impostos;



		System.out.println("Qual o custo de fabrica do carro que deseja?");

		custo_fabrica=scn.nextDouble();

		custo_distribuidor= custo_fabrica * 0.12;

		impostos= custo_fabrica * 0.45;

		custo_consumidor= custo_fabrica + custo_distribuidor + impostos;

		System.out.println("O custo do consumidor é de " + custo_consumidor + " sem o seu lucro");

		double lucro5, lucro10, lucro15, lucro20, lucro25;

		lucro5 = (custo_consumidor * 0.05) + custo_consumidor;
		lucro10 = (custo_consumidor * 0.1) + custo_consumidor;
		lucro15 = (custo_consumidor * 0.15) + custo_consumidor;
		lucro20 = (custo_consumidor * 0.20) + custo_consumidor;
		lucro25 = (custo_consumidor * 0.25) + custo_consumidor;


		System.out.println("...");
		System.out.println("Adicionando um lucro de 5%: " + lucro5);
		System.out.println("Adicionando um lucro de 10%: " + lucro10);
		System.out.println("Adicionando um lucro de 15%: " + lucro15);
		System.out.println("Adicionando um lucro de 20%: " + lucro20);
		System.out.println("Adicionando um lucro de 25%: " + lucro25);



	}
}
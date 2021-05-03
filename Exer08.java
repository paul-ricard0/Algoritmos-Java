import java.util.Scanner;

public class Exer08 {

    public static void main (String[] args){

    	Scanner scn = new Scanner(System.in);

    	double nota1, nota2, nota3, result;

    	System.out.println("Entre com suas 3 notas:" );

    	nota1=scn.nextDouble();
    	nota2=scn.nextDouble();
    	nota3=scn.nextDouble();

    	result=(nota1 + nota2 + nota3) / 3;

    	System.out.printf("A média da suas notas é: " + result);
    }


}
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

		System.out.println("O custo do consumidor é de " + custo_consumidor);


	}

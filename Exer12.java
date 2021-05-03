import java.util.Scanner;

public class Exer12{

	public static void main (String[] args){

		Scanner scn = new Scanner(System.in);

		double num;

		System.out.println("Entre com um número:");

		num = scn.nextDouble();

		if(num>0){
			System.out.println("O valor do número é positivo");
		}
		else{
			System.out.println("O valor do número é negativo");
		}
	}
}
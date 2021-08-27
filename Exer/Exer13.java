import java.util.Scanner;

public class Exer13{

	public static void main (String[] args){

		Scanner scn = new Scanner(System.in);

		double num;

		System.out.println("Entre com um número:");

		num = scn.nextDouble();

		if (num>0){
			System.out.println("positivo");
		}
		else if (num == 0){
			System.out.println("nulo");
		}
		else{
			System.out.println("negativo");
		}


	}
}
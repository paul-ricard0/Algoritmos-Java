import java.util.Scanner;

public class Exer14{

	public static void main (String[] args){

		Scanner scn = new Scanner(System.in);

		double num;

		System.out.println("Entre com um número:");

		num = scn.nextDouble();

		if (num == 0){
			System.out.println("nulo");
		}
		else if (num % 2 == 0){
			System.out.println("par");
		}
		else{
			System.out.println("impar");
		}
	}
}
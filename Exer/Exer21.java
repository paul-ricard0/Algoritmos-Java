import java.util.Scanner;

public class Exer21 {

	public static void main (String []args){

		Scanner scn = new Scanner (System.in);

		int a, b, result;

		System.out.println("Entre com números inteiros para serem somados: ");
		a = scn.nextInt();
		b = scn.nextInt();
		result = a+b;
		if ( result > 10){
			System.out.print("A soma dos números é " + result);
		}
		else{
			System.out.println("A soma é menor que 10");
		}
	}
}
import java.util.Scanner;

public class Exer22 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		Double A, B, C;

		System.out.println("Entre com dois números: ");
		A = scn.nextDouble();
		B = scn.nextDouble();

		if ( A == B){
			C = A+B;
			System.out.println("A soma de " + A + " + " + B + "é igual a " + C);
		}
		else {
			C = A * B;
			System.out.println("A mutiplicação de " + A + " + " + B + "é igual a " + C);
		}


	}
}
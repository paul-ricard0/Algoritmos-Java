import java.util.Scanner;

public class Exer22 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		Double A, B, C;

		System.out.println("Entre com dois n�meros: ");
		A = scn.nextDouble();
		B = scn.nextDouble();

		if ( A == B){
			C = A+B;
			System.out.println("A soma de " + A + " + " + B + "� igual a " + C);
		}
		else {
			C = A * B;
			System.out.println("A mutiplica��o de " + A + " + " + B + "� igual a " + C);
		}


	}
}
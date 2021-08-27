import java.util.Scanner;

public class Exer23 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		double a, b;

		System.out.print("Entre com dois números: ");
		a = scn.nextDouble();
		b = scn.nextDouble();

		if (a < b){
			System.out.println("Em ordem crescente " + a + " + " + b);
		}
		else{
			System.out.println("Em ordem crescente " + b + " e " + a);
		}
	}
}
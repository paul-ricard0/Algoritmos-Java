import java.util.Scanner;

public class Exer16 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		int num;

		System.out.println("Entre com um número: ");

		num = scn.nextInt();

		if (num % 5 == 0){
			System.out.println("É divisivel por 5");
		}
		else {
			System.out.println("Não é divisivel por 5");
		}
	}
}
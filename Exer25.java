import java.util.Scanner;

public class Exer25 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		int idade;

		System.out.println("Entre com a idade da pessoa: ");
		idade = scn.nextInt();

		if (idade < 18){
			System.out.println("Menor de idade");
		}
		else if (idade < 65){
			System.out.println("Maior de idade");
		}
		else{
			System.out.println("Idoso");
		}
	}
}
import java.util.Scanner;

public class Exer19 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		int idade;

		System.out.println("Entre com sua idade: ");
		idade=scn.nextInt();

		if(idade < 16) {
			System.out.println("N�o eleitor");
		}
		else if(idade >= 18 && idade <= 65){
			System.out.println("eleitor obrigat�rio");
		}
		else{
			System.out.println("eleitor facultativo");
		}
	}
}
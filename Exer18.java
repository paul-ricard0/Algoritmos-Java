import java.util.Scanner;

public class Exer18 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		double salario;

		System.out.println("Entre com o seu salário atual: ");
		salario=scn.nextDouble();


		if(salario < 500){
			System.out.println("O valor acresentado é de " + (salario * 0.15));
			System.out.println("Então o valor do novo salário é igual a " + (salario+(salario * 0.15)));
		}
		else if (salario >= 500 && salario <= 1000) {
			System.out.println("O valor acrescentado é de " + (salario * 0.1));
			System.out.println("Então o valor do novo salário é igual a " + (salario + (salario * 0.1)));
		}
		else{
			System.out.println("O valor acrescentado é de " + (salario * 0.05));
			System.out.println("Então o valor do novo salário é igual a " + (salario + (salario * 0.05)));
		}

	}
}

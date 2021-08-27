import java.util.Scanner;

public class Exer20 {

	public static void main (String[] args) {

		Scanner scn = new Scanner (System.in);

		double a, b, c;
		String nome;

		System.out.println("Entre com os 3 lados do triangulo: ");
		a = scn.nextDouble();
		b = scn.nextDouble();
		c = scn.nextDouble();


		if (a < (b+c) && b<(c+a) && c<(a+b)){

			if (a == b && a == c){
				nome = "Equil�tero";
			}
			else if (a == b || b == c || a == c){
				nome = "Is�sceles";
			}
			else {
				nome = "Escaleno";
			}

			System.out.print("Com os dados " + a + ", " + b + " e " + c + " � poss�vel construir um triangulo " + nome);


		}
		else {
			System.out.println("Imposs�vel constrir um triangulo com esses dados!!!");
			System.out.println("Para um triangulo existir a medida de um lado sempre � menor que a soma dos outros dois lados");
		}
	}
}
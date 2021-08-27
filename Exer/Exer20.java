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
				nome = "Equilátero";
			}
			else if (a == b || b == c || a == c){
				nome = "Isósceles";
			}
			else {
				nome = "Escaleno";
			}

			System.out.print("Com os dados " + a + ", " + b + " e " + c + " é possível construir um triangulo " + nome);


		}
		else {
			System.out.println("Impossível constrir um triangulo com esses dados!!!");
			System.out.println("Para um triangulo existir a medida de um lado sempre é menor que a soma dos outros dois lados");
		}
	}
}
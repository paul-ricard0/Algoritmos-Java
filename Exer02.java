import java.util.Scanner;

public class Exer_02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double num, quadrado;

		System.out.println("Entre com um n�mero para calcular seu quadrado");
		num=entrada.nextDouble();

		quadrado = Math.pow(num,2);
		System.out.println("O quadrado no n�mero " + num + " �: " + quadrado);

	}
}
import java.util.Scanner;

public class Exer_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double num, quadrado;

		System.out.println("Entre com um n�mero para calcular seu quadrado e sua raiz: ");
		num=entrada.nextDouble();

		quadrado = Math.pow(num,2);
		double raiz = Math.sqrt(num);

		System.out.println("O quadrado do n�mero " + num + " � " + quadrado);
		System.out.println("o raiz quadrada do n�mero " + num + " � " + raiz);
	}
}
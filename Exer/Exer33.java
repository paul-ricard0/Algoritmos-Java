import java.util.Scanner;

public class Exer33 {

    public static void main (String[]args){

		Scanner scan = new Scanner (System.in);

		float num1, num2, num3, num4, num5, soma;

		System.out.printf("Entre com valor do primeiro n�mero: ");
		num1 = scan.nextFloat();

		System.out.printf("Entre com valor do segundo n�mero: ");
		num2 = scan.nextFloat();

		System.out.printf("Entre com valor do terceiro n�mero: ");
		num3 = scan.nextFloat();

		System.out.printf("Entre com valor do quarto n�mero: ");
		num4 = scan.nextFloat();

		System.out.printf("Entre com valor do quinto n�mero: ");
		num5 = scan.nextFloat();

		soma = num1 + num2 + num3 + num4 + num5;

		System.out.printf("\nA soma dos n�meros � %.2f", soma);

		System.out.printf("\nA m�dia dos n�meros �: %.2f", (soma/5));

		System.out.printf("\nO dobro dos n�meros �: %.2f, %.2f, %.2f, %.2f e %.2f", (num1*2), (num2*2), (num3*2), (num4*2), (num5*2));

    }


}
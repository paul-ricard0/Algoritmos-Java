import java.util.Scanner;

public class Exer33 {

    public static void main (String[]args){

		Scanner scan = new Scanner (System.in);

		float num1, num2, num3, num4, num5, soma;

		System.out.printf("Entre com valor do primeiro número: ");
		num1 = scan.nextFloat();

		System.out.printf("Entre com valor do segundo número: ");
		num2 = scan.nextFloat();

		System.out.printf("Entre com valor do terceiro número: ");
		num3 = scan.nextFloat();

		System.out.printf("Entre com valor do quarto número: ");
		num4 = scan.nextFloat();

		System.out.printf("Entre com valor do quinto número: ");
		num5 = scan.nextFloat();

		soma = num1 + num2 + num3 + num4 + num5;

		System.out.printf("\nA soma dos números é %.2f", soma);

		System.out.printf("\nA média dos números é: %.2f", (soma/5));

		System.out.printf("\nO dobro dos números é: %.2f, %.2f, %.2f, %.2f e %.2f", (num1*2), (num2*2), (num3*2), (num4*2), (num5*2));

    }


}
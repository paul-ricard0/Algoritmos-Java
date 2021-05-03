import java.util.Scanner;

public class Exer09 {

	public static void main (String[] args){

		Scanner scn = new Scanner(System.in);

		double altura, base, area;

		System.out.println("Escreva a altura do triangulo em cm:");
		altura=scn.nextDouble();

		System.out.println("Agora escreva a base do triangulo em cm:");
		base=scn.nextDouble();

		area = (base * altura) / 2;

		System.out.println("A área do triangulo é: " + area);
	}
}
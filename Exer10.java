import java.util.Scanner;

public class Exer10 {

	public static void main (String[] args) {

		Scanner scn = new Scanner(System.in);

		double  CM, dist, vol;

		System.out.println("Qual a distancia percorida em Km/h? ");
		dist=scn.nextDouble();

		System.out.print("Qual a quantidade de combust�vel foi gasto em litros? ");
		vol=scn.nextDouble();

		CM = dist / vol;

		System.out.print("O consumo m�dio de comnust�vel gasto por Km foi de: " + CM);


	}
}
import java.util.Scanner;
public class Aula01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int valA, valB, valSoma;
		System.out.println("entre com dois números para serem somados");

		valA = ler.nextInt();
		valB = ler.nextInt();
		valSoma = valA + valB;

		System.out.println("O valor da adição é: " + valSoma);
	}
}
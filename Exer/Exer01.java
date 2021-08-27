import java.util.Scanner;
public class Exer_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		String nome;
		int idade;
		float peso;

		System.out.print("Entre com o seu nome ");
		nome=ler.nextLine();

		System.out.print("Entre com sua idade ");
		idade=ler.nextInt();

		System.out.print("Entre com seu peço "); // use na hora de digitar o peso com casas decimais e virgula
		peso=ler.nextFloat();


		// imprimindo agora os valores
		System.out.println();
		System.out.println("Nome; " + nome + " idade: " + idade);
		System.out.printf("Peso; %.2f ", peso);
	}
}
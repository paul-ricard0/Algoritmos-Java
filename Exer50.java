import java.util.Scanner;

public class Exer50 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

		String nome = "";
		int qtd=0;
    	float preco=0, valtotal=0, total=0;

		while(!"FIM".equals(nome)){

			System.out.print("Qual o nome do produto? ");
			nome = scan.nextLine();

			System.out.print("Qual o preço? ");
			preco = scan.nextFloat();

			System.out.print("Qual a quantidade? ");
			qtd = scan.nextInt();

			total += (preco * qtd);

			scan = new Scanner (System.in);
			System.out.println("Deseja comprar mais alguma coisa? [FIM] para finalizar");
			nome = scan.nextLine();

		}

		System.out.printf("Total foi: %.2f", total);
    }


}
import java.util.Scanner;

public class Exer52 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int x=0, qtdH=0, qtdM=0, idade, totIdade=0;
		float mediaH=0, mediaM=0, peso, totPeso=0;
		String genero=" ";

    	System.out.println("======= Digite [-1] para encerrar =========");

		while(x!=1){

			scan = new Scanner (System.in);
			System.out.println("Qual o gênero? [H/M] ");
			genero = scan.nextLine();
			System.out.println("Qual a idade? ");
			idade = scan.nextInt();
			System.out.println("Qual o peso? ");
			peso = scan.nextFloat();

			if("H".equals(genero)|| "h".equals(genero)){
				qtdM++;
				totIdade += idade;
			}
			if("M".equals(genero)|| "m".equals(genero)){
				qtdM++;
				totPeso += peso;
			}

			System.out.println("\n[1] para finalizar \n[0] para continaur \nQuer continuar? ");
			x = scan.nextInt();
		}
		mediaH = totIdade / qtdH;
		mediaM = totPeso / qtdM;
		System.out.printf("Total homens: %s \nTotal mulher: %s \nMédia das idades dos homens: %.2f \nMédia dos pesos das mulheres: %.2f", qtdH, qtdM, mediaH, mediaM);
    }
}
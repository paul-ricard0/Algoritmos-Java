import java.util.Scanner;

public class Exer48 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int x=0, qtdPar=0, qtdImpar=0;

    	System.out.println("======= Digite [-1] para encerrar =========");

		while(x!=-1){

			System.out.print("Entre com o número: ");
			x = scan.nextInt();

			if((x % 2) == 0){
				qtdPar++;
			}
			else{
				qtdImpar++;
			}
		}
    	qtdImpar--;

    	System.out.printf("\nQuantidade de números Pares: %s", qtdPar);
    	System.out.printf("\nQuantidade de números Impares: %s", qtdImpar);

    }


}
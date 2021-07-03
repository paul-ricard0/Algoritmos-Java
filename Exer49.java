import java.util.Scanner;

public class Exer49 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int x=1, somaP=0, somaN=0;

    	System.out.println("======= Digite [0] para encerrar =========");

		while(x!=0){

			System.out.print("Entre com o número: ");
			x = scan.nextInt();

			if(x > 0){
				somaP++;
			}
			else{
				somaN++;
			}
		}
		somaN--;

    	System.out.printf("\nQuantidade de números Positivos: %s", somaP);
    	System.out.printf("\nQuantidade de números Negativos: %s", somaN);

    }


}
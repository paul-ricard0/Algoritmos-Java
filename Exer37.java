import java.util.Scanner;


public class Exer37 {

    public static void main (String[]args){

		Scanner scan = new Scanner (System.in);

		float newNum, numPar = 0, numImpar = 0, counter = 0;
		int counterPar = 0, counterImpar = 0;

		while(counter<10){

			if(counter==0){
				System.out.printf("Entre com 10 números: ");
				newNum = scan.nextFloat();
			}
			else{
    			System.out.printf("\nEntre com mais um número: ");
    			newNum = scan.nextFloat();
			}


			if((newNum % 2) == 0){
				numPar= numPar + newNum;
				counterPar++;
			}
			else{
				numImpar= numImpar + newNum;
				counterImpar++;8
			}

			counter++;

			System.out.printf("\nVocê já entro com %.0f", counter);
		}

		System.out.printf("\n \nSão %d números pares e sua soma é %.0f", counterPar, numPar);

		System.out.printf("\n \nSão %d números impares e sua soma é %.0f", counterImpar, numImpar);
    }


}
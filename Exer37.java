import java.util.Scanner;


public class Exer37 {

    public static void main (String[]args){

		Scanner scan = new Scanner (System.in);

		float newNum, numPar = 0, numImpar = 0, counter = 0;
		int counterPar = 0, counterImpar = 0;

		while(counter<10){

			if(counter==0){
				System.out.printf("Entre com 10 n�meros: ");
				newNum = scan.nextFloat();
			}
			else{
    			System.out.printf("\nEntre com mais um n�mero: ");
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

			System.out.printf("\nVoc� j� entro com %.0f", counter);
		}

		System.out.printf("\n \nS�o %d n�meros pares e sua soma � %.0f", counterPar, numPar);

		System.out.printf("\n \nS�o %d n�meros impares e sua soma � %.0f", counterImpar, numImpar);
    }


}
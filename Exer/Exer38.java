import java.util.Scanner;


public class Exer38 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int newNum, numPos = 0, numNeg = 0, counter = 0, counterPos = 0, counterNeg = 0;

    	while (counter <= 15){

    		if(counter==0){
				System.out.print("Entre com 15 números: ");
				newNum = scan.nextInt();
			}
			else{
    			System.out.print("\nEntre com mais um número: ");
    			newNum = scan.nextInt();
			}


			if(newNum == 0){

				System.out.print("\nNúmero Inválido!!!!!!!!!!!\n");
				counter--;
			}
			else if((newNum % 2) == 0){
				numPos = numPos + newNum;
				counterPos++;
			}
			else{
				numNeg = numNeg + newNum;
				counterNeg++;
			}

			counter++;

			System.out.printf("\nVocê já entro com %d", counter);
    	}


		System.out.printf("\n \nSão %d números pares e a soma desses números é %d", counterPos, numPos);

		System.out.printf("\n \nSão %d números impares e a soma desses números é %d", counterNeg, numNeg);
    }


}
import java.util.Scanner;


public class Exer38 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int newNum, numPos = 0, numNeg = 0, counter = 0, counterPos = 0, counterNeg = 0;

    	while (counter <= 15){

    		if(counter==0){
				System.out.print("Entre com 15 n�meros: ");
				newNum = scan.nextInt();
			}
			else{
    			System.out.print("\nEntre com mais um n�mero: ");
    			newNum = scan.nextInt();
			}


			if(newNum == 0){

				System.out.print("\nN�mero Inv�lido!!!!!!!!!!!\n");
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

			System.out.printf("\nVoc� j� entro com %d", counter);
    	}


		System.out.printf("\n \nS�o %d n�meros pares e a soma desses n�meros � %d", counterPos, numPos);

		System.out.printf("\n \nS�o %d n�meros impares e a soma desses n�meros � %d", counterNeg, numNeg);
    }


}
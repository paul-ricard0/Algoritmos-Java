import java.util.Scanner;

public class Exer34 {

    public static void main (String[]args){

    	Scanner scan = new Scanner (System.in);

    	float newNum=0, numPositive=0, numNegative=0, counter=0;

    	while(counter < 10f){

			if(counter == 0){
    			System.out.printf("Entre com 10 números: ");
    			newNum = scan.nextFloat();
			}
			else{
				System.out.printf("Entre com mais um número: ");
    			newNum = scan.nextFloat();
			}


    		if(newNum > 0){
    			numPositive = numPositive + newNum;
    		}
    		else if(newNum < 0){
    			numNegative = numNegative + newNum;
    		}
    		else{
    			newNum = 0;
    		}

			counter++;

    		System.out.printf("Já entrou com %.0f\n", counter);

    	}

    	System.out.printf("\nA soma dos número postivos é %.2f \n  \nA soma dos números negativos é %.2f \n", numPositive, numNegative);


    }


}
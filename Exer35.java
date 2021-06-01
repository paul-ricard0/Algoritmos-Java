import java.util.Scanner;


public class Exer35 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	float newNum=0, numMenor=0, numMaior=0, counter=0;

    	while(counter<10){

    		if(counter==0f){
    			System.out.printf("Entre com 10 números: ");
    			newNum = scan.nextFloat();
    		}
    		else{
    			System.out.printf("\nEntre com mais um número: ");
    			newNum = scan.nextFloat();
    		}

    		if(newNum < 40){
    			numMenor = numMenor + newNum;
    		}
    		else{
    			numMaior = numMaior + newNum;
    		}

    		counter++;

    		System.out.printf("\nVocê já entro com %.0f", counter);
    	}

    	System.out.printf("\n \nA soma dos números menores que 40 é %.2f\n \nE a soma do números maiores que 40 é %.2f", numMenor, numMaior);
    }


}
import java.util.Scanner;


public class Exer35 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	float newNum=0, numMenor=0, numMaior=0, counter=0;

    	while(counter<10){

    		if(counter==0f){
    			System.out.printf("Entre com 10 n�meros: ");
    			newNum = scan.nextFloat();
    		}
    		else{
    			System.out.printf("\nEntre com mais um n�mero: ");
    			newNum = scan.nextFloat();
    		}

    		if(newNum < 40){
    			numMenor = numMenor + newNum;
    		}
    		else{
    			numMaior = numMaior + newNum;
    		}

    		counter++;

    		System.out.printf("\nVoc� j� entro com %.0f", counter);
    	}

    	System.out.printf("\n \nA soma dos n�meros menores que 40 � %.2f\n \nE a soma do n�meros maiores que 40 � %.2f", numMenor, numMaior);
    }


}
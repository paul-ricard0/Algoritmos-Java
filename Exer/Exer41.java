import java.util.Scanner;

public class Exer41 {

    public static void main (String[]aargs) {

    	Scanner scan = new Scanner (System.in);

    	int counter, counterP=0, counterI=0;
    	float num, averageP=0, averageI=0, average;

    	for(counter=1; counter <= 5; counter++){

    		if(counter==1){
    			System.out.print("Enter 5 numbers: ");
    			num=scan.nextFloat();
    		}
    		else{
    			System.out.printf("Enter with the %dº number: ", counter);
    			num=scan.nextFloat();
    		}

    		if(num != 0){
    			if((num % 2) == 0){
    				averageP += num;
    				counterP ++;
    			}
    			else{
    				averageI += num;
    				counterI ++;
    			}
    		}
    	}

    	average = averageP / counterP;
    	System.out.printf("\nA média dos números pares é: %.2f", average);

    	average = averageI / counterI;
    	System.out.printf("\nA média dos números impares é: %.2f", average);

    }
}



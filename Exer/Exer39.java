import java.util.Scanner;

public class Exer39 {

    public static void main (String[]args) {

    	Scanner scan= new Scanner (System.in);

    	int i, num, par=0, impar=0, somaP=0, somaM=0;


    	for(i=1; i<=4; i++){

    		System.out.println("Entre com um número: ");
    		num=scan.nextInt();

    		if (num !=0){

    			if ((num%2) == 0){
    				par++;
    				somaP += num;
    			}
    			else{
    				impar++;
    				somaM += num;
    			}
    		}
    		else{
    			i--;
    		}
    	}

    	System.out.printf("Quatidade de números pares de %d \nE a soma é %d", par, somaP);
    	System.out.printf("\nQuatidade de números impares de %d \nE a soma é %d", impar, somaM);

    }
}
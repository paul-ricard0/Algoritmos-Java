import java.util.Scanner;


public class Exer45 {

    public static void main (String[]args){

    	Scanner scan = new Scanner (System.in);

    	int cont=0, xContador=0;
    	float x, xSoma=0, xMenor=0;

    	System.out.println("Digite [ 0 ] para encerrar!!!!!!!!!!!! ");

    	do{
    		System.out.println("Entre com um número: ");
    		x = scan.nextFloat();

    		if(x != 0){

    			if(x > 5){
    				xSoma += x;
    			}
    			else{
    				xMenor += x;
    			}

    			xContador++;

    		}
    		else{
    			cont ++;
    		}
    	}while(cont==0);

		System.out.printf("\nQuantidade de números: %d \nSoma de X maior que 5: %.2f \nSoma de X menor que 5: %.2f", xContador, xSoma, xMenor);


    }


}
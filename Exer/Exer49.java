import java.util.Scanner;

public class Exer49 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner(System.in);

    	int x=1;
    	float somaP =0, somaN =0;

    	System.out.println("====== Digite [0] para encerrar ========");

    	while(x!= 0){

    		System.out.print("Entre com o número: ");

    		if(x>0){
    			somaP += x;
    		}
    		else{
    			somaN += x;
    		}
    	}

    	System.out.printf("Soma positvios: %.2f \nSoma negativos: %.2f", somaP, somaN);
    }


}
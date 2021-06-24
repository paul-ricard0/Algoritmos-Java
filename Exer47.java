import java.util.Scanner;

public class Exer47 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int count=1;
    	float num, somaP=0, somaN=0,qtdP=0, qtdN=0;

    	System.out.println("Escreva 15 números!!!!!!!!!");

    	do{

    		System.out.printf("Entre com o %dº número: \n", count);
    		num = scan.nextFloat();

    		if(num !=0 ){
    			if(num>0){
    				somaP+=num;
    				qtdP++;
    			}
    			else{
    				somaN+=num;
    				qtdN++;
    			}
    		}
    		else{
    			count--;
    		}
			count++;
    	}while(count<=4);

    	System.out.printf("Quantidade de positivos: %s \nSoma de todos os positivos: %.2f \n", qtdP, somaP);

    	System.out.printf("\n Quantidade de negativo: %s \nSoma de todos os negativos: %.2f", qtdN, somaN);
    }


}
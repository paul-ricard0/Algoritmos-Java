import java.util.Scanner;

public class Exer40 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int i;
    	float num, valP=0, cntP=0, valN=0, cntN=0, m;

    	for(i=1; i<=5; i++){

    		System.out.println("Entre com um n�mero: ");
    		num=scan.nextFloat();

    		if(num != 0){

    			if(num>0){
    				valP += num;
    				cntP++;
    			}
    			else{
    				valN +=num;
    				cntN++;|
    			}

    		}
    		else{
    			i--;
    		}
    	}

    	m = valP / cntP;
    	System.out.printf("A m�dia dos n�meros positivos � %.2f", m);
    	m = valN / cntP;
    	System.out.printf("\nA m�dia dos n�meros negativos � %.2f", m);


    }


}
import java.util.Scanner;


public class Exer59 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);


    	int vet[] = new int[5], maior=0;

    	for(int c=0; c<vet.length; c++){
    		System.out.print("Entre com o valor: ");
    		vet[c]=scan.nextInt();
    	}

    	for(int c=0; c<vet.length; c++){

    		if(vet[c]>maior){
    			maior = vet[c];
    		}
    	}

    	System.out.print("\no maior valor é "+maior);
    }


}
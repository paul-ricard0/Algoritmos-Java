import java.util.Scanner;


public class Exer58 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	float preco[] = new float[2];

    	for(int c=0; c<preco.length; c++){
    		System.out.print("Entre com os preços: ");
    		preco[c]=scan.nextFloat();
    	}

    	for(int t=0; t<preco.length; t++){
    		float aumento = preco[t] * 0.1f;
    		preco[t] = preco[t] + aumento;
    		System.out.println(preco[t]+ " ");
    	}



    }


}
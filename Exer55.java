import java.util.Scanner;


public class Exer55 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	String nomes[] = new String[8];

    	for(int c=0; c<nomes.length; c++){
    		System.out.print("Entre com o nome: ");
    		nomes[c] = scan.nextLine();

    	}

    	for (int j = nomes.length - 1; j >= 0; j--) {
            System.out.print(nomes[j] + " ");
        }

    }




}
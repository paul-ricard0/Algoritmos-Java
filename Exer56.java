import java.util.Scanner;


public class Exer56 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);


    	String nomes[] = new String[8], invertido[] = new String[8];

    	for(int c=0; c<nomes.length; c++){
    		System.out.print("Entre com o nome: ");
    		nomes[c] = scan.nextLine();
    	}
		int c=0;
		for (int j = nomes.length - 1; j >= 0; j--) {
            invertido[c] = nomes[j];
            c++;
        }

		for(int r=0; r<nomes.length; r++){
			System.out.print(invertido[r]+ " ");
    	}


    }


}
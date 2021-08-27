import java.util.Scanner;

public class CursoEmVideo_Vetor01 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);


		/* Declarando o vetor */
    	int vet[] = {3, 2, 8, 7, 5, 4};


		/* Mostrando o tamanho do vetor */
		System.out.println("O tamanho do meu vetor é " + vet.length);


		/* Lendo o vetor */
    	for (int c=0; c<=5; c++){

    		System.out.println("Na posição "+ c + " temos o valor: " + vet[c]);

    	}


		/* Uma forma mais inteligênte de ler o vetor */
		for (int c=0; c<= vet.length - 1 ; c++){			/* Uso o length*/

    		System.out.println("Lendo com length temos: " + vet[c]);

    	}




    }


}
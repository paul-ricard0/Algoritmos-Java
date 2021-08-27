import java.util.Scanner;


import java.util.Arrays;    /*PRESTA ATENÇÃO AQUI, ESTOU IMPORTANDO A CLASSE ARRRYS */

public class CursoEmVideo_Vetor04 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);



    	/* FAZENDO UMA BUSCA NO VETOR */

    	int vet[] = {3, 7, 6, 1, 9, 4, 2};

    	for(int X : vet){
    		System.out.print(v + " ");
    	}
    	System.out.println(" ");
    	´

    	/* Estou procurando o valor 1 no vetor vet*/
    	int pos = Arrays.binarySearch(vet, 1);

    	System.out.println("Encontrei o valor 1 na posição "+ pos);


    }


}

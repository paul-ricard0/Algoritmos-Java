import java.util.Scanner;

public class CursoEmVideo_Vetor03 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	/* A MELHOR FORMA DE LER UM VETOR */

    	double v[] = {3.5, 2.75, 9, -4.5};

    	/*for it */
    	for(double valor: v){			/*VALOR vai valer o que tem dentro de cada casa de v */
    		System.out.print(valor + " ");
    	}

    }


}
import java.util.Scanner;

public class CursoEmVideo_Vetor02 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

		/* LENDO TODOS OS MÊS E MOSTRANDO QUANTOS DIAS ELE POSSUI */


		String mes[] = {"Jan", "Feve", "Mar", "Abr", "Mai", "Jun",
						"Jul", "Ago", "Set", "Out", "Nov", "Dez"};

		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for(int c = 0; c<mes.length ; c++){

			System.out.println("O mês de "+ mes[c] +" tem " + dias[c] +" dias");
		}

    }


}
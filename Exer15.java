import java.util.Scanner;


public class Exer15 {

    public static void main (String[]args) {

    	Scanner scn = new Scanner (System.in);

    	String time1 , time2;
    	int gol1 , gol2;

    	System.out.println("Qual o nome do primeiro time:");
    	time1 = scn.nextLine();

    	System.out.println("Quantos gols fez " + time1 + "?");
    	gol1 = scn.nextInt();

		scn = new Scanner (System.in);

    	System.out.println("Qual o nome do sengundo time?");
    	time2 = scn.nextLine();

    	System.out.println("Quantos gols fez " + time2 + "?");
    	gol2 = scn.nextInt();

		if (gol1 > gol2){
			System.out.println(time1 + " foi o vencedor com uma diferença de " + (gol1 - gol2) + " gols");
		}
		else if(gol2 > gol1){
			System.out.println(time2 + " foi o vencedor com uma diferença de " + (gol2 - gol1) + " gols");
		}
		else{
			System.out.println("Empate");
		}
    }
}
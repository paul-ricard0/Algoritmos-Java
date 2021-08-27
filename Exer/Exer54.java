import java.util.Scanner;


public class Exer54 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);


		int vet1[] = {5, 10, 15, 30, 45, 60, 75, 90, 105, 120};
		int vet2[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 10000};
		int vetSoma[] = new int [10];


		for(int c=0; c<vetSoma.length; c++){
			vetSoma[c] = vet1[c] + vet2[c];
			System.out.print(vetSoma[c] + " ");
		}


    }


}
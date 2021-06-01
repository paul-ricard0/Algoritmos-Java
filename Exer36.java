import java.util.Scanner;


public class Exer36 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

		int newIdade, idade21=0, idadeMeio=0, idade50=0, counter=0;

		while (counter<10){

			if(counter==0){
				System.out.print("Entre com 10 números: ");
				newIdade = scan.nextInt();
			}
			else{
    			System.out.print("\nEntre com mais um número: ");
    			newIdade = scan.nextInt();
			}


			if(newIdade<21){
				idade21= idade21+newIdade;
			}
			else if(newIdade>50){
				idade50= idade50+newIdade;
			}
			else{
				idadeMeio= idadeMeio+newIdade;
			}

			counter++;

			System.out.printf("\nVocê já entro com "+ counter);
		}

		System.out.print("\n \nA soma das idades das pessoas com menos de 21 anos é "+idade21);

		System.out.print("\n \nA soma das idades das pessoas com mais de 50 anos é "+idade50);

		System.out.print("\n \nA soma das idades dos demais é "+idadeMeio);
    }


}
import java.util.Scanner;

public class Exer44 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

		int cont=0, XContador=0;
		float X, XSoma=0, XMedia;

		System.out.println("Digite [ 0 ] para encerrar!!!!!!!!!!!!");

		do{
			System.out.println("Entre com um número: ");
			X = scan.nextFloat();

			if(X != 0){
				XSoma += X;
				XContador++;
			}
			else{
				cont=1;
			}
		}while(cont==0);

		XMedia = XSoma / XContador;
		System.out.printf("Quantidade de números: %d \nSoma dos números: %.2f \nMédia dos números: %.2f", XContador, XSoma, XMedia);

    }


}
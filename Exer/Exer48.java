import java.util.Scanner;

public class Exer48 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	int X=0, qtdPar=0, qtdImpar = 0;

    	System.out.println("====== Digite -1 para finalizar ======");

    	while(X!=-1){
    		System.out.print("Entre com os n�meros: ");
    		X = scan.nextInt();
    		if((X % 2) == 0){
    			qtdPar++;
    		}
    		else{
    			qtdImpar++;
    		}
    	}
		qtdImpar--;
    	System.out.printf("\nQuantidade de n�meros Pares: %d \nQuantidade de n�meros impares: %d", qtdPar, qtdImpar);



    }


}
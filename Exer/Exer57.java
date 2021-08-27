import java.util.Scanner;


public class Exer57 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);


		int x[] = new int[2];
		int y[] = new int[2];
		int z[] = new int[4];
		int c=0, t=0;
		for(c=0; c<x.length; c++){
			System.out.print("Entre com um valor para X: ");
    		x[c] = scan.nextInt();
    		z[c] = x[c];
		}

		for(t=0; t<y.length; t++){
			System.out.print("Entre com um valor para Y: ");
    		y[t] = scan.nextInt();
    		z[t+c] = y[t];
		}

		for(c=0; c<z.length; c++){
			System.out.print(z[c] + " ");
		}




    }


}
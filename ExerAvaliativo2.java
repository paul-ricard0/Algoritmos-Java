import java.util.Scanner;

public class ExerAvaliativo {

    public static void main (String[]args) {

    	Scanner scn = new Scanner (System.in);

    	double credito, juros, saldo;

    	System.out.println("Qual o saldo m�dio no �tilmo ano? ");
    	saldo = scn.nextDouble();

    	if ( saldo <= 2000){
    		credito = saldo * 0.1;
    		juros = saldo * 0.05;
    	}
    	else if(saldo <= 3000){
    		credito = saldo * 0.15;
    		juros = saldo * 0.1;
    	}
    	else if(saldo <= 4000){
    		credito = saldo * 0.2;
    		juros = saldo * 0.15;
    	}
    	else{
    		credito = saldo * 0.25;
    		juros = saldo * 0.2;
    	}

    	System.out.println("Com o saldo m�dio de " + saldo + " o valor de cr�dito � "+ credito +" e o valor do juros � de " + juros);

    }
}
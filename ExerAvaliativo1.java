import java.util.Scanner;

public class ExerAvaliativo1 {

    public static void main (String[]args) {

    	Scanner scn = new Scanner (System.in);

    	float fabrica, imposto, distribuidora, consumidor;

    	System.out.println("Entre com o valor de f�brica do ve�culo: ");
    	fabrica = scn.nextFloat();

    	if( fabrica <= 15000){
    		distribuidora = fabrica * 0.1f;
    		imposto = fabrica * 0.35f;
    	}
    	else if( fabrica <= 20000){
    		distribuidora = fabrica * 0.11f;
    		imposto = fabrica * 0.40f;
    	}
    	else if( fabrica <= 40000){
    		distribuidora = fabrica * 0.12f;
    		imposto = fabrica * 0.45f;
    	}
    	else{
    		distribuidora = fabrica * 0.13f;
    		imposto = fabrica * 0.50f;
    	}

		consumidor = fabrica + imposto + distribuidora;

    	System.out.printf("Com o valor de fabrica de %.2f, o valor do impostos s�o %.2f, o valor \nda distribuidora � de %.2f, e o valor a seer pago pela consumidor � de %.2f", fabrica, imposto, distribuidora, consumidor);
    }


}
import java.util.Scanner;

public class Exer29 {

    public static void main (String[]args) {

    	Scanner scn = new Scanner (System.in);

    	int num, dias;
    	String mes, feve = "28 ou 29";

    	System.out.println("Entre com um número do mês: ");
		num = scn.nextInt();
    	if(num == 1){
    		mes = "Janeiro";
    	}
		else if (num == 2){
			mes = "Fevereiro";
		}
		else if (num == 3){
			mes = "Março";
		}
		else if (num == 4){
			mes = "Abril";
		}
		else if (num == 5){
			mes = "Maio";
		}
		else if (num == 6){
			mes = "Junho";
		}
		else if (num == 7){
			mes = "Julho";
		}
		else if (num == 8){
			mes = "Agosto";
		}
		else if (num == 9){
			mes = "Setembro";
		}
		else if (num == 10){
			mes = "Otubro";
		}
		else if (num == 11){
			mes = "Novembro";
		}
		else{
			mes = "Dezembro";
		}

		if ( num == 1 ||num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12){
			dias = 31;
		}
		else{
			dias =  30;
		}

		if (num == 2){
			System.out.print("O mês é "+ mes +" e possui "+ feve +" dias");
		}
		else if (num >= 1 && num <= 12){
			System.out.println("O mês é "+ mes +" e possui "+ dias +" dias");
		}
		else{
			System.out.println("Mês inválido!!!!!!!!!!!!!!!!!!");
		}
    }


}
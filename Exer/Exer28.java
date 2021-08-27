import java.util.Scanner;

public class Exer28 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		int num;
		String mes = "Alo";

		System.out.println("Entre com o númerod o mês: ");
		num = scn.nextInt();

		if (num == 1){
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

		if(num >= 1 && num <= 12){
			System.out.println("O mes é " + mes);
		}
		else{
			System.out.println("Desculpe, mas esse nmúmero não é compatível com nenhum mês");
		}



	}
}
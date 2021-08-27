import java.util.Scanner;

public class Exer17 {

    public static void main (String[]args){

    	Scanner scn = new Scanner (System.in);

    	int idade;

    	System.out.println("Qual a idade do nadador? ");
    	idade= scn.nextInt();

    	if (idade < 5){
    		System.out.println("Fora da Faixa");
    	}
    	else if (idade>= 5 && idade<= 12){
    		System.out.println("Categoria Infatil");
    	}
    	else if (idade>= 13 && idade<= 17){
    		System.out.println("Categoria Juvenil");
    	}
    	else if (idade>= 18 && idade<= 25){
    		System.out.println("Categoria Profissional");
    	}
    	else{
    		System.out.println("Fora da faixa");
    	}
    }
}
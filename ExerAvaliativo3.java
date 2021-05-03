import java.util.Scanner;

public class ExerAvaliativo3 {

    public static void main (String[]args){

    	Scanner scn = new Scanner(System.in);

    	int idade;
    	float valorFinal, desconto, valorSemDesconto;

    	System.out.print("Entre com a sua idade: ");
    	idade = scn.nextInt();

    	if (idade <= 10){
    		valorSemDesconto = 100;
    		desconto = valorSemDesconto * 0.35f;
    		valorFinal = valorSemDesconto - desconto;
    	}
    	else if (idade <= 29){
    		valorSemDesconto = 150;
    		desconto = valorSemDesconto * 0.3f;
    		valorFinal = valorSemDesconto - desconto;
    	}
    	else if (idade <= 45){
    		valorSemDesconto = 200;
    		desconto = valorSemDesconto * 0.25f;
    		valorFinal = valorSemDesconto - desconto;
    	}
    	else if (idade <= 59){
    		valorSemDesconto = 250;
    		desconto = valorSemDesconto * 0.2f;
    		valorFinal = valorSemDesconto - desconto;
    	}
    	else if (idade < 65){
    		valorSemDesconto = 300;
    		desconto = valorSemDesconto * 0.15f;
    		valorFinal = valorSemDesconto - desconto;
    	}
    	else{
    		valorSemDesconto = 400;
    		desconto = valorSemDesconto * 0.10f;
    		valorFinal = valorSemDesconto - desconto;
    	}

    	System.out.printf("Com %d \nO valor a ser pagado sem desconto é de %.2f \nCom desconto de %.2f \nO valor final a com desconto fica %.2f", idade, valorSemDesconto, desconto, valorFinal);
    }
}
import java.util.Scanner;

public class Exer46 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

    	String desc, FIM;
    	int count=0, qtd, qtdtt=0;
    	float preco, valtt=0;

    	do{

    		System.out.println("Me fale a descrição do produto: ");
    		desc = scan.nextLine();

    		System.out.println("O preço unitário: ");
    		preco = scan.nextFloat();

    		System.out.println("Quantidade: ");
    		qtd = scan.nextInt();

    		valtt += preco * qtd;
			qtdtt += qtd;


			scan = new Scanner (System.in);
			System.out.println("Digite <MAIS> para fazer mais uma compra \nOU \nDigite <FIM> para finalizar a compra");
			FIM = scan.nextLine();


    		if("FIM".equals(FIM)){
    			count++;
    		}
    	}while(count!=1);

    	System.out.printf("Quantidade total de itens: %d \nValor total: %.2f", qtdtt, valtt);
    }


}
import java.util.Scanner;

public class Exer49 {

    public static void main (String[]args) {

    	Scanner scan = new Scanner (System.in);

		String nome = " ";
		int qtdAp=0, qtdRe=0, qtdAluno=0;
    	float media=0, nota=0, notaTotal;


    	do{
    		System.out.print("Entre com o nome do aluno: ");
    		nome = scan.nextLine();
    		qtdAluno++;

    		nota = 0;
    		System.out.print("Entre com a primeira nota do aluno: ");
    		nota = scan.nextFloat();
    		System.out.print("Entre com a segunda nota do aluno: ");
    		nota += scan.nextFloat();
    		System.out.print("Entre com a terceira nota do aluno: ");
    		nota += scan.nextFloat();

    		if (nota >= 60){
    			qtdAp++;
    		}
    		else{
    			qtdRe++;
    		}
    		notaTotal += nota;

    	}while(!"FIM".equals(nome));

    	media = notaTotal / qtdAluno;
    	System.out.printf("A média %.2f, total de alunos %s", media, qtdAluno);
    }


}
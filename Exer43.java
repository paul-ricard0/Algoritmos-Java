import java.util.Scanner;

public class Exer43 {

    public static void main (String[]aargs){

    	Scanner scan = new Scanner (System.in);

		String nome="a";
		int counter=0, qtdApro=0, qtdRepro=0;
		float nota, somaNota=0, somaClasse=0, mediaClasse;

		for(counter=1; counter<=2; counter++){


			System.out.printf("\nEntre com a nome do %d� aluno: ", counter);
			nome=scan.nextLine();

			System.out.print("Entre com a 1� nota do aluno: ");
			nota=scan.nextFloat();
			somaNota += nota;

			System.out.print("Entre com a 2� nota do aluno: ");
			nota=scan.nextFloat();
			somaNota += nota;

			System.out.print("Entre com a 3� nota do aluno: ");
			nota=scan.nextFloat();
			somaNota += nota;

			if(somaNota >= 60){
				qtdApro++;
				somaClasse += somaNota;
			}
			else{
				qtdRepro++;
				somaClasse += somaNota;
			}


		}

		mediaClasse = somaClasse / (qtdApro + qtdRepro);
		System.out.printf("\nA m�dia da classe � %.2f", mediaClasse);

		System.out.printf("\nA quantidade de alunos aprovados � %d \nA quantidade de alunos reprovados � %d", qtdApro, qtdRepro);


    }


}
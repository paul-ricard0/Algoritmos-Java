import java.util.Scanner;

public class Exer42 {

    public static void main (String[]aargs) {

    	Scanner scan = new Scanner (System.in);

    	int counter, counterNotaMaior=0,counterNotaMenor=0, idade,
    		somaIdade=0, counterIdadeMaior=0, counterIdadeMenor=0;

    	float nota, notaM, somaNota=0, idadeM;

    	for(counter=1; counter<=30; counter++){

    		//NOTA
    		System.out.printf("\nEntre com a nota do %dº aluno: ", counter);
    		nota=scan.nextFloat();

    		if(nota>70){
    			counterNotaMaior++;
    			somaNota += nota;
    		}
    		else{
    			counterNotaMenor++;
    			somaNota += nota;
    		}

    		//IDADE
    		System.out.print("Qual a idade desse aluno? ");
    		idade=scan.nextInt();

    		if(idade>20){
    			counterIdadeMaior++;
    			somaIdade += idade;
    		}
    		else{
    			counterIdadeMenor++;
    			somaIdade += idade;
    		}

    	}

    	notaM = somaNota / (counterNotaMaior + counterNotaMenor);
    	System.out.printf("\n \n%d alunos tiveram nota maior que 70 pontos \n%d alunos tiveram nota menor que 70 pontos", counterNotaMaior, counterNotaMenor);
    	System.out.printf("\nA média das notas dos alunos é %.2f\n", notaM);

    	idadeM = somaIdade / (counterIdadeMaior + counterIdadeMenor);
    	System.out.printf("\n%d alunos tem mais de 20 anos \n%d alunos tem menos de 20 anos", counterIdadeMaior, counterIdadeMenor);
    	System.out.printf("\nA média das idade dos alunos é %.2f", idadeM);




    }

}
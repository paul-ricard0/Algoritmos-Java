import java.util.Scanner;

public class Exer27 {

	public static void main (String[]args){

		Scanner scn = new Scanner (System.in);

		String nome,doutor;
		int idade;

		System.out.println("Entre com o nome do paciente:");
		nome = scn.nextLine();

		System.out.println("Entre com a idade do paciente:");
		idade = scn.nextInt();

		if (idade < 12){
			doutor= "Pediatia";
		}
		else if (idade < 60) {
			doutor = "Clínica Geral";
		}
		else{
			doutor = "Geriatra";
		}

		System.out.println("O paciente " + nome + " de " + idade + " será atendido pelo " + doutor);
	}
}
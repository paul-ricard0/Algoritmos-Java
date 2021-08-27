public class Exemplo_03 {

	public static void main (String[] args) {

		int n = 10;
		double valor = 20.3;

		System.out.println("O valor inteiro: " + n); // com println concatena com +
		System.out.printf("O valor real: %7.2f \n", valor); // com printf concatena com ,
	}             // Na aula do dia 15, segunda parte, ela explica a formatação do %7.2f por volta de 30min
}				// printf faz uma sociação com formatação e aceita \n (lembra do f no final que lembra formatação)
				// float só aceita ser escrito com printf
import java.util.Scanner;

public class Exer04 {
	public static void main ( String[] args){

    	Scanner scn = new Scanner(System.in);

    	double nota1, nota2, nota3, result;

    	System.out.println("Entre com suas 3 notas:" );
    	nota1=scn.nextdouble();
    	nota2=scn.nextdouble();
    	nota3=scn.nextdouble();
    	result=(nota1 + nota2 + nota3) / 3;

    	System.out.println("A média da suas notas é: " + result);
	}
}
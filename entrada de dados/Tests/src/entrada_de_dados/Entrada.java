package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite uma sauda��o");
//		String saudacao;
//		saudacao = sc.nextLine();
//		System.out.println("Ol� amigos , "  + saudacao);
		
		// se imprimir com virgula defina:
		 Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		double salario;
		salario = sc.nextDouble();
    	System.out.println("Seu salario � : R$"  + salario);
		
		
		
		sc.close();
	}

}
